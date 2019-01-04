package dayHibernate;

import dayHibernate.DAO.EmployeeDao;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageEmployee {
    private static SessionFactory factory;
    public static void main(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

//        TitleDao titleDao = new TitleDao();
        EmployeeDao employeeDao = new EmployeeDao();

//        titleDao.listTitle(factory);
        employeeDao.listEmployees(factory);
    }
}