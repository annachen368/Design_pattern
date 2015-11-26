package singleton_pattern;

/**
 * Only one instance of Singleton is ever created
 * 
 * @author Anna
 *
 */
public class Singleton_multithread3 {

	private static volatile Singleton_multithread3 uniqueInstance = new Singleton_multithread3();

	private Singleton_multithread3() {}

	/**
	 * dealing with multithreading
	 * With double-checked locking, we first check to see if an instance is created,
	 * if not, then we synchronize.
	 * @return uniqueInstance
	 */
	public static Singleton_multithread3 getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton_multithread3.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton_multithread3();
				}
			}
		}
		return uniqueInstance;
	}
}
