package books.head_first_design_patterns._01_intro.design_puzzle.weapon_behaviors;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        // implements chopping with an axe
        System.out.println("Chopping with an axe");
    }
}
