
package ChainOfResponsibility;


public class ChainMain {
    public static void main(String[] args) {
        
       ComponentHandler componentHandler =  new ComponentColorAddHandler(new ComponentSizeAddHandler(null));
       componentHandler.addStringParameter("Red");
    
       
       ComponentHandler componentHandlerInt =  new ComponentColorAddHandler(new ComponentSizeAddHandler(null));
       componentHandlerInt.addIntParameter(15);
    }
}

class Component {
    int size;
    String color;
    int path;
    public void print () {
        System.out.println("Component created: size =  "+ size+ " color = "+ color+ " path = "+path);
    } 
}


//abstract class
abstract class ComponentHandler {
    ComponentHandler componentHandler;
    
    //Constructor point at themself
    public ComponentHandler (ComponentHandler componentHandler) {
        this.componentHandler = componentHandler;
    }
    
    abstract void addStringParameter (String parameter);
    abstract void addIntParameter (int parameter);
}



//Zamieniamy metodę na klasę
class ComponentColorAddHandler extends ComponentHandler {
    Component component = new Component();
    
    //constructor przyjmujący componentHandler po dziedziczeniu
    public ComponentColorAddHandler (ComponentHandler componentHandler) {
        super(componentHandler);
    }

    @Override
    void addStringParameter(String parameter) {
        component.color = parameter;
        System.out.println("Color added: " + parameter);
    }  
    
    @Override
    void addIntParameter(int parameter) {
    } 
}



//Zamieniamy metodę na klasę
class ComponentSizeAddHandler extends ComponentHandler {
    
    
    Component component = new Component();
    
    //constructor przyjmujący componentHandler po dziedziczeniu
    public ComponentSizeAddHandler (ComponentHandler componentHandler) {
        super(componentHandler);
    }

    @Override
    void addStringParameter(String parameter) {
    } 
    
    @Override
    void addIntParameter(int parameter) {
        component.size = parameter;
        System.out.println("Size added: " + parameter+ " px");
    }
  }
