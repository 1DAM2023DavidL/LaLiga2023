public class Entrenador extends PersonalEquipo{
    private String añoNacimiento;

    public Entrenador(String nombre, String apellidos, String tipoPersonal, String añoNacimiento) {
        super(nombre, apellidos, tipoPersonal);
        this.añoNacimiento = añoNacimiento;
    }
    public String getAñoNacimiento() {
        return añoNacimiento;
    }
    public void setAñoNacimiento(String añoNacimiento) {
        this.añoNacimiento =añoNacimiento;
    }
}
