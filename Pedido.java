import java.util.ArrayList;

public class Pedido {

    //Attributes
    private String name;
    private int ticketID;
    private double discountPercentage;
    private double subtotal;
    private double finalPrice;

    ArrayList<Pedido> ticket = new ArrayList<>();

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
    //addClientID(String name)
    public String addClientID(String name) {
        this.name = name;
        return name;
    }
    //getNumTicketID()
    public int getNumTicketID() {
        int ID = (int)(Math.random() * (999999 - 100000) + 100000);
        this.ticketID = ID;
        return ID;
    }
    //addArticle(int position)
    public void addArticle(int position) {

    }
    //removeArticle(int position)
    //modifyArticleQuantity(int position, int quantity)
    //addDiscount()
    //doSell()
    //showBasket()
}