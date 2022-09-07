package Singleton;

public class LazySingleton {
    
    private static LazySingleton instance;
    private String sql;
    
    //empty private constructor
    private LazySingleton() {}
    
    //public static method to get new Singleton object
    public static LazySingleton getInstance() {
        if (instance==null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    
    //additional method 
    public void print() {
        System.out.println(this);
    }
    
    //all sql requests goes through this method
    public void sqlQuery (String sql){
        this.sql= sql;
    }   
}
