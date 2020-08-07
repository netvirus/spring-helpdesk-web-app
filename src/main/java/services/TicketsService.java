package services;

import entity.Manager;
import entity.Message;
import entity.Ticket;
import interfaces.ITickets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ManagerRepository;
import repository.MessageRepository;
import repository.TicketRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketsService implements ITickets {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    ManagerRepository managerRepository;

    @Autowired
    MessageRepository messageRepository;

    @Override
    public List<Ticket> findTicketsByState(int stateId) {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findByStateId(stateId).forEach(tickets::add);
        return tickets;
    }

    public void addTicket(Ticket ticket, Manager manager, Message message) {
        ticketRepository.save(ticket);
        managerRepository.save(manager);
        messageRepository.save(message);
    }
}
