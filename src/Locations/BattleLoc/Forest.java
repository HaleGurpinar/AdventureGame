package Locations.BattleLoc;

import Obstacle.Vampire;
import com.patika.Player;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(3, player, "Forest", new Vampire());
    }


}
