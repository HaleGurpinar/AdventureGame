package Obstacle;

import java.util.PrimitiveIterator;

public class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int money;
    private int fullHealth;

    public Obstacle(int id, String name, int damage, int health, int money, int fullHealth ) {
        this.id = id;
        this.name=name;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.fullHealth=fullHealth;
    }

    public int obstacleNumber(){
        return (int)(Math.random()*3)+1;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getFullHealth() {
        return fullHealth;
    }

    public void setFullHealth(int fullHealth) {
        this.fullHealth = fullHealth;
    }
}
