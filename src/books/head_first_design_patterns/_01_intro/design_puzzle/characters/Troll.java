package books.head_first_design_patterns._01_intro.design_puzzle.characters;

import books.head_first_design_patterns._01_intro.design_puzzle.weapon_behaviors.KnifeBehavior;

public class Troll extends Character {

    public Troll() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
