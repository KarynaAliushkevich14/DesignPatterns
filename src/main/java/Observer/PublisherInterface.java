package Observer;

import java.util.ArrayList;

public interface PublisherInterface {
    
    //interface methods
    ArrayList<ListenerInterface> getListeners();
    
    void addListener (ListenerInterface listener);
    
    public void removeListener (ListenerInterface listener);
    
    public void notifySubscribers (String message);
    
}
