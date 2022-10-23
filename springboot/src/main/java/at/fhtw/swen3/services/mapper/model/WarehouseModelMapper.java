package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.WarehouseEntityModel;
import at.fhtw.swen3.services.dto.Warehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WarehouseModelMapper extends BaseModelMapper<WarehouseEntityModel, Warehouse>{
    WarehouseModelMapper INSTANCE = Mappers.getMapper(WarehouseModelMapper.class);
}
