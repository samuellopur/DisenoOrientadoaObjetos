package org.example;

public abstract class Colegio {
    protected String rol;

    protected Colegio (String rol){
        this.rol = rol;
    }

    public abstract void imprimir();

    public String getRol() {
        return rol;
    }

    public void setRol(String name) {
        this.rol = name;
    }

    @Override
    public String toString() {
        return "Colegio{" +
                "rol='" + rol + '\'' +
                '}';
    }
}
