
package Decorator;


public class ColorDecorator extends Decorator{
    
        public ColorDecorator (Component component){
            super(component);
        }

    @Override
    public void afterDraw() {
        System.out.println("Let's add color: Red");
    }
        
}
