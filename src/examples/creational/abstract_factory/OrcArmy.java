package examples.creational.abstract_factory;

/**
 * OrcArmy.
 */
public class OrcArmy implements Army {

    static final String DESCRIPTION = "This is the orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
