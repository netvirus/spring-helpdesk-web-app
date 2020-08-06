package interfaces;

import entity.Ticket;

import java.util.List;

public interface ITickets {

    public List<Ticket> findTicketsByState(int stateId);

}
