import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RemoteCart extends Remote {
    void addItem(String item) throws RemoteException;
    void removeItem(String item) throws RemoteException;
    List<String> getItems() throws RemoteException;
}
