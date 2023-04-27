package controller;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.client;


public class AjoutClientController implements Initializable {


    @FXML
    private Button ajotclibtn;

    @FXML
    private Button modiclibtn;

    @FXML
    private Pane ajclipane;

    @FXML
    private TextField prenomlci;

    @FXML
    private TextField phone;

    @FXML
    private TextField adr;

    @FXML
    private TextField numpiece;

    @FXML
    private TextField nbchamb;

    @FXML
    private TextField nbpers;

    @FXML
    private TextField nation;

    @FXML
    private TextField nomcli;

    @FXML
    private ComboBox<String> piece;
    private ObservableList<String> piecel = FXCollections.observableArrayList();
    @FXML
    private DatePicker datearrivee;

    @FXML
    private DatePicker datedepart;

    @FXML
    private Button annuler;

    @FXML
    private Button valider;

    @FXML
    private Pane modifpane;

    @FXML
    private Button sauvbtn;

    @FXML
    private Button annulerbtn;
    @FXML
    private Button retour;

    @FXML
    private TableView<client> tbcli;
    private ObservableList<client> cliData = FXCollections.observableArrayList();

    @FXML
    private TableColumn<client, String> nom;

    @FXML
    private TableColumn<client, String> prenom;

    @FXML
    private TableColumn<client, Integer> numero;

    @FXML
    private TableColumn<client, String> add;

    @FXML
    private TableColumn<client, String> typep;

    @FXML
    private TableColumn<client, LocalDate> datarr;
    
	public AjoutClientController() {
		cliData.add(new client("Manang","Marthe","Camerounaise","cni" ,"6515",64554,6555));
		cliData.add(new client("Tchatat","Megane","Camerounaise","cni" ,"6515",64554,6555));
		cliData.add(new client("Fokou","Manuella","Camerounaise","cni" ,"6515",64554,6555));
		
		piecel.add("cni");
		piecel.add("passeport");
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		nom.setCellValueFactory(cellData -> cellData.getValue().nomProperty());
		prenom.setCellValueFactory(cellData -> cellData.getValue().prenomProperty());
		numero.setCellValueFactory(cellData -> cellData.getValue().numtelProperty().asObject());
		add.setCellValueFactory(cellData -> cellData.getValue().adressseProperty());
		datarr.setCellValueFactory(cellData -> cellData.getValue().datearriveProperty());
		tbcli.setItems(cliData);
	}
	public void ajoutclient(ActionEvent e) {
		if(e.getSource()==ajotclibtn) {
			ajclipane.toFront();
		}
		if(e.getSource()== modiclibtn) {
			modifpane.toFront();
		}
	}
	public void retour(ActionEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/view/Accueilview.fxml"));
			Stage stg= new Stage();
		Scene scene = new Scene(root);
		stg.setScene(scene);
		stg.show();
		retour.getScene().getWindow().hide();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
		}
	}

}
