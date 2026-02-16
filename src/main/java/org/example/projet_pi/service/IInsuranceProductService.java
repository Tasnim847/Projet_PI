package org.example.projet_pi.service;

import org.example.projet_pi.entity.InsuranceProduct;

import java.util.List;

public interface IInsuranceProductService {

    public InsuranceProduct addProduct(InsuranceProduct product);

    public InsuranceProduct updateProduct(InsuranceProduct product);

    public void deleteProduct(Long id);

    public InsuranceProduct getProductById(Long id);

    public List<InsuranceProduct> getAllProducts();
}
