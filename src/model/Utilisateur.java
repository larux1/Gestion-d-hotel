package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public abstract class Utilisateur {
	private final StringProperty login;
	private final StringProperty password;
	private final StringProperty poste;
	public Utilisateur(String login, String password, String poste) {
		
		this.login =  new SimpleStringProperty(login);
		this.password =  new SimpleStringProperty(password);
		this.poste =  new SimpleStringProperty(poste);
	}
	public abstract void  connecter(String login, String password, String poste);
	
	public StringProperty getLogin() {
		return login;
	}
	public StringProperty getPassword() {
		return password;
	}
	public StringProperty getPoste() {
		return poste;
	}
	

}
