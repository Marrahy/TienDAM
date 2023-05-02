public class Pedido {

    //Attributes
    private final String name = "";
    private double discountPercentage;
    private double subtotal;
    private double finalPrice;

    private final int maxArticulos = 10;
    int[][] ticket = new int[maxArticulos][maxArticulos];

    //Empty constructor
    public Pedido() {

    }

    //Constructor
    public Pedido(String name, double discountPercentage, double subtotal, double finalPrice) {
        setDiscountPercentage(discountPercentage);
        setSubtotal(subtotal);
        setFinalPrice(finalPrice);
    }

    //Setters
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

}