package patterns.creational.factory_method;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * Concrete subclass for creating new objects.
 * */
public class OrcBlacksmith implements Blacksmith {

    private static final Map<WeaponType, OrcWeapon> ORCARSENAL;

    static {
        ORCARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ORCARSENAL.put(type, new OrcWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ORCARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "The orc blacksmith";
    }
}
