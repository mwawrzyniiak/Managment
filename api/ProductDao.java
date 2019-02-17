package api;

import entity.Product;

import java.io.IOException;
import java.util.List;

public interface ProductDao {
    void saveProduct(Product product) throws IOException;
    void saveProducts(List<Product> products) throws IOException;

    void removeProductById(Long productID) throws IOException;
    void removeProductByName(String productName) throws IOException;

    List<Product> getAllProducts() throws IOException;
    Product getProductById(Long productId) throws IOException;
    Product getProductByProductName(String productName) throws IOException;
}
