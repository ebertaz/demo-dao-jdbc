package br.com.model.dao;

import br.com.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	
	public static SellerDao createSellerDao() {
		
		
		return new SellerDaoJDBC();
	}
}

