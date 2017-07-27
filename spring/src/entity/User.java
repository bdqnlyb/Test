package entity;

import java.io.Serializable;

import javax.management.loading.PrivateClassLoader;

public class User implements Serializable{
	private static final long serialVersionUID = -3363120264501521428L;
	private String userName;
	private String password;
	private Integer id;
	private Integer  age;
	
	public User(){
		System.out.println("已经创建了一个对象");
	}
	
	public User(String userName, String password, Integer id, Integer age) {
		this.userName = userName;
		this.password = password;
		this.id = id;
		this.age = age;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", id=" + id + ", age=" + age + "]";
	}

	
}
