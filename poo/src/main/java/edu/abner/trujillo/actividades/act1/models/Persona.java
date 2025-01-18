package edu.abner.trujillo.actividades.act1.models;

public class Persona {
    private String pelo;
    private String piel;
    private Float altura;
    private String nacionalidad;

    @Override
    public String toString() {
        return "Car{" +
                "pelo='" + pelo + '\'' +
                ", piel='" + piel + '\'' +
                ", alturas=" + altura +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    public Persona(String pelo, String piel, Float altura, String nacionalidad) {
        this.pelo = pelo;
        this.piel = piel;
        this.altura = altura;
        this.nacionalidad = nacionalidad;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        if (altura < 1 || altura > 2.5) {
            throw new IllegalArgumentException("Tu no mides eso wey");
        }
        this.altura = altura;

    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}