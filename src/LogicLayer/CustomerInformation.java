package LogicLayer;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


/**
 * Created by Thomas on 11-05-2017.
 */
public class CustomerInformation {

    @FXML
   private TextField faknr1, dato1, kundenr1, debitor1, navn1, adresse1, beløb1;

    private String fakture = "";
    private String dato = "";
    private String kundenr = "";
    private String debitor = "";
    private String navn = "";
    private String adresse = "";
    private String beløb = "";





    public CustomerInformation(String fakture, String dato, String kundenr, String debitor, String navn, String adresse, String beløb) {
        this.fakture = fakture;
        this.dato = dato;
        this.kundenr = kundenr;
        this.debitor = debitor;
        this.navn = navn;
        this.adresse = adresse;
        this.beløb = beløb;
    }
}


