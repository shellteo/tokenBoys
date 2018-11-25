package com.mapper;

import com.entity.ElaInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElaMapper {

    void insertElaInfo(ElaInfo elaInfo);

    List<ElaInfo> selectElaInfoList();

    ElaInfo selectElaInfo(String id);
}
