import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Cria uma instância do carrinho de compras remoto
            RemoteCartImpl remoteCart = new RemoteCartImpl();

            // Cria o registro RMI na porta 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Registra o carrinho de compras remoto no registro RMI
            registry.bind("RemoteCart", remoteCart);

            System.out.println("Servidor RMI iniciado.");

        } catch (Exception e) {
            System.err.println("Erro no servidor RMI: " + e.toString());
            e.printStackTrace();
        }
    }
}
