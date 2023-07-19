package application;

import models.entities.Department;
import models.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        Department dp = new Department(1,"Vendas");
        Seller sell = new Seller(21,"MAria","marioa@gmail", LocalDate.now(),3000.,dp);

        System.out.println(sell);


    }
}
