package model;
import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class client {
	private final IntegerProperty id;
	private final StringProperty nom;
	private final StringProperty prenom;
	private final StringProperty nationalite;
	private final StringProperty typepiece;
	private final IntegerProperty numpiece;
	private final StringProperty adresse;
	private final  IntegerProperty numtel;
	private final ObjectProperty<LocalDate> datearrive;
	private final ObjectProperty<LocalDate> datedepart;
	 
	 public client( String nom,String prenom,String nationalite,String typepiece,String adresse,Integer numtel,Integer numpiece) {
			
		 this.nom = new SimpleStringProperty(nom);
			this.prenom = new SimpleStringProperty(prenom);
			this.nationalite=new SimpleStringProperty(nationalite);
			this.typepiece=new SimpleStringProperty(typepiece);
			this.adresse=new SimpleStringProperty(adresse);
			this.id = new SimpleIntegerProperty(12345679);
	        this.datearrive = new SimpleObjectProperty<LocalDate>(LocalDate.of(2014, 2, 21));
	        this.datedepart= new SimpleObjectProperty<LocalDate>(LocalDate.of(2050, 6, 10));
	        this.numtel=new SimpleIntegerProperty(12345679);
	        this.numpiece = new SimpleIntegerProperty(12345679);
	 }
	        
	        public String getnom() {
	    		return nom.get();
	    	}

	    	public void setnom(String nom) {
	    		this.nom.set(nom);
	    	}
	    	
	    	public StringProperty nomProperty() {
	    		return nom;
	    	}
	    	public String getnationalite() {
	    		return nationalite.get();
	    	}

	    	public void setnationalite(String prenom) {
	    		this.nationalite.set(prenom);
	    	}
	    	
	    	public StringProperty nationaliteProperty() {
	    		return nationalite;
	    	}
	    	public String getprenom() {
	    		return prenom.get();
	    	}

	    	public void setprenom(String prenom) {
	    		this.prenom.set(prenom);
	    	}
	    	
	    	public StringProperty prenomProperty() {
	    		return prenom;
	    	}
	    	public String getadresse() {
	    		return adresse.get();
	    	}
	    	public void setadresse(String adresse) {
	    		this.prenom.set(adresse);
	    	}
	    	public StringProperty adressseProperty() {
	    		return adresse;
	    	}
	    	public String gettypepiece() {
	    		return typepiece.get();
	    	}
	    	public void settypepiece( String typepiece) {
	    		this.typepiece.set(typepiece);
	    	}
	    	public StringProperty typepieceProperty() {
	    		return typepiece;
	    	}
	    	 public int getid() {
	    	        return id.get();
	    	    }

	    	    public void setid(int id) {
	    	        this.id.set(id);
	    	    }
	    	    
	    	    public IntegerProperty idProperty() {
	    	        return id;
	    	    }
	    	    public int getnumpiece(){
	    	        return numpiece.get();
	    	    }
	    	    public int getnumtel() {
	    	    	return numtel.get();
	    	    }
	    	    public void setnumtel(int numtel) {
	    	    	this.numtel.set(numtel);
	    	    }
	    	    public IntegerProperty numtelProperty() {
	    	    	return numtel;
	    	    }

	    	    public void setnumpiece(int numpiece) {
	    	        this.numpiece.set(numpiece);
	    	    }
	    	    
	    	    public IntegerProperty numpieceProperty() {
	    	        return numpiece;
	    	    }
	    	    public LocalDate getdatearrive() {
	    	        return datearrive.get();
	    	    }

	    	    public void setdatearrive(LocalDate datearrive) {
	    	        this.datearrive.set(datearrive);
	    	    }
	    	    
	    	    public ObjectProperty<LocalDate> datearriveProperty() {
	    	        return datearrive;
	    	    }
	    	    public LocalDate getdatedepart() {
	    	    	return datedepart.get();
	    	    }
	    	    public void setdatedepart(LocalDate datedepart) {
	    	    	this.datedepart.set(datedepart);
	    	    }
	    	    public ObjectProperty<LocalDate> datedepart(){
	    	    	return datedepart;
	    	    }
	    	    public String toString() {
	    			return getnom() + " " + getprenom()+" "+getnationalite()+" "+getadresse()+" "+gettypepiece()+" "+
	    	    getid()+" "+getnumpiece()+" "+getdatearrive()+" "+getdatedepart()+getnumtel();
	    		}
	
	
	

}
