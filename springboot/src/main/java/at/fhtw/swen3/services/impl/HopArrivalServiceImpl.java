package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.HopArrivalEmRepository;
import at.fhtw.swen3.services.entityservices.HopArrivalService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HopArrivalServiceImpl implements HopArrivalService {
    private HopArrivalEmRepository haRep;
}
