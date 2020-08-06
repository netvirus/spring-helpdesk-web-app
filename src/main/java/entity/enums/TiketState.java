package entity.enums;

import java.util.Arrays;

public enum TiketState {
    UNREADED("unreaded", 0),
    READED("readed", 1),
    OPENED("opened", 2),
    CLOSED("closed", 3),
    DELETED("deleted", 4);

    private final int _id;
    private final String _name;

    TiketState(String name, int id) {
        _name = name;
        _id = id;
    }

    public final int getId()
    {
        return _id;
    }

    public final String getName()
    {
        return _name;
    }

    public static TiketState getByName(String name)
    {
        return Arrays.asList(values()).stream().filter(t -> t.getName().equals(name)).findAny().orElse(null);
    }

    public static TiketState getById(int id)
    {
        return Arrays.asList(values()).stream().filter(t -> t.getId() == id).findAny().orElse(null);
    }
}
