package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.ErrorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ErrorEmRepositroy extends JpaRepository<ErrorEntity, Long> {
}