package Singleton;

public class MainSingleton {
    
    public static void main(String[] args) {
        
        LazySingleton.getInstance().print(); 
        LazySingleton.getInstance().print(); 
        LazySingleton.getInstance().print(); 
        
        LazySingleton singleton = LazySingleton.getInstance(); 
        singleton.sqlQuery("SELECT * FROM table");
        
        
        
    }  
}
