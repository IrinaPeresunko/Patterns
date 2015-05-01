package singleton;

// NOTE: This is not thread safe!

public class SingletonClassic {
	private static SingletonClassic uniqueInstance;
 
	// other useful instance variables here
 
	private SingletonClassic() {}
 
	public static SingletonClassic getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonClassic();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
