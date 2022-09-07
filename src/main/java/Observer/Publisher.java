package Observer;

import java.util.ArrayList;

public class Publisher implements PublisherInterface{
    
    private ArrayList<ListenerInterface> listeners = new ArrayList<>();

    //Override interface methods
    @Override
    public ArrayList<ListenerInterface> getListeners() {
        return listeners;
    }

    @Override
    public void addListener(ListenerInterface listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(ListenerInterface listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifySubscribers(String message) {
       for (ListenerInterface actionListener : listeners) {
           actionListener.doAction(message);
       }
    }
    
    public void createNewMessage (String message) {
        System.out.println("Publisher just added new article! " + message);
        notifySubscribers(message);
    }
     
}
