package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.persistence.entities.NewParcelInfoEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewParcelInfoModelMapper extends BaseModelMapper<NewParcelInfoEntity, NewParcelInfo>{
    NewParcelInfoModelMapper INSTANCE = Mappers.getMapper(NewParcelInfoModelMapper.class);
}
