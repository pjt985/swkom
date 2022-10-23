package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.ErrorEntityModel;
import at.fhtw.swen3.services.dto.Error;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ErrorModelMapper extends BaseModelMapper<ErrorEntityModel, Error>{
    ErrorModelMapper INSTANCE = Mappers.getMapper(ErrorModelMapper.class);
}
