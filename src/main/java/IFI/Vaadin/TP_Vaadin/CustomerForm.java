package IFI.Vaadin.TP_Vaadin;

import com.vaadin.data.Binder;
import com.vaadin.ui.FormLayout;

public class CustomerForm extends FormLayout {

    private CustomerService service = CustomerService.getInstance();
    private Customer customer;
    private MyUI myUI;
    private Binder<Customer> binder = new Binder<>(Customer.class);

    public CustomerForm(MyUI myUI) {
        this.myUI = myUI;

        binder.bindInstanceFields(this);
        
    }

    public void setCustomer(Customer customer) {
    	/*
    	 * Méthode affichant le Customer sélectionner
    	 * 
    	 * L'afficher d'abord sous le tableau
    	 * Puis dans le formulaire
    	 * Puis afficher le bouton 'Supprimer'
    	 */
    }

    private void delete() {
    	/*
    	 * Méthode permettant de supprimer un utilisateur
    	 */
    }

    private void save() {
    	/*
    	 * Méthode permettant de créer ou éditer un utilisateur
    	 */
    }

}
