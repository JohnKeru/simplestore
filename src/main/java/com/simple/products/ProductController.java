package com.simple.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
	@Autowired
	private ProductRepository repo;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return repo.save(product);
	}
	@GetMapping
	public List<Product> getAllProduct(){
		return repo.findAll();
	}
	@DeleteMapping("/{pid}")
	public ResponseEntity<?> deleteProduct(@PathVariable int pid){
		Product product = repo.findById(pid).get();
		repo.delete(product);
		return new ResponseEntity<>("deleted!", HttpStatus.OK);
	}
}
