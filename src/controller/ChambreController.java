package controller;

import java.net.URL;
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
import model.chambre;
import model.client;

public class ChambreController implements Initializable {

    @FXML
    private TableColumn<chambre, Integer> num;

    @FXML
    private TableColumn<chambre, String> cat;

    @FXML
    private TableColumn<chambre, Integer> tar;

    @FXML
    private TableColumn<chambre, Integer> nb;
   
	   @FXML
	    private Button ajter;

	    @FXML
	    private Button mdfier;

	    @FXML
	    private Pane ajoutchambre;
	    
	    @FXML
	    private Pane modifpane;

	    @FXML
	    private TextField nbplace;
	    		
	    @FXML
	    private TextField tarif;

	    @FXML
	    private TextField numcham;

	    @FXML
	    private Button anlr;

	    @FXML
	    private Button vlder;
	    
	    @FXML
	    private Button retour;
	    
    @FXML
    private ComboBox<String> categorie;

    @FXML
    private TableView<chambre> tablechambre;
    private ObservableList<chambre> chamData = FXCollections.observableArrayList();
   
	@FXML
    private Button enrtrer;

    @FXML
    private Button annuler;
    
     public ChambreController() {
 		chamData.add(new chambre(14,"suite",11500,2));
 		chamData.add(new chambre(22,"simple",10500,1));
 		chamData.add(new chambre(44,"suite",11500,4));
	}

    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ajoutchambre.setVisible(false);
		modifpane.setVisible(false);
		num.setCellValueFactory(cellData -> cellData.getValue().numchambreProperty().asObject());
		cat.setCellValueFactory(cellData -> cellData.getValue().categorieProperty());
		tar.setCellValueFactory(cellData -> cellData.getValue().tarifProperty().asObject());
		nb.setCellValueFactory(cellData -> cellData.getValue().numplaceProperty().asObject());
		tablechambre.setItems(chamData);
	}
	
	@FXML
	public void ajouter(ActionEvent e) {
		ajoutchambre.setVisible(true);
		modifpane.setVisible(false);
	}
	@FXML
	public void modifier(ActionEvent e) {
		modifpane.setVisible(true);
		ajoutchambre.setVisible(true);
	}
	@FXML
    void anulajout(ActionEvent event) {
			nbplace.setText(null);
			numcham.setText(null);
			tarif.setText(null);
			categorie.setValue(null);
    }

    @FXML
    void vlderajout(ActionEvent event) {
    	
    }
    public void retour(ActionEvent e) {

		try {
			Parent root=FXMLLoader.load(getClass().getResource("/view/AccueilView.fxml"));
			Scene scene = new Scene(root);
			Stage stg=new Stage();
			stg.setScene(scene);
			stg.show();
			
		} catch(Exception e1) {
			e1.printStackTrace();
		}
    }

}
