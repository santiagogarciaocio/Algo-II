//package aed;

public class Recordatorio {
    private String _mensaje;
    private Fecha _fecha;
    private Horario _horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        // Implementar
        _mensaje = mensaje;
        _fecha = new Fecha(fecha);
        _horario = horario;
    }

    public Horario horario() {
        // Implementar
        return _horario;
    }

    public Fecha fecha() {
        // Implementar
        Fecha fecha = new Fecha(_fecha);
        return fecha;
    }

    public String mensaje() {
        // Implementar
        return _mensaje;
    }

    @Override
    public String toString() {
        // Implementar
        return _mensaje+" @ "+_fecha.toString()+" "+_horario.toString();
    }

    @Override
    public boolean equals(Object otro) {
        // Implementar
        boolean esNull = (otro == null);
        boolean esOtroTipo = (this.getClass() != otro.getClass());
        if(esNull || esOtroTipo){
            return false;
        }

        Recordatorio otroRecord = (Recordatorio) otro;

        return (otroRecord.mensaje() == this.mensaje()) && (otroRecord.horario().equals(this.horario())) && (otroRecord.fecha().equals(this.fecha()));
    }

}
