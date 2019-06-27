package com.algomi.interview.services;

import com.algomi.interview.adapters.ProductsDAOAdapter;
import com.algomi.interview.domain.ProductsIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired private ProductsDAOAdapter dao;

    public ProductsIO getProducts() {
        return dao.getProductsFromSource();
    }
}
