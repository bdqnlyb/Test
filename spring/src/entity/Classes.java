package entity;

public class Classes {
	private Teacher teacher;
	private User user;
	public Classes(){
		System.out.println("������һ���µ�Classes����");
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Classes [teacher=" + teacher + ", user=" + user + "]";
	}
}
