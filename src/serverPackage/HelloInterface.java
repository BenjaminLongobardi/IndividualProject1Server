package serverPackage;
import java.rmi.*;
/**
 * Created by Benjamin on 9/30/2017.
 */
public interface HelloInterface extends Remote{
    public String response(String message) throws java.rmi.RemoteException;
}
