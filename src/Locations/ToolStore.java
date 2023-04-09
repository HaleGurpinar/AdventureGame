package Locations;

import Inventory.WearableItems.Armor;
import Inventory.WearableItems.Weapon;
import com.patika.Player;
import Inventory.WearableItems.WearableItem;

import java.util.Scanner;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(2,player, "ToolStore");
    }

    private Scanner scanner= new Scanner(System.in);

    @Override
    public boolean onLocation() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-----------------------------TOOLSTORE-----------------------------------");
        return true;
    }

    public void mainMenu() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------------------------------- TOOLSTORE -------------------------------");
        WearableItem[] itemList = {new Armor(), new Weapon()};
        for (WearableItem wearableItems : itemList) {
            System.out.println("Tür Id -> " + wearableItems.getTypeId() + "\t Eşya Türü -> " + wearableItems.getType());
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Üst menü için 0 tuşlayınız.");
        System.out.print("Select Item Type: ");
        int selectType = scanner.nextInt();

        switch (selectType) {
            case 0:
                getPlayer().selectLocation();
                break;
            case 1:
                armorMenu();
                break;
            case 2:
                weaponMenu();
                break;
        }
    }
}
