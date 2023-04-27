package controller;

import javafx.scene.control.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AccueilController implements Initializable{


    @FXML
    private Button greserv;

    @FXML
    private Button gchambre;

    @FXML
    private Button gclient;

    @FXML
    private Button consulres;

    @FXML
    private Button gtarif;

	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	@FXML
	public void reserver(ActionEvent e){
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/view/Reservationsview.fxml"));
			Stage stg= new Stage();
		Scene scene = new Scene(root);
		stg.setScene(scene);
		stg.show();
		greserv.getScene().getWindow().hide();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
		}
	}
	public void consulter(ActionEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/view/ConsulterReservationview.fxml"));
			Stage stg= new Stage();
		Scene scene = new Scene(root);
		stg.setScene(scene);
		stg.show();
		consulres.getScene().getWindow().hide();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
		}
	}
	public void client (ActionEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/view/AjoutClientView.fxml"));
			Stage stg= new Stage();
		Scene scene = new Scene(root);
		stg.setScene(scene);
		stg.show();
		gclient.getScene().getWindow().hide();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
		}
		
	}
	public void chambre(ActionEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/view/ChambreView.fxml"));
			Stage stg= new Stage();
		Scene scene = new Scene(root);
		stg.setScene(scene);
		stg.show();
		gchambre.getScene().getWindow().hide();
		} catch (IOException e1) {
			e1.printStackTrace();
		
		}
		
	}
	public void tarif(ActionEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/view/Tarifsview.fxml"));
			Stage stg= new Stage();
		Scene scene = new Scene(root);
		stg.setScene(scene);
		stg.show();
		gtarif.getScene().getWindow().hide();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
		}
		
	} 
	

}
