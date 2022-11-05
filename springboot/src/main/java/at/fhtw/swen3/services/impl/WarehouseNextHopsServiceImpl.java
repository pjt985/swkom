package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.WarehouseNextHopsEmRepository;
import at.fhtw.swen3.services.entityservices.WarehouseNextHopsService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WarehouseNextHopsServiceImpl implements WarehouseNextHopsService {
    private WarehouseNextHopsEmRepository wnhRepo;
}
