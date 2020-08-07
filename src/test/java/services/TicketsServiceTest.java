package services;

import entity.Ticket;
import entity.enums.TicketState;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import repository.TicketRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TicketsServiceTest {

    @Autowired
    TicketRepository ticketRepository;

    @Test
    void findTicketsByState() {

        ticketRepository.findByStateId(TicketState.UNREADED.getId()).forEach(System.out::println);

//        TicketsService ticketsService = new TicketsService();
//        List<Ticket> tickets = ticketsService.findTicketsByState(TicketState.UNREADED.getId());
//        assertNotNull(tickets);

    }
}