package books.head_first_design_patterns._01_intro.design_puzzle.weapon_behaviors;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        // implements shooting an arrow with bow
        System.out.println("Shooting an arrow with bow");
    }
}
