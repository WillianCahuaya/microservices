package com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.mapper;

import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.dto.ClientDto;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.dto.ProductDto;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.dto.ServiceDto;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ClientModel;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ProductModel;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ServiceModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class ServiceMapper implements Mapper<ServiceModel, ServiceDto> {

    @Override
    public ServiceDto toDto(ServiceModel m) {
        if (Objects.isNull(m)) return null;
        ServiceDto d = new ServiceDto();
        d.setId(m.getId());
        d.setStatus(m.getStatus());
        d.setAmount(m.getAmount());
        ClientDto client = new ClientDto();
        if (Objects.nonNull(m.getClient())) {
            client.setId(m.getClient().getId());
            client.setFullname(m.getClient().getFullname());
        }
        d.setClient(client);
        ProductDto product = new ProductDto();
        if (Objects.nonNull(m.getProduct())) {
            product.setId(m.getProduct().getId());
            product.setDescription(m.getProduct().getDescription());
        }
        d.setProduct(product);
        return d;
    }

    @Override
    public List<ServiceDto> toDto(List<ServiceModel> models) {
        List<ServiceDto> dtos = new ArrayList<>();
        for (ServiceModel m: models) {
            dtos.add(toDto(m));
        }
        return dtos;
    }

    @Override
    public ServiceModel toModel(ServiceDto d) {
        if (Objects.isNull(d)) return null;
        ServiceModel m = new ServiceModel();
        m.setId(d.getId());
        m.setStatus(d.getStatus());
        m.setAmount(d.getAmount());
        ClientModel client = new ClientModel();
        if (Objects.nonNull(d.getClient())) {
            client.setId(d.getClient().getId());
            client.setFullname(d.getClient().getFullname());
        }
        m.setClient(client);
        ProductModel product = new ProductModel();
        if (Objects.nonNull(d.getProduct())) {
            product.setId(d.getProduct().getId());
            product.setDescription(d.getProduct().getDescription());
        }
        m.setProduct(product);
        return m;
    }

    @Override
    public List<ServiceModel> toModel(List<ServiceDto> dtos) {
        List<ServiceModel> models = new ArrayList<>();
        for (ServiceDto d: dtos) {
            models.add(toModel(d));
        }
        return models;
    }
}
