package Observer;

public class ObserverMain {
    
    public static void main(String[] args) {
        
        SubscriberOne subscriberOne = new SubscriberOne();
        Publisher publisher = new Publisher();

        publisher.addListener(subscriberOne);

        publisher.createNewMessage ("Harry Potter J.K.Rowling"); 
        
    }
    
    
}
