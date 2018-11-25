package com.controller;

import com.base.BaseResponse;
import com.entity.ElaInfo;
import com.service.ElaService;
import com.util.FileUtil;
import com.util.IpfsUtil;
import com.util.UuidUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/ela")
public class ElaController {

    private String ipfsUrl = "http://localhost:8080/ipfs/";

    @Resource
    private ElaService elaService;

    @RequestMapping("/setElaInfo")
    @ResponseBody
    public BaseResponse setElaInfo(@RequestBody ElaInfo elaInfo){

        BaseResponse response = new BaseResponse();
        try {
            String uuid = UuidUtil.getUuid();
            elaInfo.setId(uuid);
            elaInfo.setUserName(uuid);
            elaInfo.setMakeTime(new Date());
            //写入文档中
            File file = FileUtil.write(elaInfo);
            //保存至ipfs
            String hash = IpfsUtil.addFile(file);
            elaInfo.setElaHash(hash);
            elaInfo.setElaUrl(ipfsUrl + hash);
            elaInfo.setDeleteFlag("0");
            //保存至数据库
            elaService.insertElaInfo(elaInfo);
            response.setData(elaInfo);
            response.setCode("200");
            response.setMessage("success");
        } catch (Exception e){
            e.printStackTrace();
            response.setCode("500");
            response.setMessage("fail");
        }
        return response;
    }

    @RequestMapping("/getElaInfoList")
    @ResponseBody
    public BaseResponse getElaInfoList(){

        BaseResponse response = new BaseResponse();
        try {
            List<ElaInfo> elaInfoList = elaService.selectElaInfoList();
            response.setData(elaInfoList);
            response.setCode("200");
            response.setMessage("success");
        } catch (Exception e){
            e.printStackTrace();
            response.setCode("500");
            response.setMessage("fail");
        }
        return response;
    }

    @RequestMapping(value = "/getElaInfo", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse getElaInfo(String id){

        BaseResponse response = new BaseResponse();
        try {
            ElaInfo elaInfo = elaService.selectElaInfo(id);
            response.setData(elaInfo);
            response.setCode("200");
            response.setMessage("success");
        } catch (Exception e){
            e.printStackTrace();
            response.setCode("500");
            response.setMessage("fail");
        }
        return response;
    }
}
