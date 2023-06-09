import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class RemoteCartImpl extends UnicastRemoteObject implements RemoteCart {
    private List<String> items;

    public RemoteCartImpl() throws RemoteException {
        items = new ArrayList<>();
    }

    public void addItem(String item) throws RemoteException {
        items.add(item);
        System.out.println("Item adicionado: " + item);
    }

    public void removeItem(String item) throws RemoteException {
        items.remove(item);
        System.out.println("Item removido: " + item);
    }

    public List<String> getItems() throws RemoteException {
        return items;
    }
}
