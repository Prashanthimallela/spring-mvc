package com.training.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.dao.ProductDao;
import com.training.springmvc.model.Cart;
import com.training.springmvc.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;
	
	public Product getProduct() {
		Product p1 = productDao.getProductById(11);
		return p1;
	}

	public List<Product> getAllProducts() {
		List<Product> productList = productDao.getProducts();
		return productList;
	}

	public boolean addProduct(Product product) {
		
		return productDao.createProduct(product);
	}

	@Override
	public boolean deleteProduct(int prodId) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(prodId);
	}
	
    public boolean updateProduct(Product product) {
		
		return productDao.updateProduct(product);
	}
    
    public List<Cart> getAllCarts() {
        List<Cart> cartList = productDao.getCart();
		
		return cartList;
	}
}
