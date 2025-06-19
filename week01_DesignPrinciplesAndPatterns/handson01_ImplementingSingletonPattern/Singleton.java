public class Singleton {
    // Step 1: private static instance variable
    private static Singleton instance;
    // Step 2: private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }
    // Step 3: public method to return the instance
    public static Singleton getInstance() {
                if (instance == null) { 
                    instance = new Singleton(); 
                }
        return instance;
    }
    // Step 4: Business logic method
    public void showMessage() {
        System.out.println("Hello from Singleton");
    }
}
