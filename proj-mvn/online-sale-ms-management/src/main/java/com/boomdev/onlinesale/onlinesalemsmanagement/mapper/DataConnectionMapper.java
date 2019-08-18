package com.boomdev.onlinesale.onlinesalemsmanagement.mapper;

import com.boomdev.onlinesale.onlinesalebeanbusiness.entity.configuration.DataConnectionEntity;
import com.boomdev.onlinesale.onlinesalebeanbusiness.model.configuration.DataConnectionModel;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DataConnectionMapper implements Mapper<DataConnectionEntity, DataConnectionModel>{
    
    @Override
    public DataConnectionModel toModel(DataConnectionEntity e) {
        if(Objects.isNull(e)) return null;
        DataConnectionModel m = new DataConnectionModel();
        m.setDriverclassname(e.getDriverclassname());
        m.setUrl(e.getUrl());
        m.setUsername(e.getUsername());
        m.setPassword(e.getPassword());
        return m;
    }

    @Override
    public DataConnectionEntity toEntity(DataConnectionModel m) {
        if(Objects.isNull(m)) return null;
        DataConnectionEntity e = new DataConnectionEntity();
        e.setDriverclassname(m.getDriverclassname());
        e.setUrl(m.getUrl());
        e.setUsername(m.getUsername());
        e.setPassword(m.getPassword());
        return e;
    }
}
