package application;

import models.dao.DepartmentDao;
import models.dao.SellerDao;
import models.dao.impl.DaoFactory;
import models.entities.Department;
import models.entities.Seller;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();

        System.out.println("==== TEST 01: Department findById ====");
        Department department = departmentDao.findById(8);
        System.out.println(department);

        System.out.println("\n==== TEST 02: Department findAll ====");
        List<Department> lista =  departmentDao.findAll();
        for (Department department1 : lista) {
            System.out.println(department1);

        }
//        System.out.println("\n==== TEST 03: Department insert ====");
//        departmentDao.insert(new Department(null,"Brinquedos"));

        System.out.println("\n==== TEST 04: Department update ====");
        department = departmentDao.findById(9);
        department.setName("Roupas Femininas");
        departmentDao.update(department);
        System.out.println("Updade Completed");

        System.out.println("\n==== TEST 05: Department delate ====");
        departmentDao.deleteById(8);
        departmentDao.deleteById(11);
        departmentDao.deleteById(12);
        System.out.println("Delete Completed");




    }
}
