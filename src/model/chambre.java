package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class chambre {
	private final IntegerProperty numchambre;
	private final StringProperty categorie;
	private final IntegerProperty tarif;
	private final IntegerProperty numplace;
	
	public chambre(Integer numchambre,String categorie,Integer tarif,Integer numplace) {
		this.numchambre=new SimpleIntegerProperty(numchambre);
		this.categorie=new SimpleStringProperty(categorie);
		this.tarif=new SimpleIntegerProperty(tarif);
		this.numplace=new SimpleIntegerProperty(numplace);
	}
	public int getnumchambre() {
		return numchambre.get();
	}
	public void setnumchambre(int numchambre) {
		this.numchambre.set(numchambre);
	}
	public IntegerProperty numchambreProperty() {
		return numchambre;
	}
	public String getcategorie() {
		return categorie.get();
	}
	public void setcategorie(String categorie) {
		this.categorie.set(categorie);
	}
	public StringProperty categorieProperty() {
		return categorie;
	}
	public int gettarif() {
		return tarif.get();
	}
	public void settarif(int tarif) {
		this.tarif.set(tarif);
	}
	public IntegerProperty tarifProperty() {
		return tarif;
	}
	public int getnumplace() {
		return numplace.get();
	}
	public void setnumplace(int numplace) {
		this.numplace.set(numplace);
	}
	public IntegerProperty numplaceProperty() {
		return numplace;
	}
	public String tostring() {
		return getnumchambre()+" "+getcategorie()+" "+gettarif()+" "+getnumplace();
	}
	

}
