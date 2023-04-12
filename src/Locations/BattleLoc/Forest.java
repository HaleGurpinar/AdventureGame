package Locations.BattleLoc;

import Obstacle.Obstacle;
import com.patika.Player;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(3, player, "Forest", new Vampire());
    }


}
