package com.patika;

import GameCharacter.Archer;
import GameCharacter.GameChar;
import GameCharacter.Knight;
import GameCharacter.Samurai;
import Inventory.Inventory;
import Locations.BattleLoc.Cave;
import Locations.BattleLoc.Forest;
import Locations.BattleLoc.River;
import Locations.Location;
import Locations.NormalLoc.SafeHouse;
import Locations.NormalLoc.ToolStore;

import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private GameChar gameChar;
    private int amount;
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorDefense;
    Scanner scanner=new Scanner(System.in);


    public Player(String name) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDefense() {
        return armorDefense;
    }

    public void setArmorDefense(int armorDefense) {
        this.armorDefense = armorDefense;
    }

    public void showCharacters(){

        GameChar[] charList ={new Samurai(),new Archer(),new Knight()};
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("--------------------------------CHARACTERS----------------------------------");
        for (GameChar gameChar : charList){
            System.out.println("Id -> "+ gameChar.getId()+
                    "\t Character -> "+ gameChar.getName()+
                    "\t Damage -> "+ gameChar.getDamage()+
                    "\t Health -> "+ gameChar.getHealth()+
                    "\t Money -> "+ gameChar.getMoney());
        }
        System.out.println("----------------------------------------------------------------------------");
    }

    public void selectChar(){
        showCharacters();
        boolean isSelectOkay=false;
        while(!isSelectOkay){
            System.out.println("Select a character: ");
            int selectChar=scanner.nextInt();

            switch (selectChar){
                case 1:
                    initPlayer(new Samurai());
                    isSelectOkay=true;
                    break;
                case 2:
                    initPlayer(new Archer());
                    isSelectOkay=true;
                    break;
                case 3:
                    initPlayer(new Knight());
                    isSelectOkay=true;
                    break;
                default:
                    System.out.println("Entered Wrong Id Number");
            }
        }
        System.out.println(
                "Chosen Character -> "+ this.getCharName()+
                "\t Damage -> "+ this.getDamage()+
                "\t Health -> "+ this.getHealth()+
                "\t Money -> "+ this.getMoney());
    }

    public void selectLoc(){
        Location[] locations={new SafeHouse(this),new ToolStore(this)};
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------LOCATIONS---------------------------------");
        for(Location loc:locations){
            System.out.println("Location id -> "+ loc.getId()+
                    "\t Location Name -> "+ loc.getName());
        }
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Select Location: ");
        int selectLocation=scanner.nextInt();

        Location location;

        switch (selectLocation){
            case 1:
                location=new SafeHouse(this);
                location.onLocation();
                break;
            case 2:
                location=new ToolStore(this);
                location.onLocation();
                break;
            case 3:
                location=new Forest(this);
                location.onLocation();
                break;
            case 4:
                location=new Cave(this);
                location.onLocation();
                break;
            case 5:
                location=new River(this);
                location.onLocation();
                break;

        }
    }
    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setCharName(gameChar.getName());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

}
