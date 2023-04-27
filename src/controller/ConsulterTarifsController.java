package controller;
import model.chambre;
import model.client;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ConsulterTarifsController implements Initializable {
	@FXML
    private Button refresh;

    @FXML
    private Button retour;

    @FXML
    private TableView<chambre> tablechambre;
    private ObservableList<chambre> chamData = FXCollections.observableArrayList();

    @FXML
    private TableColumn<chambre,Integer> num;

    @FXML
    private TableColumn<chambre, String> cat;

    @FXML
    private TableColumn<chambre, Integer> tar;

    @FXML
    private TableColumn<chambre,Integer> nb;

    
    
	public ConsulterTarifsController() {
		chamData.add(new chambre(14,"suite",11500,2));
 		chamData.add(new chambre(22,"simple",10500,1));
 		chamData.add(new chambre(44,"suite",11500,4));
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
				num.setCellValueFactory(cellData -> cellData.getValue().numchambreProperty().asObject());
				cat.setCellValueFactory(cellData -> cellData.getValue().categorieProperty());
				tar.setCellValueFactory(cellData -> cellData.getValue().tarifProperty().asObject());
				nb.setCellValueFactory(cellData -> cellData.getValue().numplaceProperty().asObject());
				tablechambre.setItems(chamData);
	}
    public void tarif (ActionEvent e) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("/view/tarifsView.fxml"));
		Stage tarif=new Stage();
		Scene scene=new Scene(root);
		tarif.setScene(scene);
		tarif.show();
		Main.stg.close();
    }
    public void retour (ActionEvent e) throws IOException {
  		Parent root= FXMLLoader.load(getClass().getResource("/view/AccueilView.fxml"));
  		Stage retour=new Stage();
  		Scene scene=new Scene(root);
  		retour.setScene(scene);
  		retour.show();
  		Main.stg.close();
      }

    
    
    
}

