package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.repositories.TransferhouseEmRepository;
import at.fhtw.swen3.services.entityservices.TransferwarehouseService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TransferwarehouseServiceImpl implements TransferwarehouseService {
    private TransferhouseEmRepository twhRepo;
}
