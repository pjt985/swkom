package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.NewParcelInfoEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NewParcelInfoEmRepositroy extends JpaRepository<NewParcelInfoEntityModel, Long> {

    @Override
    void deleteById(Long aLong);

    @Override
    Optional<NewParcelInfoEntityModel> findById(Long aLong);

    @Override
    List<NewParcelInfoEntityModel> findAll();

    @Override
    <S extends NewParcelInfoEntityModel> S save(S entity);
}
