package com.gn.mapper;

import java.util.List;

import com.gn.dto.Product;

public interface ProductMapper {
	List<Product> searchProduct(Product param);
}
