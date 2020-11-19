package model;

public class Student {
	 private String name;
	 private int age;
	 private String gender;
	 private String IDNo;
	
	 
    public Student(String name, int age, String gender, String IDNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.IDNo = IDNo;
	    }
    
    public String getName() {
    	return this.name;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public String getGender() {
    	return this.gender;
    }
    
    public String getIDNo() {
    	return this.IDNo;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public void setGender(String gender) {
    	this.gender = gender;
    }
    
    public void setIDNo(String IDNo) {
    	this.IDNo = IDNo;
    }
}
