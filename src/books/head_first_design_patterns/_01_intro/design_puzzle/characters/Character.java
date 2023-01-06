package books.head_first_design_patterns._01_intro.design_puzzle.characters;

import books.head_first_design_patterns._01_intro.design_puzzle.weapon_behaviors.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weapon;

    // All characters fight with different style
    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
