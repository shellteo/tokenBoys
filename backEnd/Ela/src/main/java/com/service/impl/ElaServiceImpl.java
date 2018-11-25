package com.service.impl;

import com.entity.ElaInfo;
import com.mapper.ElaMapper;
import com.service.ElaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ElaServiceImpl implements ElaService {

    @Resource
    private ElaMapper elaMapper;

    @Override
    public void insertElaInfo(ElaInfo elaInfo) {

        elaMapper.insertElaInfo(elaInfo);
    }

    @Override
    public List<ElaInfo> selectElaInfoList() {

        return elaMapper.selectElaInfoList();
    }

    @Override
    public ElaInfo selectElaInfo(String id) {

        return elaMapper.selectElaInfo(id);
    }
}
