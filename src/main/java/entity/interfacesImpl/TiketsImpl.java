package entity.interfacesImpl;

import entity.Tiket;
import entity.enums.TiketState;
import entity.interfaces.Tikets;
import org.springframework.beans.factory.annotation.Autowired;
import repository.TiketRepository;

import java.util.ArrayList;
import java.util.List;

public class TiketsImpl implements Tikets {

    @Autowired
    TiketRepository tiketRepository;

    @Override
    public List<Tiket> getTiketsByState(TiketState state) {
        return tiketRepository.findAllByStateId(state.getIdByMask(state.name()));
    }
}
