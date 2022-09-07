/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author a881146
 */
public class SubscriberOne implements ListenerInterface {

    @Override
    public void doAction(String message) {
        System.out.println("You recieved " + message);
    }
   
}
