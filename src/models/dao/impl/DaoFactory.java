package models.dao.impl;

import db.DB;
import models.dao.DepartmentDao;
import models.dao.SellerDao;

public class DaoFactory {
    public static SellerDao creatSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao creatDepartmentDao(){
        return  new DepartmentDaoJDBC(DB.getConnection());
    }
}
