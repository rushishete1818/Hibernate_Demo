import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class testSamsung {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Samsung.class).configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
		//Samsung s = new Samsung(101,"shimjang", 150000);
		//ss.save(s); //this insert the single data in a database
		
		//Samsung s = new Samsung(101,"chimav",200000); 
		//ss.update(s); //this is used for update the data of database

		Samsung s = new Samsung(101); 
                ss.delete(s);
		
		tx.commit();
		ss.close();

	}

}
