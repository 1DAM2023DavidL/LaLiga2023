public class PersonalEquipo {
    private String nombre;
    private String apellidos;
    private String tipoPersonal;

    public PersonalEquipo(String nombre, String apellidos, String tipoPersonal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoPersonal = tipoPersonal;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTipoPersonal() {
        return tipoPersonal;
    }
    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }
}
