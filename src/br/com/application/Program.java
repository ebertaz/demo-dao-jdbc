package br.com.application;

import br.com.model.dao.DaoFactory;
import br.com.model.dao.SellerDao;
import br.com.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	System.out.println("=== TESTE 1: seller findById =====");
	
	
	Seller seller = sellerDao.findById(3);
	
	System.out.println(seller);
	
	}

}
