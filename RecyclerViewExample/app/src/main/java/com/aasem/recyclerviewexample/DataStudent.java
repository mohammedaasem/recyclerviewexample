package com.aasem.recyclerviewexample;

/**
 * Created by inspire_info_soft on 5/2/2018.
 */

public class DataStudent {
    String rollNumber,name,contactNumber;
    int id;

    public DataStudent(int id, String rollNumber, String name, String contactNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.contactNumber = contactNumber;
        this.id = id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
