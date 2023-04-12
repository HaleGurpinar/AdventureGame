package Locations.BattleLoc;

import Locations.Location;
import Obstacle.Obstacle;
import com.patika.Player;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;

    public BattleLoc(int id, Player player, String name) {
        super(id, player, name);
    }
}
