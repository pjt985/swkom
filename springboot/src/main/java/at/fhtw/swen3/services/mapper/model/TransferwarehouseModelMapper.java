package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.TransferhouseEntityModel;
import at.fhtw.swen3.services.dto.Transferwarehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransferwarehouseModelMapper extends BaseModelMapper<TransferhouseEntityModel, Transferwarehouse>{
    TransferwarehouseModelMapper INSTANCE = Mappers.getMapper(TransferwarehouseModelMapper.class);
}
