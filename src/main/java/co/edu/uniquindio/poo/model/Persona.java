package co.edu.uniquindio.poo.model;

public class Persona {
    
    private String id, gmail, telefono, palabraSecreta;

    public Persona(String id, String gmail, String telefono, String palabraSecreta) {
        this.id = id;
        this.gmail = gmail;
        this.telefono = telefono;
        this.palabraSecreta = palabraSecreta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    
}
