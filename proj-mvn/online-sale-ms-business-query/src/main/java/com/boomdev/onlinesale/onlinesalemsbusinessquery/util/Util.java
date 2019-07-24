package com.boomdev.onlinesale.onlinesalemsbusinessquery.util;

import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.dto.ClientDto;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.dto.ProductDto;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.dto.ServiceDto;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ClientModel;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ProductModel;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ServiceModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Util {

    public static List<ServiceDto> passListServicesModelToServicesDto(List<ServiceModel> servicesModel) {
        ArrayList servicesDto = new ArrayList();
        Iterator<ServiceModel> iteratorServices = servicesModel.iterator();

        while (iteratorServices.hasNext()) {

            ServiceModel serviceModel = iteratorServices.next();
            ServiceDto serviceDto = new ServiceDto();

            serviceDto.setId(serviceModel.getId());
            serviceDto.setStatus(serviceModel.getStatus());
            serviceDto.setAmount(serviceModel.getAmount());

            ClientDto clientDto = new ClientDto();
            if (serviceModel.getClient() != null) {
                clientDto.setFullname(serviceModel.getClient().getFullname());
                clientDto.setId(serviceModel.getClient().getId());
            }
            serviceDto.setClient(clientDto);

            ProductDto productDto = new ProductDto();
            productDto.setId(serviceModel.getProduct().getId());
            productDto.setDescription(serviceModel.getProduct().getDescription());
            serviceDto.setProduct(productDto);
            servicesDto.add(serviceDto);
        }

        return servicesDto;
    }

    public static ServiceModel passServiceDtoToServiceModel(ServiceDto serviceDto) {
        ServiceModel serviceModel = new ServiceModel();

        serviceModel.setStatus(serviceDto.getStatus());
        serviceModel.setAmount(serviceDto.getAmount());

        if (serviceDto.getId() != null)
            serviceModel.setId(serviceDto.getId());

        ClientModel clientModel = new ClientModel();
        if (serviceDto.getClient() != null) {
            clientModel.setFullname(serviceDto.getClient().getFullname());
            clientModel.setId(new Integer(serviceDto.getClient().getId()));
        }
        serviceModel.setClient(clientModel);

        ProductModel productModel = new ProductModel();
        if (serviceDto.getProduct() != null) {
            productModel.setId(new Integer(serviceDto.getProduct().getId()));
            productModel.setDescription(serviceDto.getProduct().getDescription());
        }
        serviceModel.setProduct(productModel);

        return serviceModel;

    }

}
