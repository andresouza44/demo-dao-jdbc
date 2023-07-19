package application;

import models.dao.SellerDao;
import models.dao.impl.DaoFactory;
import models.entities.Department;
import models.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        Department dp = new Department(1,"Vendas");
        Seller sell = new Seller(21,"Maria","marioa@gmail", LocalDate.now(),3000.,dp);
        SellerDao sellerDao = DaoFactory.creatSellerDao();
        System.out.println(sell);


    }
}
