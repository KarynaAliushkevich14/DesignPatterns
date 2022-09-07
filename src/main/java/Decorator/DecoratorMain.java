
package Decorator;

public class DecoratorMain {
    
    public static void main(String[] args) {
       Component button = new Button();
       button.draw(); 
       System.out.println("");
       
       
       Component buttonWithColor = new ColorDecorator(new Button());
       buttonWithColor.draw();
       
    }   
}
