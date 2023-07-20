package application;

import models.dao.SellerDao;
import models.dao.impl.DaoFactory;
import models.entities.Department;
import models.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
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

//        System.out.println("\n==== TEST 04: seller insert ====");
//        Seller newSeller = new Seller(null,"Clara Nunes","clara@gmail",new Date(),3500.,department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted new Id = " + newSeller.getId() );


        System.out.println("\n==== TEST 05: seller updat ====");
        seller = sellerDao.findById(12);
        seller.setName("Maria Carolina");
        seller.setEmail("maria@gmail");

        sellerDao.update(seller);
        System.out.println("Update completed!" );

        System.out.println("\n==== TEST 06: seller deleted ====");
        sellerDao.deleteById(9);
        System.out.println("Delete Completed");

    }
}
