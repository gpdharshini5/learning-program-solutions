package handson01_ECommercePlatformSearchFunction;
import java.util.*;
public class SearchUtility {
    // Linear search by both name and category
    public static Product searchByNameAndCategory(Product[] products, String name, String category) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name) &&
                product.category.equalsIgnoreCase(category)) {
                return product;
            }
        }
        return null;
    }

    // Filter all products in a category
    public static List<Product> filterByCategory(Product[] products, String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.category.equalsIgnoreCase(category)) {
                result.add(product);
            }
        }
        return result;
    }

    // Sort products by category and then name
    public static void sortByCategoryAndName(Product[] products) {
        Arrays.sort(products, Comparator
            .comparing((Product p) -> p.category.toLowerCase())
            .thenComparing(p -> p.productName.toLowerCase()));
    }
}