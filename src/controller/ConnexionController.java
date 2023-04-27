package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ConnexionController implements Initializable {
	boolean bon;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private ComboBox<String> poste;

    @FXML
    private Button valider;

    @FXML
    private Button annuler;
    private ObservableList<String> myComboBoxData = FXCollections.observableArrayList();
	    
    
    
	public ConnexionController() {
		myComboBoxData.add("Directeur");
		myComboBoxData.add("Chef réceptioniste");
		myComboBoxData.add("Réceptioniste");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		username.setStyle("-fx-text-inner-color: #a0a2ab");
		password.setStyle("-fx-text-inner-color: #a0a2ab");
		poste.setStyle("-fx-text-inner-color: #a0a2ab");
		poste.setItems(myComboBoxData);
	}
public void connexion() {
		
		Connection con= DBConnexionController.con();
		PreparedStatement stat= null;
		ResultSet rs=null;
		String sql= "SELECT * FROM utilsateur WHERE login= ? AND password= ? AND poste= ? ";
		try {
			stat= con.prepareStatement(sql);
			stat.setString(1, username.getText().toString().trim());
			stat.setString(2, password.getText().toString().trim());
			stat.setString(3, poste.getValue().toString().trim());
			rs= stat.executeQuery();
			if(rs.next()) {
				JOptionPane.showMessageDialog(null, "Vous etes connecté");
				username.getScene().getWindow().hide();
				//valider.getScene().getWindow().hide();
				Parent root= FXMLLoader.load(getClass().getResource("/view/AccueilView.fxml"));
				Stage Accueil=new Stage();
				Scene scene=new Scene(root);
				Accueil.setScene(scene);
				Accueil.show();
				bon=true;
			}else {
				JOptionPane.showMessageDialog(null, "Echec de connexion");
				bon=false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void valider(ActionEvent e) throws IOException {
		connexion();
		
	}
	public void annuler(ActionEvent event) {
		System.out.println("l'application est ferme");
		System.exit(0);
		
	}
	


}
