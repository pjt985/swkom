package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.WarehouseEmRepository;
import at.fhtw.swen3.services.entityservices.WarehouseService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {
    private WarehouseEmRepository warehouseRepo;
}
