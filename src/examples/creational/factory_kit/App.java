package examples.creational.factory_kit;

import java.util.ArrayList;
import java.util.List;

/***
 * Factory kit is a creational pattern that defines a factory of immutable content with separated
 * builder and factory interfaces to deal with the problem of creating one of the objects specified
 * directly in the factory kit instance.
 *
 * <p>In the given example {@link WeaponFactory} represents the factory kit, that contains four
 * {@link Builder}s for creating new objects of the classes implementing {@link Weapon} interface.
 *
 * <p>Each of them can be called with {@link WeaponFactory#create(WeaponType)} method, with
 * an input representing an instance of {@link WeaponType} that needs to be mapped explicitly with
 * desired class type in the factory instance.
 */
public class App {

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        WeaponFactory factory = WeaponFactory.factory(builder -> {
            builder.add(WeaponType.SWORD, Sword::new);
            builder.add(WeaponType.AXE, Axe::new);
            builder.add(WeaponType.SPEAR, Spear::new);
            builder.add(WeaponType.BOW, Bow::new);
        });

        List<Weapon> list = new ArrayList<>();
        list.add(factory.create(WeaponType.AXE));
        list.add(factory.create(WeaponType.SPEAR));
        list.add(factory.create(WeaponType.SWORD));
        list.add(factory.create(WeaponType.BOW));
        list.forEach(weapon -> System.out.println(weapon.toString()));
    }
}
