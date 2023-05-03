import java.util.Scanner;

public class TienDAM {
    
    private static Scanner input = new Scanner(System.in);
    private static Almacen storage = new Almacen();
    private static Articulo.IVAType IVA;
    private static boolean running = true;

    public static void main(String[] args) {
        System.out.println("!Bienvenido a TienDAM!");
        //storage.load();
        //articulo.load();
        while (running) {
            menu();
        }
    }

    public static void bufferCleaner() {
        input.nextLine();
    }

    public static int storageDiaologue() {
        System.out.println();
        System.out.println("Has accedido al almacén, a continuación se mostrá un menú para gestionarlo.");
        System.out.println();
        System.out.println("1. Añadir artículo.");
        System.out.println("2. Remover artículo.");
        System.out.println("3. Modificar precio del artículo.");
        System.out.println("4. Ver artículos.");
        System.out.println("5. Buscar artículo.");
        System.out.println("6. Recibir cantidad de atículos.");
        System.out.println("7. Devolver cantidad de artículos.");
        System.out.println("8. Salir al menú principal.");
        System.out.println();
        System.out.print("Selecciona una opción: ");
        int option = input.nextInt();

        bufferCleaner();

        return option;
    }

    public static int orderDialogue() {
        System.out.println("Has accedido al menú de pedido, se ha creado un nuevo pedido.");
        System.out.println();
        System.out.println("1. Añadir artículo a la cesta.");
        System.out.println("2. Quitar artículo de la cesta.");
        System.out.println("3. Modificar cantidad de un artículo");
        System.out.println("4. Aplicar descuento.");
        System.out.println("5. Comprar.");
        System.out.println("6. Salir al menú principal.");
        System.out.println("Selecciona una opción: ");
        int option = input.nextInt();
        System.out.println();

        bufferCleaner();

        return option;
    }

    public static void menu() {        
        System.out.println();
        System.out.println("1. Almacén");
        System.out.println("2. Pedido");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
        int option = input.nextInt();
        System.out.println();

        switch (option) {
            case 1:
                switch (storageDiaologue()) {
                    case 1:
                        storage.addItem(addArticle());
                    break;
                    case 2:
                        storage.showArticles();
                        storage.removeItem(getPosition());
                    break;
                    case 3:
                        storage.showArticles();
                        storage.modifyItemPrice(getPosition(), getQuantity());
                    break;
                    case 4:
                        storage.showArticles();
                    break;
                    case 5:
                        storage.searchItem(getName());
                    break;
                    case 6:
                        storage.recieve(getPosition(), getQuantity());
                    break;
                    case 7:
                        storage.sendBack(getPosition(), getQuantity());
                    break;
                    case 8:
                        menu();
                    break;
                    default:
                        break;
                }
                System.out.println();
            break;
            case 2:
                switch (orderDialogue()) {
                    case 1:
                        
                    break;
                    case 2:

                    break;
                    case 3:

                    break;
                    case 4:

                    break;
                    case 5:

                    break;
                    case 6:

                    break;
                    default:
                        break;
                }
            break;
            case 3:
                System.out.println("Taluego!");
                running = false;
            break;
            default:
                break;
        }
    }

    public static Articulo addArticle() {
        System.out.println();
        System.out.print("Nombre: ");
        String name = input.nextLine();
        System.out.print("Precio: ");
        double price = input.nextDouble();
        System.out.println("1. IVA Normal (21%)");
        System.out.println("2. IVA Reducido (10%)");
        System.out.println("3. IVA Superreducido (4%)");
        System.out.print("Selecciona el tipo de IVA: ");
        int ivaSelected = input.nextInt();
        if (ivaSelected == 1) {
            IVA = Articulo.IVAType.NORMAL;
        }
        else if (ivaSelected == 2) {
            IVA = Articulo.IVAType.REDUCIDO;
        }
        else {
            IVA = Articulo.IVAType.SUPERREDUCIDO;
        }
        System.out.print("Número de artículos almacenados: ");
        int quantity = input.nextInt();

        Articulo article = new Articulo(name, price, IVA, quantity);

        bufferCleaner();

        return article;
    }

    public static int getPosition() {
        System.out.print("Introduce el número del artículo: ");
        int position = input.nextInt();

        return position;
    }

    public static int getQuantity() {
        System.out.print("Introduce una cantidad: ");
        int quantity = input.nextInt();

        if (quantity > 0) {
            return quantity;    
        } else {
            System.out.println("Introduce una cantidad válida.");
            getQuantity();
            return 0;
        }
    }

    public static String getName() {
        System.out.println();
        System.out.print("Nombre del producto: ");
        String name = input.nextLine();
        return name;
    }
}