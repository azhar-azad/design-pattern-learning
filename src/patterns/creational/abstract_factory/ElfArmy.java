package patterns.creational.abstract_factory;

/**
 * ElfArmy.
 */
public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
