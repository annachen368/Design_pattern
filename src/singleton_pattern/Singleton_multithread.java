package singleton_pattern;

/**
 * Only one instance of Singleton is ever created
 * 
 * @author Anna
 *
 */
public class Singleton_multithread {

	private static Singleton_multithread uniqueInstance;

	private Singleton_multithread() {}

	/**
	 * dealing with multithreading
	 * @return uniqueInstance
	 */
	public static synchronized Singleton_multithread getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton_multithread();
		}
		return uniqueInstance;
	}
}
