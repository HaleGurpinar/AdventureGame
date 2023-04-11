package Inventory.WearableItems.Weapon;

import Inventory.WearableItems.WearableItem;

public class Weapon extends WearableItem {

    private int id;
    private String name;
    private int damage;
    private int money;

    public Weapon(int typeId, String type, int id, String name, int damage, int money) {
        super(typeId, type);
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.money = money;

    }

    public Weapon(){
        super(2, "Weapon");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
