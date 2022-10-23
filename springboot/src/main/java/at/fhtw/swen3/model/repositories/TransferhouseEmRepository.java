package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.TransferhouseEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TransferhouseEmRepository extends JpaRepository<TransferhouseEntityModel, Long> {

    @Override
    Optional<TransferhouseEntityModel> findById(Long aLong);

    @Override
    List<TransferhouseEntityModel> findAll();

    @Override
    void deleteById(Long aLong);

    @Override
    <S extends TransferhouseEntityModel> S save(S entity);
}
