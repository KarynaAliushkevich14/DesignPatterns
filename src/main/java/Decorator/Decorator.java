
package Decorator;

//decorator for component
public abstract class Decorator implements Component {
    
    public Component component;
    
    public Decorator (Component component){
        this.component=component;
    }
    
    //abstract method
    public abstract void afterDraw();

    @Override
    public void draw() {
       component.draw();
       afterDraw();
    }
    
    
    
}
