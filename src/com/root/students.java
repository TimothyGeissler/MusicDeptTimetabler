package com.root;

import javafx.beans.property.SimpleStringProperty;

public class students {

    //Property is listenable, to be used in tableview
    private SimpleStringProperty StudentID, Firstname, Surname, Class, Teacher;

    public students(String studentID, String firstname, String surname, String aClass, String teacher) {
        this.StudentID = new SimpleStringProperty(studentID);
        this.Firstname = new SimpleStringProperty(firstname);
        this.Surname = new SimpleStringProperty(surname);
        this.Class = new SimpleStringProperty(aClass);
        this.Teacher = new SimpleStringProperty(teacher);
    }

    @Override
    public String toString() {
        return "students{" +
                "StudentID='" + StudentID + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Class='" + Class + '\'' +
                ", Teacher='" + Teacher + '\'' +
                '}';
    }

    public void setStudentID(String studentID) {
        this.StudentID.set(studentID);
    }

    public void setFirstname(String firstname) {
        this.Firstname.set(firstname);
    }

    public void setSurname(String surname) {
        this.Surname.set(surname);
    }

    public void setClass(String aClass) {
        this.Class.set(aClass);
    }
    //Because getClass clashes with java class
    public String getClassA() { return Class.get(); }

    public void setTeacher(String teacher) {
        this.Teacher.set(teacher);
    }

    public String getStudentID() {
        return StudentID.get();
    }

    public SimpleStringProperty studentIDProperty() {
        return StudentID;
    }

    public String getFirstname() {
        return Firstname.get();
    }

    public SimpleStringProperty firstnameProperty() {
        return Firstname;
    }

    public String getSurname() {
        return Surname.get();
    }

    public SimpleStringProperty surnameProperty() {
        return Surname;
    }

    public SimpleStringProperty classProperty() {
        return Class;
    }

    public String getTeacher() {
        return Teacher.get();
    }

    public SimpleStringProperty teacherProperty() {
        return Teacher;
    }
}
