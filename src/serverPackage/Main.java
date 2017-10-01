package serverPackage;
/*
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
*/
import java.rmi.*;

import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String args[]) {
        try {
            int port = 16790;
            String host = "localhost";
            HelloImpl exportedObj = new HelloImpl();
            String registryURL = "rmi://" + host + ":" + port + "/hello";
            LocateRegistry.createRegistry(port);
            Naming.rebind(registryURL, exportedObj);
            System.out.println("Hello Server ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
