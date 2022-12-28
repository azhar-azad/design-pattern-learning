package examples.creational.factory_method;

public class App {

    public static void main(String[] args) {

        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(blacksmith + " manufactured " + weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(blacksmith + " manufactured " + weapon);

        blacksmith = new ElfBlacksmith();
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(blacksmith + " manufactured " + weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(blacksmith + " manufactured " + weapon);
    }
}
