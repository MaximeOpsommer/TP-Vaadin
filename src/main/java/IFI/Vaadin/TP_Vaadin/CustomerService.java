package IFI.Vaadin.TP_Vaadin;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerService {

	private static CustomerService instance;
	private static final Logger LOGGER = Logger.getLogger(CustomerService.class.getName());

	private final HashMap<Long, Customer> contacts = new HashMap<>();
	private long nextId = 0;

	private CustomerService() {
	}

	/**
	 * @return a reference to an example facade for Customer objects.
	 */
	public static CustomerService getInstance() {
		if (instance == null) {
			instance = new CustomerService();
			instance.ensureTestData();
		}
		return instance;
	}

	/**
	 * @return all available Customer objects.
	 */
	public synchronized List<Customer> findAll() {
		
		/*
		 * Retourner la liste des Customers sans filtre
		 */
		
		return null;
	}

	/**
	 * Finds all Customer's that match given filter.
	 *
	 * @param stringFilter
	 *            filter that returned objects should match or null/empty string
	 *            if all objects should be returned.
	 * @return list a Customer objects
	 */
	public synchronized List<Customer> findAll(String stringFilter) {
		
		/*
		 * Retourner la liste des Customers avec filtre
		 */
		return null;
	}

	/**
	 * @return the amount of all customers in the system
	 */
	public synchronized long count() {
		
		/*
		 * Retourner le nombre de Customers
		 */
		return -1;
	}

	/**
	 * Deletes a customer from a system
	 *
	 * @param value
	 *            the Customer to be deleted
	 */
	public synchronized void delete(Customer value) {
		
		/*
		 * Supprimer le Customer passé en paramètre de la liste
		 */
	}

	/**
	 * Persists or updates customer in the system. Also assigns an identifier
	 * for new Customer instances.
	 *
	 * @param entry
	 */
	public synchronized void save(Customer entry) {
		/* Log une erreur si l'entrée est nulle */
		if (entry == null) {
			LOGGER.log(Level.SEVERE,
					"Customer is null.");
			return;
		}
		/* Incrémente la prochaine ID */
		if (entry.getId() == null) {
			entry.setId(nextId++);
		}
		
		/*
		 * Enregistrer le Customer
		 */
	}

	/**
	 * Sample data generation
	 */
	public void ensureTestData() {
		if (findAll().isEmpty()) {
			final String[] names = new String[] { "Alexandre Delassus", "Maxime Opsommer", "Pierre-Claver Diarra" };
			Random r = new Random(0);
			for (String name : names) {
				String[] split = name.split(" ");
				Customer c = new Customer();
				c.setFirstName(split[0]);
				c.setLastName(split[1]);
				c.setEmail(split[0].toLowerCase() + "." + split[1].toLowerCase() + "@vaadin.com");
                int daysOld = 0 - r.nextInt(365 * 15 + 365 * 60);
                c.setBirthDate(LocalDate.now().plusDays(daysOld));
				save(c);
			}
		}
	}

}