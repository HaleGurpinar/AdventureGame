package Locations;

import com.patika.Player;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(2,player, "ToolStore");
    }

    @Override
    public boolean onLocation() {
        System.out.println("TOOLSTORE");
        return true;
    }
}
