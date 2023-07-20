package application;

import models.dao.SellerDao;
import models.dao.impl.DaoFactory;
import models.entities.Department;
import models.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.creatSellerDao();
        System.out.println("==== TEST 01: seller findById ====");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("\n==== TEST 02: seller findByDepartmente ====");
        Department department = new Department(2,null);
        List <Seller> list =  sellerDao.findByDepartmente(department);

        for (Seller seller1 : list) {
            System.out.println(seller1);

        }
        System.out.println("\n==== TEST 03: seller findAll ====");
        list =  sellerDao.findAll();

        for (Seller seller1 : list) {
            System.out.println(seller1);

        }


    }
}
