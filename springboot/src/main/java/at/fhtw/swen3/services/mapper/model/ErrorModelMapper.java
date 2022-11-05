package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.persistence.entities.ErrorEntity;
import at.fhtw.swen3.services.dto.Error;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ErrorModelMapper extends BaseModelMapper<ErrorEntity, Error>{
    ErrorModelMapper INSTANCE = Mappers.getMapper(ErrorModelMapper.class);
}
