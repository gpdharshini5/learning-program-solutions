package handson01_ECommercePlatformSearchFunction;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Beauty"),
            new Product(103, "Book", "Education"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Chair", "Furniture"),
            new Product(106, "Tablet", "Electronics"),
            new Product(107, "Comb", "Beauty")
        };
        // Search by name and category
        System.out.println("Search for 'Mobile' in 'Electronics':");
        Product found = SearchUtility.searchByNameAndCategory(products, "Mobile", "Electronics");
        System.out.println(found != null ? found : "Product not found.");

        // Filter by category
        System.out.println("\nAll 'Beauty' products:");
        List<Product> beautyProducts = SearchUtility.filterByCategory(products, "Beauty");
        for (Product p : beautyProducts) {
            System.out.println(p);
        }

        // Sort by category and name
        System.out.println("\nProducts sorted by category and then name:");
        SearchUtility.sortByCategoryAndName(products);
        for (Product p : products) {
            System.out.println(p);
        }
    }
}