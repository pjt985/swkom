package at.fhtw.swen3.services.mapper.model;

import at.fhtw.swen3.persistence.entities.WarehouseNextHopsEntity;
import at.fhtw.swen3.services.dto.Warehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WarehouseNextHopsModelMapper extends BaseModelMapper<WarehouseNextHopsEntity, Warehouse>{
    WarehouseNextHopsModelMapper INSTANCE = Mappers.getMapper(WarehouseNextHopsModelMapper.class);
}
