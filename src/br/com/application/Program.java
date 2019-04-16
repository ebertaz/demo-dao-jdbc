package br.com.application;

import br.com.model.dao.DaoFactory;
import br.com.model.dao.SellerDao;
import br.com.model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		
	
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	Seller seller = sellerDao.findById(3);
	
	System.out.println(seller);
	
	}

}
