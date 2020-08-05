package services;

import entity.Tiket;
import entity.enums.TiketState;
import org.junit.jupiter.api.Test;
import repository.TiketRepository;

import java.util.List;

class TiketsImplTest {

    @Test
    void getTiketsByStateTest() {

        TiketRepository tiketRepository = null;
        List<Tiket> tikets = tiketRepository.findAllByStateId(TiketState.UNREADED.getId());
        tikets.stream().forEach(System.out::println);
    }
}