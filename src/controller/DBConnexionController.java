package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DBConnexionController {

	private static Connection con;
	public static Connection con(){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projethotel","root","");
				
				System.out.println("Connexion réussie.");
				return con;
			} catch (SQLException | ClassNotFoundException e) {
				@SuppressWarnings("unused")
				int option1 = JOptionPane.showConfirmDialog(null,"Echec de connexion avec la base de données!"+e.getMessage(),"Connexion avec la base de données",JOptionPane.CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
				return null;
			}
			
	}
	}


