package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.TransferhouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingInformationEmRepository extends JpaRepository<TransferhouseEntity, Long> {
}
