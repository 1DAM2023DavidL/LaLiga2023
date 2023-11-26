public class Presidente extends PersonalEquipo{
    private String profesion;

    public Presidente(String nombre, String apellidos, String tipoPersonal, String profesion) {
        super(nombre, apellidos, tipoPersonal);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
