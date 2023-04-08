package Locations;

import com.patika.Player;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(1, player, "SafeHouse");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------SAFEHOUSE---------------------------------");
        System.out.println("Player gain health....");
        return true;
    }
}
