package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.HopEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HopEmRepository extends JpaRepository<HopEntityModel, Long> {
    @Override
    List<HopEntityModel> findAll();

    @Override
    <S extends HopEntityModel> S save(S entity);

    @Override
    void deleteById(Long aLong);

    @Override
    Optional<HopEntityModel> findById(Long aLong);
}
