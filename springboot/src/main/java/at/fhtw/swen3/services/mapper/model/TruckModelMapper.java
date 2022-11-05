package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.persistence.entities.TruckEntity;
import at.fhtw.swen3.services.dto.Truck;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TruckModelMapper extends BaseModelMapper<TruckEntity, Truck>{
    TruckModelMapper INSTANCE = Mappers.getMapper(TruckModelMapper.class);
}
