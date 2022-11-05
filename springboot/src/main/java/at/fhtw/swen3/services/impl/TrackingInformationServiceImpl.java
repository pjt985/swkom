package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.TrackingInformationEmRepository;
import at.fhtw.swen3.services.entityservices.TrackingInformationService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TrackingInformationServiceImpl implements TrackingInformationService {
    private TrackingInformationEmRepository tiRepo;
}
