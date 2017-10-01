package serverPackage;

/**
 * Created by Benjamin on 9/30/2017.
 */
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class HelloImpl extends UnicastRemoteObject
        implements HelloInterface {

    public HelloImpl() throws RemoteException {
        super( );
    }

    public String response(String clientMessage)
            throws RemoteException {
        if(!clientMessage.equals("bye")){
            System.out.println("Client: "+clientMessage);
            System.out.println("Enter a new message");
            Scanner keyboard = new Scanner(System.in);
            String message = keyboard.nextLine();
            return message;
        }
        else{
            return "have a nice day";
        }
    }
}
