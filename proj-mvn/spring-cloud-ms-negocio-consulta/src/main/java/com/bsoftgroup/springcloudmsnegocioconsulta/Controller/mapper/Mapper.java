package com.bsoftgroup.springcloudmsnegocioconsulta.Controller.mapper;

import java.util.List;

public interface Mapper<M, D> {

    D toDto(M m);

    List<D> toDto(List<M> models);

    M toModel(D d);

    List<M> toModel(List<D> dtos);
}
