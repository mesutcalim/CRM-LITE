package com.etiya.crmlite.core.util.mapper;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    ModelMapper getMapperforRequest();
    ModelMapper getMapperforResponse();

}
