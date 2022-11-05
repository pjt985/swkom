package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.HopEmRepository;
import at.fhtw.swen3.services.entityservices.HopService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HopServiceImpl implements HopService {
    private HopEmRepository hopRepo;
}
