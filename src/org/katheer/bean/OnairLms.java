package org.katheer.bean;

import java.util.*;

public class OnairLms {
    private List<String> courses;
    private Set<Student> students;
    private Map<String, String> faculties;
    private Properties cost;

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Map<String, String> getFaculties() {
        return faculties;
    }

    public void setFaculties(Map<String, String> faculties) {
        this.faculties = faculties;
    }

    public Properties getCost() {
        return cost;
    }

    public void setCost(Properties cost) {
        this.cost = cost;
    }

    public void showAvailableCourses() {
        System.out.println("Courses : " + this.getCourses());
    }

    public void showAllFaculties() {
        System.out.println("Faculties : " + this.getFaculties());
    }

    public void showCourseCosts() {
        System.out.println("Costs : " + this.getCost());
    }

    public void showStudentsList() {
        Iterator<Student> itr = students.iterator();
        System.out.println(String.format("%-15s%-20s%-15s%-15s",
                "Name", "Email", "Mobile", "Courses Taken"));
        while(itr.hasNext()) {
            itr.next().getStudentDetails();
        }
        System.out.println();
    }
}
