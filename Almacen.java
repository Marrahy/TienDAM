import java.util.ArrayList;

public class Almacen {

    //Attributes
    private ArrayList<Articulo> articulos = new ArrayList<>();
    private static int numArticles = 0;

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
        articulos.add(numArticles, item);
        numArticles++;
        return true;
    }

    public boolean removeItem(int position) {
        if (position <= numArticles && position > 0) {
            articulos.remove(position - 1);
            numArticles--;
            return true;
        } else {
            return false;
        }
    }

    public boolean modifyItemPrice(int position, int price) {
        if (price > 0) {
            Articulo article = articulos.get(position - 1);
            article.setPriceWithoutIVA(price);
            return true;
        } else {
            return false;
        }
    }

    public void searchItem(String name) {
        int pos = 1;
        for (Articulo article : articulos) {
            if (article.getName().contains(name)) {
                System.out.println((pos + 1) + "Nombre: " + article.getName());
            }
        }
    }

    public void recieve(int position, int quantity) {
        articulos.get(position - 1).increase(quantity);
    }

    public void sendBack(int position, int quantity) {
        articulos.get(position - 1).decrease(quantity);
    }

    public void showArticles() {
        for (int i = 0; i < articulos.size(); i++) {
            Articulo getArticle = articulos.get(i);
            System.out.println((i + 1) + ". " + "Nombre: " + getArticle.getName() + " Precio sin IVA: " + getArticle.getPriceWithoutIVA() + "$" + " Tipo de IVA: " + getArticle.getIVA() + " Cantidad en stock: " + getArticle.getQuantity() + " unidades.");
        }
    }
}