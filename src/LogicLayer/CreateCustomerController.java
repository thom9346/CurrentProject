package LogicLayer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * Created by Thomas on 11-05-2017.
 */
public class CreateCustomerController {


    @FXML
    private TextField faknr1, dato1, kundenr1, debitor1, navn1, adresse1, beløb1;

    ObservableList<CustomerInformation> kunder;



    public ObservableList<CustomerInformation> save(){

        String fakture = faknr1.getText();
        String dato = dato1.getText();
        String kundenr = kundenr1.getText();
        String debitor = debitor1.getText();
        String navn = navn1.getText();
        String adresse = adresse1.getText();
        String beløb = beløb1.getText();


        kunder = FXCollections.observableArrayList();
        //indsæt kundeinformationer her
        kunder.add(new CustomerInformation(fakture, dato, kundenr, debitor, navn, adresse, beløb));
        return kunder;
    }
}
