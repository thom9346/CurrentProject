package LogicLayer;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;


/**
 * Created by Thomas on 07-05-2017.
 */
public class MainController extends OpenNewWindow {

    @FXML
    TableView table;

    CreateCustomerController createCustomerController = new CreateCustomerController();


    public void createData(){
        newWindow("CreateCustomers.fxml");

        table.setItems(createCustomerController.kunder);

    }
}
