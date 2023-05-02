public class Articulo {

    //ENUM
    public enum IVAType {
        NORMAL,
        REDUCIDO,
        SUPERREDUCIDO
    }

    //Attributes
    private final String name = "";
    private double priceWithOutIVA;
    private final IVAType IVA = IVAType.NORMAL;
    private int quantity;

    private TienDAM dialogue = new TienDAM();

    //Empty Constructor
    public Articulo() {

    }

    //Cosntructor
    public Articulo(String name, double priceWithOutIVA, IVAType IVA, int quantity) {
        setPriceWithOutIVA(priceWithOutIVA);
        setQuantity(quantity);
    }

    //Setters
    public void setPriceWithOutIVA(double priceWithOutIVA) {
        this.priceWithOutIVA = priceWithOutIVA;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Getters
    public String getName() {
        return name;
    }
    public double getPriceWithOutIVA() {
        return priceWithOutIVA;
    }
    public IVAType getIVA() {
        return IVA;
    }
    public int getQuantity() {
        return quantity;
    }

    //Methods
    public boolean increase(int quantity) {
        //manage.getQuantity()
        if (quantity <= this.quantity && quantity > 0) {
            this.quantity += quantity;
            return true;
        } else {
            return false;
        }
    }

    public boolean decrease(int quantity) {
        //manage.getQuantity()
        if (quantity <= this.quantity && quantity > 0) {
            this.quantity -= quantity;
            return true;
        } else {
            return false;
        }
    }
}