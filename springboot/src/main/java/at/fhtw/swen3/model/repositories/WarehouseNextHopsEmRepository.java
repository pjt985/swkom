package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.WarehouseNextHopsEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WarehouseNextHopsEmRepository extends JpaRepository<WarehouseNextHopsEntityModel, Long> {

    @Override
    Optional<WarehouseNextHopsEntityModel> findById(Long aLong);

    @Override
    List<WarehouseNextHopsEntityModel> findAll();

    @Override
    void deleteById(Long aLong);

    @Override
    <S extends WarehouseNextHopsEntityModel> S save(S entity);
}
