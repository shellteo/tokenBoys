package com.service;

import com.entity.ElaInfo;

import java.util.List;

public interface ElaService {

    void insertElaInfo(ElaInfo elaInfo);

    List<ElaInfo> selectElaInfoList();

    ElaInfo selectElaInfo(String id);
}
