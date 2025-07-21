package org.example.demo_spring_base.controller;

import ch.qos.logback.core.model.Model;
import org.example.demo_spring_base.model.Product;
import org.example.demo_spring_base.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class ProductController {
//private ProductService productService;
//
//public ProductController(ProductService productService) {
//    this.productService = productService;
//}

// All products
@GetMapping("/all")
//@ResponseBody
//public List<Product> getAllProducts() {
//    return productService.getAllProducts();
//}

public String all() {
    return "all";
}
// Par Id
//    @RequestMapping("/{id}")
//    @ResponseBody
//    public Product getProductById(@PathVariable UUID id) {
//    System.out.println("Mon id est : " + id);
//    return productService.getProductById(id);
//    }

// Filtre
//    @GetMapping ("/filter")
//    @ResponseBody
//    public List<Product> filterProducts(
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) String category
//    ) {
//        return productService.filterProducts(name, category);
//    }

}
