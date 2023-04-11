package Locations.NormalLoc;

import Inventory.Inventory;
import Inventory.WearableItems.Armor.Armor;
import Inventory.WearableItems.Armor.Heavy;
import Inventory.WearableItems.Armor.Light;
import Inventory.WearableItems.Armor.Medium;
import Inventory.WearableItems.Weapon.Gun;
import Inventory.WearableItems.Weapon.Rifle;
import Inventory.WearableItems.Weapon.Sword;
import Inventory.WearableItems.Weapon.Weapon;
import com.patika.Player;
import Inventory.WearableItems.WearableItem;

import java.util.Scanner;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(2, player, "ToolStore");
    }

    private Scanner scanner = new Scanner(System.in);

    @Override
    public boolean onLocation() {
        mainMenu();
        return true;
    }

    public void mainMenu() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------------------------------- TOOLSTORE -------------------------------");
        WearableItem[] itemList = {new Armor(), new Weapon()};
        for (WearableItem wearableItems : itemList) {
            System.out.println("Type Id -> " + wearableItems.getTypeId() + "\t Item Type -> " + wearableItems.getType());
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("0 for Upper Menu");
        System.out.print("Select Item Type: ");
        int selectType = scanner.nextInt();

        switch (selectType) {
            case 0:
                getPlayer().selectLoc();
                break;
            case 1:
                armorMenu();
                break;
            case 2:
                weaponMenu();
                break;
        }
    }

    public void armorMenu() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("--------------------------------- ARMOR ---------------------------------");
        Armor[] armorList={new Light(),new Medium(),new Heavy()};
        for (Armor armor:armorList){
            System.out.println("Armor | Id -> "+ armor.getId()+
                    "\t Name -> "+ armor.getName()+
                    "\t Defense -> "+ armor.getDefense()+
                    "\t Money -> " +armor.getMoney());
        }
        System.out.println("-------------------------------------------------------------------------");
        buyArmor();
    }

    public void buyArmor(){
        System.out.println("Your money: "+ getPlayer().getMoney());
        System.out.println("0 for Upper Menu");
        System.out.println("Enter Armor Id that you want to buy");
        int selectArmor= scanner.nextInt();
        switch (selectArmor){
            case 0:
                mainMenu();
                break;
            case 1:
                selectArmor(new Light());
                break;
            case 2:
                selectArmor(new Medium());
                break;
            case 3:
                selectArmor(new Heavy());
                break;
            default:
                System.out.println("---");

        }
    }

    public void selectArmor(Armor armor){
        if(getPlayer().getMoney()>=armor.getMoney()){
            getPlayer().setArmorDefense(armor.getDefense());
            getPlayer().setArmorName(armor.getName());

            System.out.println("Got your armor successfully");
            System.out.println("Damage Defense -> "+getPlayer().getArmorDefense());
            getPlayer().setMoney(getPlayer().getMoney()-armor.getMoney());
            System.out.println("--------------------------------------------------------------------");
            mainMenu();
        }
        else {
            System.out.println("Insufficient Money");
            armorMenu();
        }

    }

    public void weaponMenu() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("--------------------------------- WEAPON --------------------------------");
        Weapon[] weaponList={new Gun(),new Sword(),new Rifle()};
        for (Weapon weapon:weaponList){
            System.out.println("Weapon | Id -> "+ weapon.getId()+
                    "\t Name -> "+ weapon.getName()+
                    "\t Defense -> "+ weapon.getDamage()+
                    "\t Money -> " +weapon.getMoney());
        }
        System.out.println("-------------------------------------------------------------------------");
        buyWeapon();
    }

    public void buyWeapon() {
        System.out.println("Your money: " + getPlayer().getMoney());
        System.out.println("0 for Upper Menu");
        System.out.println("Enter Weapon Id that you want to buy");
        int selectWeapon = scanner.nextInt();
        switch (selectWeapon) {
            case 0:
                mainMenu();
                break;
            case 1:
                selectWeapon(new Gun());
                break;
            case 2:
                selectWeapon(new Sword());
                break;
            case 3:
                selectWeapon(new Rifle());
                break;
            default:
                System.out.println("---");
        }
    }

    public void selectWeapon(Weapon weapon){
        if (getPlayer().getMoney()>= weapon.getMoney()){
            getPlayer().setWeaponDamage(weapon.getDamage());
            getPlayer().setWeaponName(weapon.getName());
        }
    }
}

