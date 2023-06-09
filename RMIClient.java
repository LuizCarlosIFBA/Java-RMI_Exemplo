import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.List;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Localiza o registro RMI na porta 1099
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Obtém a referência ao carrinho de compras remoto do registro RMI
            RemoteCart remoteCart = (RemoteCart) registry.lookup("RemoteCart");

            // Adiciona itens ao carrinho de compras
            remoteCart.addItem("Item 1");
            remoteCart.addItem("Item 2");

            // Obtém a lista de itens do carrinho de compras
            List<String> items = remoteCart.getItems();
            System.out.println("Itens no carrinho de compras: " + items);

            // Remove um item do carrinho de compras
            remoteCart.removeItem("Item 1");

            // Obtém a lista de itens atualizada do carrinho de compras
            items = remoteCart.getItems();
            System.out.println("Itens no carrinho de compras: " + items);

        } catch (Exception e) {
            System.err.println("Erro no cliente RMI: " + e.toString());
            e.printStackTrace();
        }
    }
}
