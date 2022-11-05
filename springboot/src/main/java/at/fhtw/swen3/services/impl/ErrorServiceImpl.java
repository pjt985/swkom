package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.ErrorEmRepositroy;
import at.fhtw.swen3.services.entityservices.ErrorService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ErrorServiceImpl implements ErrorService {
    private ErrorEmRepositroy errorRepo;
}
