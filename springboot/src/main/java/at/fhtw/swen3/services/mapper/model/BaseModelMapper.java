package at.fhtw.swen3.services.mapper.model;

public interface BaseModelMapper<ENM, DTO> {
    DTO entityToDto(ENM enm);

    ENM dtoToEntity(DTO dto);
}
