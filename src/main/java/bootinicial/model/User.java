package bootinicial.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="User")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1342490408197698183L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String login;
	private String password;
	private String email;
	private int rol;
	
	public User(){}
	
	/**
	 * @param name
	 * @param login
	 * @param password
	 * @param email
	 * @param rol
	 */
	public User(String name, String login, String password, String email, int rol) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
		this.email = email;
		this.rol = rol;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the rol
	 */
	public int getRol() {
		return rol;
	}
	/**
	 * @param rol the rol to set
	 */
	public void setRol(int rol) {
		this.rol = rol;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", login=" + login + ", password=" + password + ", email=" + email
				+ ", rol=" + rol + "]";
	}
	
	
}
