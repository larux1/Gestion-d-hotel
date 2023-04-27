package controller;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.reservation;

public class ConsulterReservationController implements Initializable{

	 @FXML
	    private Button rtrbtnlisteres;

	    @FXML
	    private TableView<reservation> listeres;

	    @FXML
	    private TableColumn<reservation, Integer> numchambret;

	    @FXML
	    private TableColumn<reservation, Integer> numresevat;

	    @FXML
	    private TableColumn<reservation, String> nomclit;

	    @FXML
	    private TableColumn<reservation, LocalDate> daterest;

	    @FXML
	    private TableColumn<reservation, LocalDate> dateat;
	    
	    @FXML
	    private TableColumn<reservation, LocalDate> datedept;

	    @FXML
	    private Label titre;

	    
    private ObservableList<reservation> resData = FXCollections.observableArrayList();

    
	public ConsulterReservationController() {
		resData.add(new reservation(20, 5400,"gtv",LocalDate.of(1, 3, 10),LocalDate.of(1, 3, 10),LocalDate.of(1, 3, 10)));
		resData.add(new reservation(20, 5400,"wsde",LocalDate.of(1, 3, 10),LocalDate.of(1, 3, 10),LocalDate.of(1, 3, 10)));
		resData.add(new reservation(20, 5400,"QEEEEEEEEE",LocalDate.of(1, 3, 10),LocalDate.of(1, 3, 10),LocalDate.of(1, 3, 10)));
		
	}
	public void initialize(URL arg0, ResourceBundle arg1) {
		numchambret.setCellValueFactory(cellData -> cellData.getValue().numchambreProperty().asObject());
		numresevat.setCellValueFactory(cellData -> cellData.getValue().numreservationProperty().asObject());
		nomclit.setCellValueFactory(cellData -> cellData.getValue().nomclientProperty());
		daterest.setCellValueFactory(cellData -> cellData.getValue().datereservationProperty());
		dateat.setCellValueFactory(cellData -> cellData.getValue().datearriveeProperty());
		datedept.setCellValueFactory(cellData -> cellData.getValue().datedepartProperty());
		listeres.setItems(resData);
	}
 
    public void backtoac(ActionEvent event) throws IOException  {
	  titre.getScene().getWindow().hide();
		Parent root= FXMLLoader.load(getClass().getResource("/view/AccueilView.fxml"));
		Stage Accueil=new Stage();
		Scene scene=new Scene(root);
		Accueil.setScene(scene);
		Accueil.show();

    }
}
