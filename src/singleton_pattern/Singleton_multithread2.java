package singleton_pattern;

/**
 * Only one instance of Singleton is ever created
 * 
 * @author Anna
 *
 */
public class Singleton_multithread2 {

	private static Singleton_multithread2 uniqueInstance = new Singleton_multithread2();

	private Singleton_multithread2() {}

	/**
	 * dealing with multithreading
	 * the JVM guarantees that the instance will be created before any thread accesses the static uniqueInstance variable
	 * @return uniqueInstance
	 */
	public static Singleton_multithread2 getInstance() {
		return uniqueInstance;
	}
}
