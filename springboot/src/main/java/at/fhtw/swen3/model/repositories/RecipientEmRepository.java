package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.RecipientEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RecipientEmRepository extends JpaRepository<RecipientEntityModel, Long> {

    @Override
    <S extends RecipientEntityModel> S save(S entity);

    @Override
    Optional<RecipientEntityModel> findById(Long aLong);

    @Override
    List<RecipientEntityModel> findAll();

    @Override
    void deleteById(Long aLong);
}
