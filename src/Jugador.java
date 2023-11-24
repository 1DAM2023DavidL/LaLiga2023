public class Jugador extends PersonalEquipo{
    private String numeroCamiseta;

    public Jugador(String nombre, String apellidos, String tipoPersonal,String numeroCamiseta) {
        super(nombre, apellidos, tipoPersonal);
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }
    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
}
