package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.NewParcelInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewParcelInfoEmRepository extends JpaRepository<NewParcelInfoEntity, Long> {
}
