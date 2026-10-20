package dinhlam2901.sunilies.modules.product.repository;

import dinhlam2901.sunilies.modules.product.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();
    public ProductRepository() {
        products.add(new Product("1", "sandy-bag", "Sandy Bag", 350000.0, 500000.0, "/image/sandy.jpg", "bag", "dang-ha"));
    }

    public List<Product> findAll() {
        return products;
    }
    
    public Optional<Product> findByHandle(String handle) {
        return products.stream().filter(p -> p.getHandle().equals(handle)).findFirst();
    }
    
    public List<Product> findByCollection(String collection) {
        return products.stream().filter(p -> p.getCollection().equals(collection)).toList();
    }

    public List<Product> findByCategory(String category) {
        return products.stream().filter(p -> p.getCategory().equals(category)).toList();
    }
}