package fr.ynov.fournier.station.modele.metier;

public abstract class User {	
	
	private String login;
	private String password;
	private String firstname;
	private String lastname;

	
	/**
	 * Constructeur par defaut
	 */	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur
	 * @param login
	 * @param password
	 * @param firstname
	 * @param lastname
	 */
	public User(String login, String password, String firstname, String lastname) {
		super();
		this.login = login;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	


	
	
}
