public class Articulo {

    //ENUM
    public enum IVAType {
        NORMAL,
        REDUCIDO,
        SUPERREDUCIDO
    }

    //Attributes
    private String name;
    private double priceWithoutIVA;
    private IVAType IVA;
    private int quantity;

    private TienDAM dialogue = new TienDAM();

    //Empty Constructor
    public Articulo() {

    }

    //Cosntructor
    public Articulo(String name, double priceWithoutIVA, IVAType IVA, int quantity) {
        setName(name);
        setPriceWithoutIVA(priceWithoutIVA);
        setIVA(IVA);
        setQuantity(quantity);
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPriceWithoutIVA(double priceWithOutIVA) {
        this.priceWithoutIVA = priceWithOutIVA;
    }
    public void setIVA(IVAType iVA) {
        IVA = iVA;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Getters
    public String getName() {
        return name;
    }
    public double getPriceWithoutIVA() {
        return priceWithoutIVA;
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