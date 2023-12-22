package com.javacodebase.Streams;
import java.util.*;

public class EmployeeStream {
    private Long id;
    private String firstName;
    private String[] lastName;
    private List<Integer> mobileNumber;

    public EmployeeStream(Long id, String firstName, String[] lastName, List<Integer> mobileNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String[] getLastName() {
        return lastName;
    }

    public void setLastName(String[] lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(List<Integer> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
