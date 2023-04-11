package Locations.NormalLoc;

import Inventory.WearableItems.Armor.Armor;
import Inventory.WearableItems.Armor.Light;
import Inventory.WearableItems.Weapon;
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
        Armor[] armorList={new Light(),new }
    }


    public void weaponMenu() {
    }
}

