package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.HopArrivalEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HopArrivalEmRepository extends JpaRepository<HopArrivalEntityModel, Long> {

    @Override
    List<HopArrivalEntityModel> findAll();

    @Override
    <S extends HopArrivalEntityModel> S save(S entity);

    @Override
    Optional<HopArrivalEntityModel> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
