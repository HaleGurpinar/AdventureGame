# Adventure Game
A text-based game with Java

CHARACTER
| Character | ID | Damage | Health | Money |
| :---: | :---: | :---: | :---: | :---: |
| Samurai | 1 | 5 | 21 | 15 |
| Archer | 2 | 7 | 18 | 20 |
| Knight | 3 | 8 | 24 | 5 |

OBSTACLE
| Monster | ID | Damage | Health | Money |
| :---: | :---: | :---: | :---: | :---: |
| Zombi | 1 | 3 | 10 | 4 |
| Vampire | 2 | 4 | 14 | 7 |
| Bear | 3 | 7 | 20 | 12 |
| Snake | 4 | Random(3-6) | 12 | -(Gain item) |

WEAPON
| Inventory.WearableItems.Weapon.Weapon | ID | Damage | Money |
| :---: | :---: | :---: | :---: |
| Gun | 1 | 2 | 25 |
| Sword | 2 | 3 | 35 |
| Rifle | 3 | 7 | 45 |

ARMOR
| Inventory.WearableItems.Armor | ID | Defence | Money |
| :---: | :---: | :---: | :---: |
| Inventory.WearableItems.Armor | 1 | 1 | 15 |
| Medium | 2 | 3 | 25 |
| Heavy | 3 | 5 | 40 |

PLACE
* Safe House  <br />
 Feature :  Gain health  <br />
* Cave  <br />
 Monster : Zombie(1-3)   <br />
 Feature : War+ Loot   <br />
 Item : Food  <br />
* Forest  <br />
 Monster : Vampire(1-3)  <br />
 Feature : War + Loot  <br />
 Item : Firewood  <br />
* River  <br />
 Monster : Bear(1-3)  <br />
 Feature : War + Loot <br />
 Item : Water  <br />
* ToolStore <br />
 Feature : Buy support objects <br />
 Weapon : Gun, Sword, Rifle <br /> 
 Armor : Light, Medium, Heavy
 
 ![Employee data](https://github.com/HaleGurpinar/AdventureGame/blob/master/class-diagram.jpg?raw=true
" Class-Diagram")

# TASKS
1. Create Mine place->  <br />
Obstacle:Snake<br />
Feature: War,Loot <br />
Item: Money,Gun,Armor <br />

Snake obstacle->   <br />
ID:4 <br />
Damage:Random(3-6) <br />
Health:12 <br />
Money:None(Instead of it, gain item) <br />
* Items that drop from obstacles: <br />
--Possibility of Gain Weapon: %15  <br />
 &nbsp;&nbsp; ----Possibility Gain Rifle: %20 <br />
 &nbsp;&nbsp; ----Possibility Gain Sword: %30 <br />
 &nbsp;&nbsp; ----Possibility Gain Gun: %50 <br />
--Possibility of Gain Armor: %15 <br />
&nbsp;&nbsp; ----Possibility Gain Heavy: %20 <br />
&nbsp;&nbsp;  ----Possibility Gain Middle: %30 <br />
&nbsp;&nbsp;  ----Possibility Gain Light: %50 <br />
--Possibility of Gain Money: %25 <br />
&nbsp;&nbsp;  ----Possibility Gain 10 Money: %20 <br />
&nbsp;&nbsp;  ----Possibility Gain 5 Money: %30 <br />
&nbsp;&nbsp;  ----Possibility Gain 1 Money: %50 <br />
--Can not gain anything %45 <br />
  

