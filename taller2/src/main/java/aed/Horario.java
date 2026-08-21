//package aed;

public class Horario {
    private int _hora;
    private int _minutos;
    
    public Horario(int hora, int minutos) {
        // Implementar
        _hora = hora;
        _minutos = minutos;
    }

    public int hora() {
        // Implementar
        return _hora;
    }

    public int minutos() {
        // Implementar
        return _minutos;
    }

    @Override
    public String toString() {
        // Implementar
        return _hora+":"+_minutos;
    }

    @Override
    public boolean equals(Object otro) {
        // Implementar
        boolean esNull = (otro == null);
        if(esNull){
            return false;
        }
        
        boolean mismoTipo = (otro.getClass()==this.getClass());
        if(!mismoTipo){
            return false;
        }

        Horario otroHorario = (Horario) otro;

        return (otroHorario.hora()==_hora) && (otroHorario.minutos()==_minutos);
    }

}
