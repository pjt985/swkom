package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.GeoCoordinateEntityModel;
import at.fhtw.swen3.services.dto.GeoCoordinate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GeoCoordinateModelMapper extends BaseModelMapper<GeoCoordinateEntityModel, GeoCoordinate>{
    GeoCoordinateModelMapper INSTANCE = Mappers.getMapper(GeoCoordinateModelMapper.class);
}
