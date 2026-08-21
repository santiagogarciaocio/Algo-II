//package aed;

public class Agenda {
    private Fecha _hoy;
    private ArregloRedimensionableDeRecordatorios _recordatorios;
    

    public Agenda(Fecha fechaActual) {
        // Implementar
        _hoy = new Fecha(fechaActual);
        _recordatorios = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        // Implementar
        _recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        // Implementar
        String mensaje = this.fechaActual()+"\n";
        mensaje = mensaje.concat("=====\n");
        for(int i=0; i<_recordatorios.longitud();i++){
            if(_recordatorios.obtener(i).fecha().equals(_hoy)){
                mensaje = mensaje.concat(_recordatorios.obtener(i).toString()+"\n");
            }
        }
        return mensaje;
    }

    public void incrementarDia() {
        // Implementar
        _hoy.incrementarDia();
    }

    public Fecha fechaActual() {
        // Implementar
        return new Fecha(_hoy);
    }

}
