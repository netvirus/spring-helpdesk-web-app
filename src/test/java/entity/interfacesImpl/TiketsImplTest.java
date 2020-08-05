package entity.interfacesImpl;

import entity.Tiket;
import entity.enums.TiketState;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.springframework.beans.factory.annotation.Autowired;
import repository.TiketRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TiketsImplTest {

    @Test
    void getTiketsByStateTest() {

        TiketRepository tiketRepository = null;
        List<Tiket> tikets = tiketRepository.findAllByStateId(TiketState.UNREADED.getId());
        tikets.stream().forEach(System.out::println);
    }
}