package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.GeoCoordinateEntityModel;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GeoCoordinateEmRepository extends JpaRepository<GeoCoordinateEntityModel, Long> {

    @Override
    void deleteById(Long aLong);

    @Override
    <S extends GeoCoordinateEntityModel> S save(S entity);

    @Override
    List<GeoCoordinateEntityModel> findAll();

    @Override
    Optional<GeoCoordinateEntityModel> findById(Long aLong);
}
