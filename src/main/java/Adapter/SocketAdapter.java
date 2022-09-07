
package Adapter;


public class SocketAdapter implements EuroSocket{
   
    AmericanSocket americanSocket;
    
    //EuroSocket constructor with AmericanSocket
    public SocketAdapter ( AmericanSocket americanSocket){
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
    
    
}