package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.ParcelEmRepository;
import at.fhtw.swen3.services.entityservices.ParcelService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ParcelServiceImpl implements ParcelService {
    private ParcelEmRepository parcelRepo;
}
