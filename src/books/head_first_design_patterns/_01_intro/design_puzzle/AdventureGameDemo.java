package books.head_first_design_patterns._01_intro.design_puzzle;

import books.head_first_design_patterns._01_intro.design_puzzle.characters.Character;
import books.head_first_design_patterns._01_intro.design_puzzle.characters.Queen;
import books.head_first_design_patterns._01_intro.design_puzzle.weapon_behaviors.SwordBehavior;

public class AdventureGameDemo {

    public static void main(String[] args) {

        Character queen = new Queen();
        queen.fight();
        queen.setWeapon(new SwordBehavior());
        queen.fight();

    }
}
