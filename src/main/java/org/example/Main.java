package org.example;

// 1. Modifica las clases Course, Mentor y Student para que utilicen encapusulación.
// 2. Utiliza una Interfaz para mejorar el diseño orientado a objetos
// 3. Crea una clase abstracta para mejorar el diseño orientado a objetos
public class Main {
    public static void main(String[] args) {
        Colegio rol = new Estudiante("Samuel");
        rol.imprimir();


        /*Estudiante estudiante = new Estudiante("2070782","Santiago C");
        Curso curso = new Curso("Algorithms", "ALGO", 100);
        Curso curso1 = new Curso("Operating Systems", "OSP", 80);
        Estudiante estudiante1 = new Estudiante("2070781","Samuel L");
        estudiante.enrroll(curso);
        estudiante.enrroll(curso1);
        System.out.println(estudiante);
        System.out.println(estudiante1);*/

    }
}