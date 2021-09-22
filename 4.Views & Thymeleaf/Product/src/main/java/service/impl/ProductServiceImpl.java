package service.impl;

import model.Product;
import org.springframework.stereotype.Service;
import service.ProductService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private static HashMap<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Car", 100, "Good"));
        products.put(2, new Product(2, "Pen", 50, "Bad"));
        products.put(3, new Product(3, "Book", 100, "Normal"));
    }

    @Override
    public Product getProduct(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void saveProduct(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void editProduct(Product product) {
        if (products.containsKey(product.getId())) {
            products.put(product.getId(), product);
        }
    }

    @Override
    public void deleteProduct(Product product) {
        if (products.containsKey(product.getId())) {
            products.remove(product.getId(), product);
        }
    }

    @Override
    public void saveOrEdit(Product product) {
        products.put(product.getId(), product);
    }
}
