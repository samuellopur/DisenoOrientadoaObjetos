package org.example;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Colegio{
    private String id;
    //private String name;
    private float averageGrade;
    private List<Curso> enrolledCourses;

    public Estudiante(String name) {
        super(name);
        this.id = id;
        //this.name = name;
        this.averageGrade = 0f;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    @Override
    public void imprimir() {
        System.out.println(this.getClass().getSimpleName());
    }

    public String getName(){
        return this.rol;
    }

    public void setName(String name){
        this.rol = name;
    }

    public float getAverageGrade() {

        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public List<Curso> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Curso> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public boolean enrroll(Curso curso) {
        if (enrolledCourses == null) {
            enrolledCourses = new ArrayList<Curso>();
        }
        if (!enrolledCourses.contains(curso)) {
            enrolledCourses.add(curso);
            return true;
        }
        return false;
    }

        @Override
    public String toString() {
        return "Estudiante sisisi{'id': " + id + ", 'name':" + rol + ", 'averageGrade': " + averageGrade
                + ",:'total enrolled courses': " + enrolledCourses.size();
    }


}
