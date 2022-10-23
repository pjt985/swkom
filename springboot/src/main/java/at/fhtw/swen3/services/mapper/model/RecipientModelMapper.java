package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.RecipientEntityModel;
import at.fhtw.swen3.services.dto.Recipient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipientModelMapper extends BaseModelMapper<RecipientEntityModel, Recipient>{
    RecipientModelMapper INSTANCE = Mappers.getMapper(RecipientModelMapper.class);
}
