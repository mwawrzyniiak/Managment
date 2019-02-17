package service;

import api.ProductService;
import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    List<Product> products;

    public ProductServiceImpl() {
        products = new ArrayList<Product>();
    }

    public ProductServiceImpl(List<Product> products) {
        this.products = products;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Integer getCountProducts() {
        return products.size();
    }

    public Product getProductByProductName(String productName) {
        for (Product x : products) {
            if (x.getProductName().equals(productName)) {
                return x;
            }
        }
        return null;
    }

    public boolean isProductOnWarehouse(String productName) {
        for (Product x : products) {
            if (isProductExist(productName) && x.getProductCount() > 0) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isProductExist(String productName) {
        for (Product x : products) {
            if (x.getProductName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isProductExist(Long productId) {
        for (Product x : products) {
            if (x.getId().equals(productId)) {
                return true;
            }
        }
        return false;
    }


}
