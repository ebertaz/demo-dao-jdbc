package br.com.application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.model.dao.DaoFactory;
import br.com.model.dao.SellerDao;
import br.com.model.entities.Department;
import br.com.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	System.out.println("=== TESTE 1: seller findById =====");
	Seller seller = sellerDao.findById(3);
	System.out.println(seller);
	
	System.out.println("=== TESTE 2: seller findByDepartment =====");
	Department department = new Department(2, null);
	List<Seller> list = sellerDao.findByDepartment(department);
	for (Seller obj : list) {
		System.out.println(obj);
		}
	
	System.out.println("=== TESTE 3: seller findAll =====");
	list = sellerDao.findAll();
	for (Seller obj : list) {
		System.out.println(obj);
		}
	
	System.out.println("=== TESTE 4: insert seller =====");
	Seller newSeller = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, department);
	sellerDao.insert(newSeller);
	System.out.println("Inserted! New id = " + newSeller.getId());
	
	System.out.println("=== TESTE 5: insert seller =====");
	seller = sellerDao.findById(1);
	seller.setName("Martha Waine");
	sellerDao.update(seller);
	System.out.println("Update Completed");
	
	System.out.println("=== TESTE 6: delete seller =====");
			System.out.println("enter id for delete test: ");
			int id = sc.nextInt();
			sellerDao.deleteById(id);
			System.out.println("Delete Complete");
			
			
	sc.close();
	}
	
	
}
