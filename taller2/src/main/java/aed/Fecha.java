//package aed;

public class Fecha {  
    private int _dia;
    private int _mes;

    public Fecha(int dia, int mes) {
        // Implementar
        _dia = dia;
        _mes = mes;   
    }

    public Fecha(Fecha fecha) {
        // Implementar
        _dia = fecha.dia();
        _mes = fecha.mes();
    }

    public Integer dia() {
        // Implementar        
        return _dia;
    }

    public Integer mes() {
        // Implementar
        return _mes;
    }

    public String toString() {
        // Implementar
        return _dia+"/"+_mes;
    }

    @Override
    public boolean equals(Object otra) {
        // Implementar
        boolean esNull = (otra == null);
        if (esNull){
            return false;
        }
        boolean esFecha = (otra.getClass() == this.getClass());
        if (!esFecha){
            return false;
        }

        Fecha otraFecha = (Fecha) otra;
        return (otraFecha.dia() == this.dia()) && (otraFecha.mes() == this.mes());        
    }

    public void incrementarDia() {
        // Implementar
        if(_mes==12 && _dia==31){
            _dia = 1;
            _mes = 1;
        }
        else if(this.diasEnMes(_mes) == _dia){
            _dia = 1;
            _mes += 1; 
        }
        else{
            _dia += 1;            
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
