package lab6.pkg1_progra2_andreaescobar;

import java.util.Date;

public class Personas {
    private String nombre;
    private String apellido;
    private String correo;
    private String fechanacimiento;
    private String pais;
    private int tel;
    private String pass;

    public Personas() {
    }

    public Personas(String nombre, String apellido, String correo, String fechanacimiento, String pais, int tel, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechanacimiento = fechanacimiento;
        this.pais = pais;
        this.tel = tel;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
