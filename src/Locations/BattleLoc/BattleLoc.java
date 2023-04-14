package Locations.BattleLoc;

import Inventory.WearableItems.Armor.Heavy;
import Inventory.WearableItems.Armor.Light;
import Inventory.WearableItems.Armor.Medium;
import Inventory.WearableItems.Weapon.Gun;
import Inventory.WearableItems.Weapon.Rifle;
import Inventory.WearableItems.Weapon.Sword;
import Locations.Location;
import Obstacle.Obstacle;
import com.patika.Player;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;

    public BattleLoc(int id, Player player, String name, Obstacle obstacle) {
        super(id, player, name);
        this.obstacle = obstacle;
    }

    public void playerHit() {
        obstacle.setHealth(obstacle.getHealth() - getPlayer().getDamage());
        System.out.println(getPlayer().getName() + " " + getPlayer().getDamage() + " damaged");
        System.out.println(getPlayer().getName() + "'s Health -> " + getPlayer().getHealth());
        System.out.println(obstacle.getName() + "'s Health -> " + obstacle.getHealth());
        System.out.println("--------------------------------------------------------------------");
    }

    public void monsterHit() {
        int sumTakenDamage = obstacle.getDamage() - getPlayer().getArmorDefense();
        if (sumTakenDamage <= 0) {
            System.out.println("Defensed the damage");
            sumTakenDamage = 0;
        } else {
            getPlayer().setHealth(getPlayer().getHealth() - sumTakenDamage);
        }
        System.out.println(obstacle.getName() + " " + sumTakenDamage + " damaged");
        System.out.println(getPlayer().getName() + "'s Health -> " + getPlayer().getHealth());
        System.out.println(obstacle.getName() + "'s Health -> " + obstacle.getHealth());
        System.out.println("--------------------------------------------------------------------------");
    }

    public void getReward() {
        if (obstacle.getId() == 1) {
            getPlayer().setFood(true);
            System.out.println("Got Food Reward");
        } else if (obstacle.getId() == 2) {
            getPlayer().setFirewood(true);
            System.out.println("Got Firewood Reward");
        } else if (obstacle.getId() == 3) {
            getPlayer().setWater(true);
            System.out.println("Got Water Reward");
        }
        System.out.println("------------------------YOU ARE WINNER---------------------------------");
    }

    public void MineReward() {
        int totalChance = (int) (Math.random() * 100);
        int weaponTypeChange = (int) (Math.random() * 100);
        int armorTypeChange = (int) (Math.random() * 100);
        int moneyAmountChange = (int) (Math.random() * 100);

        if (totalChance <= 15) {
            if (weaponTypeChange <= 50) {
                Gun gun = new Gun();
                getPlayer().setWeaponDamage(gun.getDamage());
                System.out.println("Gain " + gun.getName());
            } else if (weaponTypeChange <= 80) {
                Sword sword = new Sword();
                getPlayer().setWeaponDamage(sword.getDamage());
                System.out.println("Gain " + sword.getName());
            } else {
                Rifle rifle = new Rifle();
                getPlayer().setWeaponDamage(rifle.getDamage());
                System.out.println("Gain " + rifle.getName());
            }
        } else if (totalChance <= 30) {
            if (armorTypeChange <= 50) {
                Light light = new Light();
                getPlayer().setArmorDefense(light.getDefense());
                System.out.println("Gain " + light.getName() + " Armor");
            } else if (armorTypeChange <= 80) {
                Medium medium = new Medium();
                getPlayer().setArmorDefense(medium.getDefense());
                System.out.println("Gain " + medium.getName() + "Armor");
            } else {
                Heavy heavy = new Heavy();
                getPlayer().setArmorDefense(heavy.getDefense());
                System.out.println("Gain " + heavy.getName() + "Armor");
            }
        } else if (totalChance <= 55) {
            if (moneyAmountChange <= 50) {
                getPlayer().setMoney(getPlayer().getMoney() + 1);
                System.out.println("Gain 1 Money");
            } else if (moneyAmountChange <= 80) {
                getPlayer().setMoney(getPlayer().getMoney() + 5);
                System.out.println("Gain 5 Money");
            } else {
                getPlayer().setMoney(getPlayer().getMoney() + 10);
                System.out.println("Gain 10 Money");
            }
        } else {
            System.out.println("You did not gain any item....!!");
        }
    }

    @Override
    public boolean onLocation() {
        combat();
        return getPlayer().getHealth()!=0;
    }

    public void combat() {

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
