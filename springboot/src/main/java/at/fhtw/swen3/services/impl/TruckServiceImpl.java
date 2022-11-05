package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.TruckEmRepository;
import at.fhtw.swen3.services.entityservices.TruckService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TruckServiceImpl implements TruckService {
    private TruckEmRepository truckRepo;
}
