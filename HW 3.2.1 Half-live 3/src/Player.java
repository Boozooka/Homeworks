import weapon.weapon;
import weapon.Pistol;
import weapon.RPG;
import weapon.Slingshot;
import weapon.WaterGun;
import weapon.shotgun;
public class Player {
    private weapon[] weaponSlots;
    public Player(){
        weaponSlots = new weapon[] {
                new Pistol(),
                new Slingshot(),
                new WaterGun(),
                new shotgun(),
                new RPG()

        };
    }
    public int getSlots() { return weaponSlots.length;}
    public void shotWithWeapon (int slot){
        if ((slot - 1) >= getSlots() || (slot - 1) < -1) {
            System.out.println("Некорректный слот");
            return;
        }
        weapon weapon = weaponSlots[slot - 1];
        System.out.println("Огонь!");
        weapon.shot();
    }
}
