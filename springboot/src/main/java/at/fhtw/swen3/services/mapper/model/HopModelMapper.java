package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.HopEntityModel;
import at.fhtw.swen3.services.dto.Hop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HopModelMapper {
    HopModelMapper INSTANCE = Mappers.getMapper(HopModelMapper.class);

    @Mapping(source = "hopEm.locationCoordinates.getX()", target = "locationCoordinates.lat")
    @Mapping(source = "hopEm.locationCoordinates.getY()", target = "locationCoordinates.lon")
    Hop entityToDto(HopEntityModel hopEm);

    @Mapping(source = "hop.locationCoordinates.lat", target = "locationCoordinates.setX()")
    @Mapping(source = "hop.locationCoordinates.lon", target = "locationCoordinates.setY()")
    HopEntityModel dtoToEntity(Hop hop);
}
