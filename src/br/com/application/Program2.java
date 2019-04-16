package br.com.application;

import java.util.Date;

import br.com.model.dao.DaoFactory;
import br.com.model.dao.DepartmentDao;
import br.com.model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: insert seller =====");
		Department newDepartment = new Department(5, "Musics");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("=== TESTE 2: update seller =====");
		Department department = departmentDao.findById(1);
		department.setName("Desktops");
		departmentDao.update(department);
		System.out.println("Department updated");
	}

}
