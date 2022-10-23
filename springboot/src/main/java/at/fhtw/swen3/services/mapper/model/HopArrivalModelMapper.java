package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.HopArrivalEntityModel;
import at.fhtw.swen3.services.dto.HopArrival;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HopArrivalModelMapper extends BaseModelMapper<HopArrivalEntityModel, HopArrival> {
    HopArrivalModelMapper INSTANCE = Mappers.getMapper(HopArrivalModelMapper.class);
}
