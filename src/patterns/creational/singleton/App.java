package patterns.creational.singleton;

/**
 * <p>Singleton pattern ensures that the class can have only one existing instance per Java
 * classloader instance and provides global access to it.</p>
 *
 * <p>One of the risks of this pattern is that bugs resulting from setting a singleton up in a
 * distributed environment can be tricky to debug since it will work fine if you debug with a
 * single classloader. Additionally, these problems can crop up a while after the implementation of
 * a singleton, since they may start synchronous and only become async with time, so it may
 * not be clear why you are seeing certain changes in behavior.</p>
 *
 * <p>There are many ways to implement the Singleton. The first one is the eagerly initialized
 * instance in {@link IvoryTower}. Eager initialization implies that the implementation is thread
 * safe. If you can afford to give up control of the instantiation moment, then this implementation
 * will suit you fine.</p>
 *
 * <p>The other option to implement eagerly initialized Singleton is enum-based Singleton. The
 * example is found in {@link EnumIvoryTower}. At first glance, the code looks short and simple.
 * However, you should be aware of the downsides including committing to implementation strategy,
 * extending the enum class, serializability, and restrictions to coding. These are extensively
 * discussed in Stack Overflow: http://programmers.stackexchange.com/questions/179386/what-are-the-downsides-of-implementing
 * -a-singleton-with-javas-enum</p>
 *
 * <p>{@link ThreadSafeLazyLoadedIvoryTower} is a Singleton implementation that is initialized on
 * demand. The downside is that it is very slow to access since the whole access method is
 * synchronized.</p>
 *
 * <p>Another Singleton implementation that is initialized on demand is found in
 * {@link ThreadSafeDoubleCheckLocking}. It is somewhat faster than {@link
 * ThreadSafeLazyLoadedIvoryTower} since it doesn't synchronize the whole access method but only the
 * method internals on specific conditions.</p>
 *
 * <p>Yet another way to implement thread-safe lazily initialized Singleton can be found in
 * {@link InitializingOnDemandHolderIdiom}. However, this implementation requires at least Java 8
 * API level to work.</p>
 */
public class App {

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        // eagerly initialized singleton
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();
        System.out.println("ivoryTower1 = " + ivoryTower1);
        System.out.println("ivoryTower2 = " + ivoryTower2);

        // lazily initialized singleton
        ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        System.out.println("threadSafeIvoryTower1 = " + threadSafeIvoryTower1);
        System.out.println("threadSafeIvoryTower2 = " + threadSafeIvoryTower2);

        // enum singleton
        EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        System.out.println("enumIvoryTower1 = " + enumIvoryTower1);
        System.out.println("enumIvoryTower2 = " + enumIvoryTower2);

        // double checked locking
        ThreadSafeDoubleCheckLocking dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
        System.out.println(dcl1.toString());
        ThreadSafeDoubleCheckLocking dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
        System.out.println(dcl2.toString());

        // initialize on demand holder idiom
        InitializingOnDemandHolderIdiom demandHolderIdiom = InitializingOnDemandHolderIdiom.getInstance();
        System.out.println(demandHolderIdiom.toString());
        InitializingOnDemandHolderIdiom demandHolderIdiom2 = InitializingOnDemandHolderIdiom.getInstance();
        System.out.println(demandHolderIdiom2.toString());
    }
}
