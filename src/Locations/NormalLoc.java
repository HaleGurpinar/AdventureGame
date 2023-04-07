package Locations;

import Locations.Location;
import com.patika.Player;

public abstract class NormalLoc extends Location {
    public NormalLoc(int id, Player player, String name) {
        super(id, player, name);
    }

    @Override
    boolean onLocation() {
        return true;
    }
}
