package Locations.BattleLoc;


import Obstacle.Snake;
import com.patika.Player;

public class Mine extends BattleLoc{

    public Mine(Player player) {
        super(6, player, "Mine", new Snake());
    }
}
