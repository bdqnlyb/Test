package entity;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = -6523721365140931713L;
	private User user;
	private String info;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [user=" + user + ", info=" + info + "]";
	}
}
