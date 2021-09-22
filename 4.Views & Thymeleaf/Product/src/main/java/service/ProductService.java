package service;

import model.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(int id);
    List<Product> findAll();
    void saveProduct(Product product);
    void editProduct(Product product);
    void deleteProduct(Product product);
    void saveOrEdit(Product product);
}
