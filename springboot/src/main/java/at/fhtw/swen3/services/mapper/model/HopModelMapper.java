package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.persistence.entities.HopEntity;
import at.fhtw.swen3.services.dto.Hop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HopModelMapper {
    HopModelMapper INSTANCE = Mappers.getMapper(HopModelMapper.class);


//    Hop entityToDto(HopEntity hopEm);
//    HopEntity dtoToEntity(Hop hop);
}
