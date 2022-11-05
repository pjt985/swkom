package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.persistence.entities.TransferhouseEntity;
import at.fhtw.swen3.services.dto.Transferwarehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransferwarehouseModelMapper extends BaseModelMapper<TransferhouseEntity, Transferwarehouse>{
    TransferwarehouseModelMapper INSTANCE = Mappers.getMapper(TransferwarehouseModelMapper.class);
}
