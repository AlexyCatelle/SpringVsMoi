package org.example.demo_spring_base.service;

import org.example.demo_spring_base.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        initProducts();
    }

    private void initProducts(){
        products.add(Product.builder()
                .id(UUID.randomUUID())
                .name("iPhone 14")
                .description("Smartphone Apple 128GB")
                .category("Électronique")
                .build());

        products.add(Product.builder()
                .id(UUID.randomUUID())
                .name("Chaise ergonomique")
                .description("Chaise de bureau confortable")
                .category("Mobilier")
                .build());

        products.add(Product.builder()
                .id(UUID.randomUUID())
                .name("Café en grains")
                .description("Café arabica 1kg")
                .category("Alimentaire")
                .build());
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(UUID id) {
        return products.stream()
              .filter(t -> t.getId().equals(id))
               .findFirst().orElse(null);
    }

    public List<Product> filterProducts(String name, String category) {
        return products.stream()
                .filter(p -> name == null || p.getName().toLowerCase().contains(name.toLowerCase()))
                .filter(p -> category == null || p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
}

