package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.TrackingInformationEntityModel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrackingInformationModelMapper extends BaseModelMapper<TrackingInformationEntityModel, TrackingInformation>{
    TrackingInformationModelMapper INSTANCE = Mappers.getMapper(TrackingInformationModelMapper.class);
}
