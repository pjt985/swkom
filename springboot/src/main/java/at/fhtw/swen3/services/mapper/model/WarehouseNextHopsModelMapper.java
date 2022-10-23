package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.model.entities.WarehouseNextHopsEntityModel;
import at.fhtw.swen3.services.dto.Warehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WarehouseNextHopsModelMapper extends BaseModelMapper<WarehouseNextHopsEntityModel, Warehouse>{
    WarehouseNextHopsModelMapper INSTANCE = Mappers.getMapper(WarehouseNextHopsModelMapper.class);
}
