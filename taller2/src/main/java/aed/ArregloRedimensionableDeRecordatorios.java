//package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] _vector;

    public ArregloRedimensionableDeRecordatorios() {
        // Implementar
        _vector = new Recordatorio[0];
    }

    public int longitud() {
        // Implementar
        return _vector.length;
    }

    public void agregarAtras(Recordatorio i) {
        // Implementar
        Recordatorio[] nuevoVector = new Recordatorio[_vector.length+1];
        for(int c = 0; c<_vector.length ; c++){
            nuevoVector[c] = _vector[c];
        }
        nuevoVector[_vector.length] = i;
        _vector = nuevoVector.clone();
    }

    public Recordatorio obtener(int i) {
        // Implementar
        return _vector[i];
    }

    public void quitarAtras() {
        // Implementar
        if(_vector.length != 0){ 
        Recordatorio[] nuevoVector = new Recordatorio[_vector.length-1];
        for(int c = 0; c<_vector.length-1 ; c++){
            nuevoVector[c] = _vector[c];
        }        
        _vector = nuevoVector.clone();
    }
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        // Implementar
        Recordatorio[] nuevoVector = new Recordatorio[_vector.length];
        for(int i = 0;i<_vector.length;i++){
            if(i!=indice){
                nuevoVector[i] = _vector[i];
            }
            else{nuevoVector[i] = valor;}
        }
        _vector = nuevoVector.clone();
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        // Implementar
        Recordatorio[] nuevoVector = new Recordatorio[vector.longitud()];
        for(int i=0;i<vector.longitud();i++){
            nuevoVector[i] = new Recordatorio(vector.obtener(i).mensaje(),vector.obtener(i).fecha(),vector.obtener(i).horario());
        }
        _vector = nuevoVector;
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar  
        ArregloRedimensionableDeRecordatorios vectorCopia = new ArregloRedimensionableDeRecordatorios(this);
        return vectorCopia;
    }
}
