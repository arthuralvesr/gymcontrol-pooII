package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConexaoHibernate {

    private static SessionFactory factory;

    static {
        try {

            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

        } catch (Exception e) {

            System.out.println("Erro ao conectar com Hibernate");
            e.printStackTrace();
        }
    }

    public static SessionFactory getFactory() {
        return factory;
    }
}
