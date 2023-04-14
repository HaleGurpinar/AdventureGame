package Locations.BattleLoc;

import Locations.Location;
import Obstacle.Obstacle;
import com.patika.Player;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;

    public BattleLoc(int id, Player player, String name, Obstacle obstacle) {
        super(id, player, name);
        this.obstacle=obstacle;
    }

    public void playerHit(){
        obstacle.setHealth(obstacle.getHealth()-getPlayer().getDamage());
        System.out.println(getPlayer().getName()+" "+ getPlayer().getDamage()+" damaged");
        System.out.println(getPlayer().getName()+"'s Health -> "+ getPlayer().getHealth());
        System.out.println(obstacle.getName()+" "+obstacle.getHealth());
    }
    @Override
    public boolean onLocation() {
        return false;
    }

    public void combat(){

    }
    public int hitFirst() {
        return (int) (Math.random() * 100);
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }
}
