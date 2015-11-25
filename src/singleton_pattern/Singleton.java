package singleton_pattern;

/**
 * Only one instance of Singleton is ever created
 * @author Anna
 *
 */
public class Singleton {
	
	private static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
