package repository;

import entity.Ticket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

    @Query(value = "SELECT * FROM tickets WHERE stateId = ?1", nativeQuery = true)
    List<Ticket> findByStateId(int stateId);
}
