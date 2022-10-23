package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.ParcelEntityModel;
import at.fhtw.swen3.services.dto.Parcel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ParcelModelMapper extends BaseModelMapper<ParcelEntityModel, Parcel>{
    ParcelModelMapper INSTANCE = Mappers.getMapper(ParcelModelMapper.class);
}
