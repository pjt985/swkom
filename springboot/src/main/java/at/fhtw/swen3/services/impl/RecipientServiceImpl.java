package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.RecipientEmRepository;
import at.fhtw.swen3.services.entityservices.RecipientService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RecipientServiceImpl implements RecipientService {
    private RecipientEmRepository recipientRepo;
}
