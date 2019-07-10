package com.boomdev.onlinesale.onlinesalemsmanagement.mapper;

import com.boomdev.onlinesale.onlinesalemsmanagement.entity.DataSourceEntity;
import com.boomdev.onlinesale.onlinesalemsmanagement.model.DataConnectionModel;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DataConnectionMapper implements Mapper<DataSourceEntity, DataConnectionModel>{
    
    @Override
    public DataConnectionModel toModel(DataSourceEntity e) {
        if(Objects.isNull(e)) return null;
        DataConnectionModel m = new DataConnectionModel();
        m.setDriverclassname(e.getDriverclassname());
        m.setUrl(e.getUrl());
        m.setUsername(e.getUsername());
        m.setPassword(e.getPassword());
        return m;
    }

    @Override
    public DataSourceEntity toEntity(DataConnectionModel m) {
        if(Objects.isNull(m)) return null;
        DataSourceEntity e = new DataSourceEntity();
        e.setDriverclassname(m.getDriverclassname());
        e.setUrl(m.getUrl());
        e.setUsername(m.getUsername());
        e.setPassword(m.getPassword());
        return e;
    }
}
