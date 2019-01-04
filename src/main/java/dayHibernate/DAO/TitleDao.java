package dayHibernate.DAO;

import dayHibernate.Title;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class TitleDao {
    public void listTitle(SessionFactory factory ){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List titles = session.createQuery("FROM Title").list();
            for (Iterator iterator = titles.iterator(); iterator.hasNext();){
                Title title = (Title) iterator.next();
                System.out.println(title.getTitleId().getEmpNumber());
//                System.out.println(title.getFromDate());
//                System.out.println(title.getTitle());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
