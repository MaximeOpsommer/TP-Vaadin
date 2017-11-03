package IFI.Vaadin.TP_Vaadin;

import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class DeleteWindow extends Window {
	
	private CustomerService service = CustomerService.getInstance();
	
	public DeleteWindow(final MyUI myUI, final Customer customer) {
		super("Delete");
		
		// contenu de votre popin
		
	}

}
