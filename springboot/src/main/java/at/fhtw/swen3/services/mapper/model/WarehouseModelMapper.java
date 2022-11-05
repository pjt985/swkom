package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.persistence.entities.WarehouseEntity;
import at.fhtw.swen3.services.dto.Warehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WarehouseModelMapper extends BaseModelMapper<WarehouseEntity, Warehouse>{
    WarehouseModelMapper INSTANCE = Mappers.getMapper(WarehouseModelMapper.class);
}
