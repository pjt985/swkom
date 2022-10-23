package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.NewParcelInfoEntityModel;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewParcelInfoModelMapper extends BaseModelMapper<NewParcelInfoEntityModel, NewParcelInfo>{
    NewParcelInfoModelMapper INSTANCE = Mappers.getMapper(NewParcelInfoModelMapper.class);
}
