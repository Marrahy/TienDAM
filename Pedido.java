import java.util.ArrayList;

public class Pedido {

    //Attributes
    private String name;
    private int ticketID;
    private double discountPercentage;
    private double subtotal;
    private double finalPrice;
    private int numMaxArticles = 0;

    private ArrayList<Articulo> ticket = new ArrayList<>();
    private Almacen manageStorage = new Almacen();
    private Articulo manageArticle = new Articulo();

    //Empty constructor
    public Pedido() {

    }

    //Constructor
    public Pedido(String name, int ticketID, double discountPercentage, double subtotal, double finalPrice) {
        setName(name);
        setTicketID(ticketID);
        setDiscountPercentage(discountPercentage);
        setSubtotal(subtotal);
        setFinalPrice(finalPrice);
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getTicketID() {
        return ticketID;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public double getFinalPrice() {
        return finalPrice;
    }

    //Methods
    public String addClientID(String name) {
        this.name = name;
        return name;
    }

    public int getNumTicketID() {
        int ID = (int)(Math.random() * (999999 - 100000) + 100000);
        this.ticketID = ID;
        return ID;
    }

    /*
     * Metodo recoge una posicion introducida por el usuario, esta posicion es la posicion en la array de articulos de almacen
     * este articulo se añade a la array de articulos de pedido
     */

    public void addArticleToOrder(int position) {
        Articulo article = manageStorage.getArticulo(position - 1);
        ticket.add(numMaxArticles, article);
        numMaxArticles++;
    }

    public boolean removeArticleFromOrder(int position) {
        if (position <= numMaxArticles && position > 0) {
            ticket.remove(position - 1);
            numMaxArticles--;
            return true;
        } else {
            return false;
        }
    }

    public boolean modifyArticleQuantity(int position, int quantity) {
        if (manageArticle.getQuantity() > quantity) {
            manageArticle.setQuantity(quantity);
            return true;
        } else {
            System.out.println("Artículo agotado.");
            return false;
        }
    }

    public boolean addDiscount(double discountPercentaje) {
        this.discountPercentage = discountPercentaje;
        return true;
    }

    public void doSell() {
        System.out.println("Cliente: " + getName() + "          " + "ID del ticket: " + getNumTicketID());
        System.out.println("Artículo" + "               " + "Precio sin IVA" + "                " + "Cantidad" + "              " + "Tipo de IVA");
        for (int i = 0; i < ticket.size(); i++) {
            System.out.println((i + 1) +". " + manageArticle.getName() + "                " + manageArticle.getPriceWithoutIVA() + "                " + manageArticle.getQuantity() + "             " + manageArticle.getIVA());
        }
        System.out.println("Descuento a aplicar: " + getDiscountPercentage());
        System.out.println("Subtotal: " + getSubtotal() + "             " + "Precio final: " + getFinalPrice());
    }

    //showBasket()
    public void showBasket() {
        for (int i = 0; i < ticket.size(); i++) {
            Articulo getArticle = ticket.get(i);
            System.out.println((i + 1) + ". " + "Nombre: " + getArticle.getName() + " Precio sin IVA: " + getArticle.getPriceWithoutIVA() + "$" + " Tipo de IVA: " + getArticle.getIVA() + " Cantidad en stock: " + getArticle.getQuantity() + " unidades.");
        }
    }
}