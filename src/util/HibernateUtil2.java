package util;
import org.hibernate.*;
import org.hibernate.cfg.*;

@SuppressWarnings("deprecation")
public class HibernateUtil2 {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Créer une SessionFactory à partir de hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Gestion exception
            System.err.println("échec création SessionFactory ===>>>" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    

}

