package one.digitalinnovation.productcatalog.controller;


import one.digitalinnovation.productcatalog.model.Product;
import one.digitalinnovation.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value="/product")

public class ProductController {


    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> findProduct() {
        return (List<Product>) productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return productRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

}
