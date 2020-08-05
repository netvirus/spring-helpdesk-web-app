package services;

import entity.Tiket;
import entity.enums.TiketState;
import interfaces.Tikets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TiketRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TiketsService implements Tikets {

    @Autowired
    TiketRepository tiketRepository;

    @Override
    public List<Tiket> getTikets() {
        List<Tiket> tikets = new ArrayList<>();
        tiketRepository.findAll().forEach(tikets::add);
        return tikets;
    }

    public void addTiket(Tiket tiket) {
        tiketRepository.save(tiket);
    }
}
