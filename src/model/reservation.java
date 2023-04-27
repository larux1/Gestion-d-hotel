package model;
import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class reservation {
	private final IntegerProperty numchambre;
	private final IntegerProperty numreservation;
	private final StringProperty nomclient;
	private final ObjectProperty<LocalDate> datereservation;
	private final ObjectProperty<LocalDate> datearrivee;
	private final ObjectProperty<LocalDate> datedepart;
	
	public reservation(Integer numchambre,Integer numreservation,String nomclient,LocalDate datereservation,LocalDate datearrivee,LocalDate datedepart) {
		this.numchambre=new SimpleIntegerProperty(numchambre);
		this.numreservation=new SimpleIntegerProperty(numreservation);
		this.nomclient= new SimpleStringProperty(nomclient);
		this.datereservation=new SimpleObjectProperty<LocalDate>(datereservation);
		this.datearrivee=new SimpleObjectProperty<LocalDate>(datearrivee);
		this.datedepart=new SimpleObjectProperty<LocalDate>(datedepart);
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
	public int getnumreservation() {
		return numreservation.get();
	}
	public void setnumreservation(int numreservation) {
		this.numreservation.set(numreservation);
	}
	public IntegerProperty numreservationProperty() {
		return numreservation;
	}
	 public LocalDate getdatereservation() {
	        return datereservation.get();
	    }

	    public void setdatereservation(LocalDate dateresrevation) {
	    	this.datereservation.set(dateresrevation);
	    }
	    
	    public ObjectProperty<LocalDate> datereservationProperty() {
	        return datereservation;
	    }
	    public LocalDate getdatearrivee() {
	        return datearrivee.get();
	    }

	    public void setdatearrivee(LocalDate datearrivee) {
	        this.datearrivee.set(datearrivee);
	    }
	    
	    public ObjectProperty<LocalDate> datearriveeProperty() {
	        return datearrivee;
	    }
	    public LocalDate getdatedepart() {
	        return datedepart.get();
	    }

	    public void setdatedepart(LocalDate datedepart) {
	        this.datedepart.set(datedepart);
	    }
	    
	    public ObjectProperty<LocalDate> datedepartProperty() {
	        return datedepart;
	    }
	  
		public StringProperty getNomclient() {
			return nomclient;
		}
		public StringProperty nomclientProperty() {
			return nomclient;
		}
		public String tostring() {
	    	return getnumchambre()+ " " +getnumreservation()+" "+getdatearrivee()+" "+getdatedepart();
		    		}
	    

}
