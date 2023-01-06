package books.head_first_design_patterns._01_intro.design_puzzle.characters;

import books.head_first_design_patterns._01_intro.design_puzzle.weapon_behaviors.KnifeBehavior;

public class Knight extends Character {

    public Knight() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
