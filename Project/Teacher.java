package Project;

import java.util.Arrays;
import java.util.Scanner;

public class Teacher {
	public static int counter = 0;
	private int teacherId;
	private String teacherName;
	private int teacherAge;
	private String teacherSubject,teacherMobNo,teacherEmail,teacherAddress;
	public Teacher() {}
	public Teacher(int teacherId, String teacherName, int teacherAge, String teacherSubject, String teacherMobNo,
			String teacherEmail, String teacherAddress) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherAge = teacherAge;
		this.teacherSubject = teacherSubject;
		this.teacherMobNo = teacherMobNo;
		this.teacherEmail = teacherEmail;
		this.teacherAddress = teacherAddress;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherAge() {
		return teacherAge;
	}
	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}
	public String getTeacherSubject() {
		return teacherSubject;
	}
	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}
	public String getTeacherMobNo() {
		return teacherMobNo;
	}
	public void setTeacherMobNo(String teacherMobNo) {
		this.teacherMobNo = teacherMobNo;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	
	Teacher [] teachers = new Teacher[10000];
	
	public void addTeacher(int teacherId,String teacherName,int teacherAge,String teacherSubject,String teacherMobNo,String teacherEmail,String teacherAddress) {
		teachers[counter] = new Teacher(teacherId, teacherName, teacherAge, teacherSubject, teacherMobNo, teacherEmail, teacherAddress);
		
	}
	
	public void print() {
		System.out.println(teachers[0]);
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherAge=" + teacherAge
				+ ", teacherSubject=" + teacherSubject + ", teacherMobNo=" + teacherMobNo + ", teacherEmail="
				+ teacherEmail + ", teacherAddress=" + teacherAddress + ", teachers=" + Arrays.toString(teachers) + "]";
	}
	
}



