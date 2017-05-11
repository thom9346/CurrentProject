package LogicLayer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by Thomas on 11-05-2017.
 */
public class CreateCustomerController {


    @FXML
    private TextField faknr1, dato1, kundenr1, debitor1, navn1, adresse1, beløb1;

    //private String fakture = faknr1.getText();
//    private String dato = dato1.getText();
//    private String kundenr = kundenr1.getText();
//    private String debitor = debitor1.getText();
//    private String navn = navn1.getText();
//    private String adresse = adresse1.getText();
//    private String beløb = beløb1.getText();
//

//
//    public ObservableList<CustomerInformation> saveData(){
//        ObservableList<CustomerInformation> kunder = FXCollections.observableArrayList();
//        //indsæt kundeinformationer her
//        kunder.add(new CustomerInformation(fakture, dato, kundenr, debitor, navn, adresse, beløb));
//        return kunder;
//
//    }
    public void save(){

        System.out.println("hhh");
    }
}
