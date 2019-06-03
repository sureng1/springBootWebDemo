package com.demo;

public class Student {
    private int sno;
    private String name;

    public static Student student = new Student();

    public Student(){
        this(1,"default");
    }

    public Student(int id, String name){
        this.sno = id;
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public static void setStudent(int id, String name) {
        if(student == null)
       student = new Student(id,name);
        else{
            student.sno = id;
            student.name = name;
        }
    }

    public static Student getStuden(){
        if(student == null){
            setStudent(1,"null");
        }
        return student;
    }
}
