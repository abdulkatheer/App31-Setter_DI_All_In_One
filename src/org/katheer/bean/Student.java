package org.katheer.bean;

public class Student {
    private String name;
    private String email;
    private String mobile;
    private String[] coursesTaken;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(String[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void getStudentDetails() {
        System.out.print(String.format("%-15s%-20s%-15s",
                this.getName(), this.getEmail(), this.getMobile()));
        for(String s : coursesTaken) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
