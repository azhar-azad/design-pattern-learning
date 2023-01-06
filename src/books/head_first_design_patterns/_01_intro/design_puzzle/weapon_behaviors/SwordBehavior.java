package books.head_first_design_patterns._01_intro.design_puzzle.weapon_behaviors;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        // implements swinging a sword
        System.out.println("Swinging a sword");
    }
}
