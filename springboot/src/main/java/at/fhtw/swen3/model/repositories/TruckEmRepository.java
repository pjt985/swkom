package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.TruckEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TruckEmRepository extends JpaRepository<TruckEntityModel, Long> {

    @Override
    List<TruckEntityModel> findAll();

    @Override
    Optional<TruckEntityModel> findById(Long aLong);

    @Override
    <S extends TruckEntityModel> S save(S entity);

    @Override
    void deleteById(Long aLong);
}
