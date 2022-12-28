package examples.creational.factory_method;

public enum WeaponType {

    SHORT_SWORD("short_sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("");

    private final String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
