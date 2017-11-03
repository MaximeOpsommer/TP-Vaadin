package IFI.Vaadin.TP_Vaadin;

import com.vaadin.data.Binder;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class SaveWindow extends Window {

    private CustomerService service = CustomerService.getInstance();
    private Binder<Customer> binder = new Binder<>(Customer.class);

    public SaveWindow(final MyUI myUI, final Customer customer) {
    	super("Save");
    	
    	// Contenu de votre popin
    	
    }
}
