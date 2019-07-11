package com.bsoftgroup.springcloudmsnegocioconsulta.util;

import com.bsoftgroup.springcloudmsnegocioconsulta.Controller.dto.ClientDto;
import com.bsoftgroup.springcloudmsnegocioconsulta.Controller.dto.ProductDto;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ClientModel;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ProductModel;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ServiceModel;
import com.bsoftgroup.springcloudmsnegocioconsulta.Controller.dto.ServiceDto;

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

            serviceDto.setCode(serviceModel.getCode());
            serviceDto.setStatus(serviceModel.getStatus());
            serviceDto.setAmount(serviceModel.getAmount());

            ClientDto clientDto = new ClientDto();
            if (serviceModel.getClient() != null) {
                clientDto.setName(serviceModel.getClient().getName());
                clientDto.setCode(serviceModel.getClient().getCode());
            }
            serviceDto.setClient(clientDto);

            ProductDto productDto = new ProductDto();
            productDto.setCode(serviceModel.getProduct().getCode());
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

        if (serviceDto.getCode() != null)
            serviceModel.setCode(serviceDto.getCode());

        ClientModel clientModel = new ClientModel();
        if (serviceDto.getClient() != null) {
            clientModel.setName(serviceDto.getClient().getName());
            clientModel.setCode(new Integer(serviceDto.getClient().getCode()));
        }
        serviceModel.setClient(clientModel);

        ProductModel productModel = new ProductModel();
        if (serviceDto.getProduct() != null) {
            productModel.setCode(new Integer(serviceDto.getProduct().getCode()));
            productModel.setDescription(serviceDto.getProduct().getDescription());
        }
        serviceModel.setProduct(productModel);

        return serviceModel;

    }

}
