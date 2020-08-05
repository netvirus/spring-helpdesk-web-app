package entity.enums;

public enum TiketState {
    UNREADED(0),
    READED(1),
    OPENED(2),
    CLOSED(3),
    DELETED(4);

    private int id;

    TiketState(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getIdByMask(String mask) {
        for (TiketState state : values())
        {
            if (state.name().equals(mask)) {
                return state.getId();
            }
        }
        return -1;
    }
}
