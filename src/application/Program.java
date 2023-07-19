package application;

import models.dao.SellerDao;
import models.dao.impl.DaoFactory;
import models.entities.Department;
import models.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.creatSellerDao();
        System.out.println("==== TEST 01: seller findById ====");

        Seller seller = sellerDao.findById(2);
        System.out.println(seller);



    }
}
