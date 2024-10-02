package entities;

// Classe que representa um Produto com nome e preço
public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    // Construtor para inicializar o nome e o preço do produto
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getters para acessar o nome e o preço do produto
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    // Método para comparar produtos com base no preço (usado para encontrar o máximo)
    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }

    // Método para retornar a representação textual do produto
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
