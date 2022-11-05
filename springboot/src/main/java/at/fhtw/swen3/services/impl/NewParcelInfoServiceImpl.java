package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.NewParcelInfoEmRepository;
import at.fhtw.swen3.services.entityservices.NewParcelInfoService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NewParcelInfoServiceImpl implements NewParcelInfoService {
    private NewParcelInfoEmRepository npiRepo;
}
