import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.println("У игрока " + (player.getSlots() + 1) + " свободных слотов, выберите оружие и стреляйте");
        System.out.println("1.Пистолет \n2.Рогатка \n3.Водный пистолет \n4.Дробовик \n5.РПГ \n-1.Конец программы");
        int slot;
        while (true){
            slot = scanner.nextInt();
            if (slot == -1){ break;}
            player.shotWithWeapon(slot);
        }
    }
}


