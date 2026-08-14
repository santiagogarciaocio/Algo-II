//package aed;

class Funciones {

/***  Primera parte: Funciones en java ***/

    int cuadrado(int x) {
        // COMPLETAR
        int res = x*x;
        return res;
    }

    double distancia(double x, double y) {
        // COMPLETAR
        double res= Math.sqrt(x*x+y*y);
        return res;
    }

    boolean esPar(int n) {
        // COMPLETAR
        boolean res = (n%2) == 0; 
        return res;
    }

    boolean esBisiesto(int n) {
        // COMPLETAR
        boolean res;

        if(n%400==0 || (n%4==0 && !(n%100==0))){
            res = true;
        }else{
            res=false;
        }

        return res;
    }

    int factorialIterativo(int n) {
        // COMPLETAR
        int res =1;
        for(int i=1; i<=n;i++){
            res*=i;
        }
        return res;
    }

    int factorialRecursivo(int n) {
        // COMPLETAR
        int res;
        if(n==0){
            res=1;
        }else {res = n*factorialRecursivo(n-1);
        }
    
        return res;
    }

    boolean esPrimo(int n) {
        // COMPLETAR
        boolean res=true;
        if(n==0||n==1){res=false;}
        for(int i=2;i<n;i++){
            if(n%i==0){
                res=false;
            }
        }
        return res;
    }

    int sumatoria(int[] numeros) {
        // COMPLETAR
        int res = 0;
        for(int x:numeros){
            res += x;
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        // COMPLETAR
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==buscado){
                return i;
        }}
        return 0;        
    }

    boolean tienePrimo(int[] numeros) {
        // COMPLETAR
        boolean res = false;
        for(int i=0;i<numeros.length;i++){
            if(esPrimo(numeros[i])){
                res = true;
            }
        }
        return res;
    }

    boolean todosPares(int[] numeros) {
        // COMPLETAR
        boolean res=true;
        for(int x:numeros){
            if(!esPar(x)){
                res=false;
            }
        }
        return res;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        boolean res=true;
        if(s1.length()>s2.length()){return false;}
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                res=false;
            }
        }
        return res;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        boolean res= true;
        if(s1.length()>s2.length()){return false;}
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(s1.length()-i-1)!=s2.charAt(s2.length()-i-1)){
                res=false;
            }
        }
        return res;
    }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        return !(a && b) && (a || b);
    }

    boolean iguales(int[] xs, int[] ys) {
        boolean res = true;
        if(xs.length!=ys.length){return false;  }
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] != ys[i]) {
                res = false;
            }
        }
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;
        for (int i = 0; i < xs.length-1; i++) {
            if (xs[i] > xs [i+1]) {
                res = false;
            }
        }
        return res;
    }

    int maximo(int[] xs) {
        int res = xs[0];
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > res) {res = xs[i];}
        }
        return res;
    }

    boolean todosPositivos(int[] xs) {
        boolean res = true;
        for (int x : xs) {
            if (x <= 0) {
                res = false;
            } 
        }
        return res;
    }

}
