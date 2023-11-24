public class Partido {
    private String codigoPartido;
    private String fechaPartido;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(String codigoPartido, String fechaPartido, Equipo equipoLocal, Equipo equipoVisitante) {
        this.codigoPartido = codigoPartido;
        this.fechaPartido = fechaPartido;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public String getCodigoPartido() {
        return codigoPartido;
    }
    public void setCodigoPartido(String codigoPartido) {
        this.codigoPartido = codigoPartido;
    }
    public String getFechaPartido() {
        return fechaPartido;
    }
    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
    public Equipo getEquipoLocal() {
        return  equipoLocal;
    }
    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
}