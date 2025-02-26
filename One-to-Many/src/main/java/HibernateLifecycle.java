import config.FactoryConfiguration;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateLifecycle {
    public static void main(String[] args) {
        Session session = null;
        Transaction transaction = null;

        // **Transient State**
        Customer customer = new Customer();
        customer.setName("Lahiru");

        //Get new Session
        session = FactoryConfiguration.getInstance().getSession();
        transaction = session.beginTransaction();

        // **Persistent State**
        session.persist(customer); //new save method
        transaction.commit();

        // **Detached State**
        session.close(); //after session close don't use it and Without using object Eligible to Garbage Collection (GC)

        // Edit object in detached state
        customer.setName("Mudith");

        //Get new Session before update
        session = FactoryConfiguration.getInstance().getSession();

        // **Persistent State**
        session.merge(customer); //update method
    }
}
