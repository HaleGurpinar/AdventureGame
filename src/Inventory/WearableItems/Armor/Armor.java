package Inventory.WearableItems.Armor;

import Inventory.WearableItems.WearableItem;

public class Armor extends WearableItem {

    private int id;
    private String name;
    private int defense;
    private int money;

    public Armor(int typeId, String type, int id, String name, int defense, int money) {
        super(typeId, type);
        this.id = id;
        this.name = name;
        this.defense = defense;
        this.money = money;
    }

    public Armor(){
        super(1, "Inventory/WearableItems/Armor");
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

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
