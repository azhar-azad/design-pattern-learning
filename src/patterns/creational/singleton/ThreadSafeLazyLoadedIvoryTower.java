package patterns.creational.singleton;

/***
 * <p>Thread safe singleton class. The instance is lazily initialized and thus needs
 * synchronization mechanism.</p>
 */
public final class ThreadSafeLazyLoadedIvoryTower {

    private static volatile ThreadSafeLazyLoadedIvoryTower instance;

    private ThreadSafeLazyLoadedIvoryTower() {
        // Protect against instantiation via reflection
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * The instance doesn't get created until the method is called for the first time.
     */
    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazyLoadedIvoryTower.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazyLoadedIvoryTower();
                }
            }
        }
        return instance;
    }
}
