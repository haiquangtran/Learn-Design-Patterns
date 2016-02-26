package hqt.designpatterns.patterns.singleton;

public class EagerSingleton {
	private static EagerSingleton uniqueInstance = new EagerSingleton();
	
	private EagerSingleton() { }
	
	/**
	 * MULTITHREADING OPTIONS:
	 * 
	 * 	1)
	 * 	Add synchronized: no two threads may enter the method at the same time. 
	 *  However, synchronized is expensive and can decrease performance by a factor of 100,
	 *  so if high traffic is part of code that uses getInstances, you might have to reconsider.
	 *  
	 *  2)
	 *  Move to an eagerly created instance rather than a lazily created one.
	 *  
	 *  3)
	 *  Double-checked locking to reduce the use of synchronization in the getInstance().
	 *  We only synchronize the first time through, just what we want.
	 * 
	 * @return
	 */
	public static EagerSingleton getInstance() {
		return uniqueInstance;
	}
	
	/**
	 * For testing purposes only.
	 */
	public static EagerSingleton getUniqueInstance() {
		return uniqueInstance;
	}

}