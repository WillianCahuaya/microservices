package com.bsoftgroup.springcloudmsmanagement.mapper;

public interface Mapper<E, M> {

    M toModel(E e);

    E toEntity(M m);

}
