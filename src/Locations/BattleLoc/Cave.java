package Locations.BattleLoc;


import Obstacle.Zombie;
import com.patika.Player;

public class Cave extends BattleLoc{

    public Cave(Player player) {
        super(4, player, "Cave", new Zombie());
    }
}
