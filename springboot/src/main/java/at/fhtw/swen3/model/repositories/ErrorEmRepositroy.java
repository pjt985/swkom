package at.fhtw.swen3.model.repositories;

import at.fhtw.swen3.model.entities.ErrorEntityModel;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ErrorEmRepositroy extends JpaRepository<ErrorEntityModel, Long> {
    //ErrorEntityModel findById(long id);


    @Override
    Optional<ErrorEntityModel> findById(Long aLong);

    @Override
    <S extends ErrorEntityModel> S save(S entity);

    @Override
    List<ErrorEntityModel> findAll();

    @Override
    void deleteById(Long aLong);

    //void deleteById(Long aLong);

}
