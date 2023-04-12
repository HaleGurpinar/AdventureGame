package Locations.BattleLoc;

import Obstacle.Obstacle;
import com.patika.Player;

public class River extends BattleLoc{
    public River(Player player) {
        super(5, player, "River", new Bear());
    }
}
