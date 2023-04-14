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
        System.out.println(obstacle.getName()+"'s Health -> "+obstacle.getHealth());
        System.out.println("--------------------------------------------------------------------");
    }

    public void monsterHit(){
        int sumTakenDamage = obstacle.getDamage()-getPlayer().getArmorDefense();
        if (sumTakenDamage<=0){
            System.out.println("Defensed the damage");
            sumTakenDamage=0;
        }
        else{
            getPlayer().setHealth(getPlayer().getHealth()-sumTakenDamage);
        }
        System.out.println(obstacle.getName()+" "+sumTakenDamage+" damaged");
        System.out.println(getPlayer().getName()+"'s Health -> "+ getPlayer().getHealth());
        System.out.println(obstacle.getName()+"'s Health -> "+obstacle.getHealth());
        System.out.println("--------------------------------------------------------------------------");
    }

    public void getReward(){
        if(obstacle.getId()==1){
            getPlayer().setFood(true);
            System.out.println("Got Food Award");
        }else if (obstacle.getId()==2){
            getPlayer().setFirewood(true);
            System.out.println("Got Firewood Award");
        }else if (obstacle.getId()==3){
            getPlayer().setWater(true);
            System.out.println("Got Water Award");
        }
        System.out.println("------------------------YOU ARE WINNER---------------------------------");
    }

    public void MineReward(){

    }

    @Override
    public boolean onLocation() {

        return true;
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
