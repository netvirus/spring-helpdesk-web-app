package services;

import entity.Tiket;
import entity.enums.TicketState;
import org.junit.jupiter.api.Test;
import repository.TicketRepository;

import java.util.List;

class TiketsImplTest {

    @Test
    void getTiketsByStateTest() {

        TicketRepository ticketRepository = null;
        List<Tiket> tikets = ticketRepository.findAllByStateId(TicketState.UNREADED.getId());
        tikets.stream().forEach(System.out::println);
    }
}