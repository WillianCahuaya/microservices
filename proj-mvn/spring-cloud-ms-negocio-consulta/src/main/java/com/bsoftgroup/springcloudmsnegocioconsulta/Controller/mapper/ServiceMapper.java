package com.bsoftgroup.springcloudmsnegocioconsulta.Controller.mapper;

import com.bsoftgroup.springcloudmsnegocioconsulta.Controller.dto.ClientDto;
import com.bsoftgroup.springcloudmsnegocioconsulta.Controller.dto.ProductDto;
import com.bsoftgroup.springcloudmsnegocioconsulta.Controller.dto.ServiceDto;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ClientModel;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ProductModel;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ServiceModel;
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
        d.setCode(m.getCode());
        d.setStatus(m.getStatus());
        d.setAmount(m.getAmount());
        ClientDto client = new ClientDto();
        if (Objects.isNull(m.getClient())) {
            client.setCode(m.getClient().getCode());
            client.setName(m.getClient().getName());
        }
        d.setClient(client);
        ProductDto product = new ProductDto();
        if (Objects.isNull(m.getProduct())) {
            product.setCode(m.getProduct().getCode());
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
        m.setCode(d.getCode());
        m.setStatus(d.getStatus());
        m.setAmount(d.getAmount());
        ClientModel client = new ClientModel();
        if (Objects.isNull(d.getClient())) {
            client.setCode(d.getClient().getCode());
            client.setName(d.getClient().getName());
        }
        m.setClient(client);
        ProductModel product = new ProductModel();
        if (Objects.isNull(d.getProduct())) {
            product.setCode(d.getProduct().getCode());
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
