package entity.interfaces;

import entity.Tiket;
import entity.enums.TiketState;

import java.util.List;

public interface Tikets {

    public List<Tiket> getTiketsByState(TiketState stateId);

}
