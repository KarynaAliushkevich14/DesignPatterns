
package Adapter;


public class Radio {
    
    //working only with Euro Socket
    public void listenMusic (EuroSocket euroSocket) {
        euroSocket.getPower();
    }
    
}
