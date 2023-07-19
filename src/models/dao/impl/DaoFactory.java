package models.dao.impl;

import db.DB;
import models.dao.SellerDao;

public class DaoFactory {
    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
