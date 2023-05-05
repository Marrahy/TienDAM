import java.util.ArrayList;

public class Almacen {

    //Attributes
    private ArrayList<Articulo> articles = new ArrayList<>();
    private static int numArticles = 0;

    //Empty Constructor
    public Almacen() {

    }

    //Constructor
    public Almacen(Articulo article) {
        setArticles(articles);
    }

    //Setters
    public void setArticles(ArrayList<Articulo> article) {
        this.articles = article;
    }

    //Getters
    public ArrayList<Articulo> getArticles() {
        return articles;
    }

    //Methods

    //Load storage articles as a examples
    public void loadStorageArticles() {
        Articulo boli = new Articulo("Boli", 0.80, Articulo.IVAType.NORMAL, 100);
        Articulo platano = new Articulo("Plátano", 0.25, Articulo.IVAType.REDUCIDO, 0);
        Articulo monitor = new Articulo("Monitor", 150, Articulo.IVAType.SUPERREDUCIDO, 250);
        Articulo teclado = new Articulo("Teclado", 50, Articulo.IVAType.SUPERREDUCIDO, 2);
        Articulo ordenador = new Articulo("Ordenador", 800, Articulo.IVAType.NORMAL, 5);

        articles.add(boli);
        articles.add(platano);
        articles.add(monitor);
        articles.add(teclado);
        articles.add(ordenador);
    }
    
    public boolean addItem(Articulo article) {
        articles.add(numArticles, article);
        numArticles++;
        return true;
    }


    public boolean removeItem(int position) {
        if (position <= numArticles && position > 0) {
            articles.remove(position - 1);
            numArticles--;
            return true;
        } else {
            return false;
        }
    }

    public boolean modifyItemPrice(int position, double price) {
        if (price > 0) {
            Articulo article = articles.get(position - 1);
            article.setPriceWithoutIVA(price);
            return true;
        } else {
            return false;
        }
    }

    public void searchItem(String name) {
        int pos = 1;
        for (Articulo article : articles) {
            if (article.getName().contains(name)) {
                System.out.println((pos + 1) + "Nombre: " + article.getName());
            }
        }
    }

    public void recieve(int position, int quantity) {
        articles.get(position - 1).increase(quantity);
    }

    public void sendBack(int position, int quantity) {
        articles.get(position - 1).decrease(quantity);
    }

    public void showArticles() {
        for (int i = 0; i < articles.size(); i++) {
            Articulo getArticle = articles.get(i);
            System.out.println((i + 1) + ". " + "Nombre: " + getArticle.getName() + " Precio sin IVA: " + getArticle.getPriceWithoutIVA() + "$" + " Tipo de IVA: " + getArticle.getIVA() + " Cantidad en stock: " + getArticle.getQuantity() + " unidades.");
        }
    }

    public Articulo getArticulo(int position) {
        Articulo article = articles.get(position);
        return article;
    }
}