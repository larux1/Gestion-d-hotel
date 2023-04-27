package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.reservation;

public class ReservationController implements Initializable{



    @FXML
    private Button ajoutbtn;

    @FXML
    private Button modifbtn;

    @FXML
    private Pane ajclipane;

    @FXML
    private Button annulerclibtn;

    @FXML
    private Button enreclibtn;

    @FXML
    private TextField numcham;

    @FXML
    private TextField numres;

    @FXML
    private TextField nomcli;

    @FXML
    private DatePicker dateres;

    @FXML
    private DatePicker dated;

    @FXML
    private DatePicker datea;

    @FXML
    private Pane modifresPane;

    @FXML
    private TableView<reservation> tabmodifres;

    @FXML
    private Button retour;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		modifresPane.setVisible(false);
		ajclipane.setVisible(false);
		
	}
	public void retour (ActionEvent e) {
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
	public void ajouterres(ActionEvent e) {
		modifresPane.setVisible(false);
		ajclipane.setVisible(true);
		
		
	}
	public void modifier(ActionEvent e) {
		ajclipane.setVisible(false);
		modifresPane.setVisible(true);
	}
	public void enregistrer(ActionEvent e) {
		
	}
    
    
}
