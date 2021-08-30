package one.digitalinnovation.productcatalog.controller;

import one.digitalinnovation.productcatalog.model.Product;
import one.digitalinnovation.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value="/product")

public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product produto) {
        return productRepository.save(produto);
    }

    @PutMapping
    public Product update(@RequestBody Product produto) {
        return productRepository.save(produto);
    }

    @GetMapping
    public Iterable<Product> findProduct() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return productRepository.findById(id);
    }
}
