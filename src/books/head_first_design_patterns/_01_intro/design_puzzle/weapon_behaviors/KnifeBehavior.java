package books.head_first_design_patterns._01_intro.design_puzzle.weapon_behaviors;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        // implements cutting with a knife
        System.out.println("Cutting with a knife");
    }
}
