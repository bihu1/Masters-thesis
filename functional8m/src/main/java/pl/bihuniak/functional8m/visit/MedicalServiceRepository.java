package pl.bihuniak.functional8m.visit;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicalServiceRepository extends CrudRepository<MedicalService, Integer> {
    List<MedicalService> findByIdIn(List<Integer> ids);
}
