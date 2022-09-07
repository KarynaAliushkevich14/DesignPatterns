
package Builder;


class MainBuilder {
    
    public static void main(String[] args) {
        
        //create Component
        Component component = new ComponentBuilderImpl().build();
        component.print();
        
        //create Component with color
         Component componentWithColor = new ComponentBuilderImpl().setColor("Red").setSize(5).build();
         componentWithColor.print();
        
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

interface ComponentBuilder {
    ComponentBuilder setSize(int size);
    ComponentBuilder setColor(String color);
    ComponentBuilder setPath(int path);
    Component build();
}

class ComponentBuilderImpl implements ComponentBuilder {

    Component component = new Component();
    
    //interface methods 

    @Override
    public ComponentBuilder setSize(int size) {
        component.size = size;
        return this;
    }

    @Override
    public ComponentBuilder setColor(String color) {
        component.color = color;
        return this;
    }

    @Override
    public ComponentBuilder setPath(int path) {
        component.path = path;
        return this;
    }

    @Override
    public Component build() {
       return component;
    }
}

