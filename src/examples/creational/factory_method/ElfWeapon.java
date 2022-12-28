package examples.creational.factory_method;

public class ElfWeapon implements Weapon {

    private final WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "an elven " + weaponType;
    }
}
