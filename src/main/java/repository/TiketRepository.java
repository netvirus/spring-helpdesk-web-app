package repository;

import entity.Tiket;
import entity.enums.TiketState;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TiketRepository extends CrudRepository<Tiket, Integer> {

    List<Tiket> findAllByStateId(int stateId);
}
