import java.util.ArrayList;

public class Almacen {

    //Attributes
    private ArrayList<Articulo> articulos = new ArrayList<>();

    //Empty Constructor
    public Almacen() {

    }

    //Constructor
    public Almacen(Articulo item) {
        setArticulos(articulos);
    }

    //Setters
    public void setArticulos(ArrayList<Articulo> items) {
        this.articulos = items;
    }

    //Getters
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    //Methods
    public boolean addItem(Articulo item) {
        //manage.addItem();
        return true;
    }

    public boolean addItem(String name, double price, Articulo.IVAType IVA, int quantity) {
        //manage.addItem();
        return true;
    }

    public boolean removeItem(int position) {
        //manage.removeItem
        return true;
    }

    public boolean modifyItemPrice(int position, int price) {
        //manage.modifyItemPrice
        return true;
    }

    public void searchItem(String name) {
        for (Articulo a : articulos) {
            if (a.getName().contains(name))
                System.out.println(a);
        }
    }

    public void recieve(int position, int quantity) {
        articulos.get(position).increase(quantity);
    }

    public void sendBack(int position, int quantity) {
        articulos.get(position).decrease(quantity);
    }
}