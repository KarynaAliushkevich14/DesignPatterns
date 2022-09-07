
package Adapter;


public class AdapterMain {
    
    public static void main(String[] args) {
        AmericanSocket socket = new AmericanSocketInstance();
        Radio radio = new Radio();

        EuroSocket euroSocket = new SocketAdapter(socket);
        radio.listenMusic(euroSocket);   
    }
   
    
}
