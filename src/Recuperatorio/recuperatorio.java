/*
        Se tiene una matriz de caracteres de tamanio 3*20 de secuencias de caracteres vocales minusculas (por cada fila) separadas por espacios.
        La matriz esta precargada (no implementar el metodo de carga), y ademas cada fila empieza y termina con uno o mas separadores espacios.
        Se pide realizar un programa que:
        _en cada secuencia inserte en el principio de la misma el ultimo caracter vocal que tiene la secuencia, si cumple con la condicion de que la secuencia tiene
         todas las vocales o todas las consonantes.
        Suponer que cada fila de la matriz tiene espacio para agregar esos caracteres.
        */
import java.util.Random;
public class recuperatorio {
    static int MAXFILAS = 3;
    static int MAXCOL = 20;
    static char[][] matchar = { {'a', 'r', 'j', 'o', ' ', ' ', ' ', 'a', 'e', 'i', 'o', 'u', ' ', ' ', ' ', ' ', ' ', ' ', 'c', ' '},
                                {'a', 'd', 'v', ' ', 'a', 'e', 'i', 'o', 'u', ' ', 's', 'd', 'b', 'n', 'a', 'b', 'v', 'v', 'z', 'a'},
                                {'s', 'c', 'x', ' ', 'f', ' ', 'i', 'f', 'c', 'e', 'h', 'n', ' ', 'g', 's', 'q', ' ', 'k', 'l', 'i'}};

    public static void main(String[] args) {
        imprimir();
        resolver_ejercicio();
        imprimir();

    }

    public static void imprimir(){
        for (int i = 0; i < MAXFILAS; i++){
            System.out.println("");
            for (int j = 0; j < MAXCOL; j++){
                System.out.print(matchar[i][j] + ", ");
            }
        }
        System.out.println("");
    }
    public static void resolver_ejercicio(){
        for (int i = 0; i < MAXFILAS ; i++) {
            detectar_secuencia(i);
            System.out.println("");
        }
    }
    public static void detectar_secuencia(int fila){
        int inicioSec_columna;
        int finSec_columna;

        System.out.println("");

        for (int i = 0; i < MAXCOL-1; i++) {
            inicioSec_columna = detectar_inicio(fila, i);
            finSec_columna = detectar_fin(fila, inicioSec_columna);
            i = finSec_columna;
            System.out.print(inicioSec_columna +" "+ (finSec_columna)+ " --- ");
            cambiar(inicioSec_columna, finSec_columna, fila);
        }

    }
    public static int detectar_inicio(int fila, int columna){
        while(columna <= MAXCOL-1 && matchar[fila][columna] == ' '){
            columna++;
        }
        return columna;
    }
    public static int detectar_fin(int fila, int inicio){
        while(inicio <= MAXCOL-1 && matchar[fila][inicio] != ' '){
            inicio++;
        }
        return inicio - 1;
    }

    public static void cambiar(int inicio, int fin,int fila){
        if(secuenciaVocales(inicio, fin, fila) || secuenciaConsonantes(inicio, fin, fila)){
            matchar[fila][inicio] = matchar[fila][fin];
        }
    }
    public static boolean secuenciaVocales(int inicio, int fin, int fila){
        boolean todasVocales = false;

        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;

        while(inicio <= fin){
            if(matchar[fila][inicio] == 'a' || matchar[fila][inicio] == 'e' || matchar[fila][inicio] == 'i' || matchar[fila][inicio] == 'o' || matchar[fila][inicio] == 'u'){
                switch(matchar[fila][inicio]){
                    case 'a' -> a = true;
                    case 'e' -> e = true;
                    case 'i' -> i = true;
                    case 'o' -> o = true;
                    case 'u' -> u = true;
                }
                inicio++;
            }else{
                todasVocales = false;
                break;
            }
        }

        if (a && e && i && o && u){
            todasVocales = true;
        }
        return todasVocales;
    }

    public static boolean secuenciaConsonantes(int inicio, int fin, int fila) {

        boolean todasConsonantes = false;

        boolean b = false;
        boolean c = false;
        boolean d = false;
        boolean f = false;
        boolean g = false;
        boolean h = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;
        boolean m = false;
        boolean n = false;
        boolean p = false;
        boolean q = false;
        boolean r = false;
        boolean s = false;
        boolean t = false;
        boolean v = false;
        boolean w = false;
        boolean x = false;
        boolean y = false;
        boolean z = false;

        while (inicio <= fin) {
            if (
                    matchar[fila][inicio] == 'b' ||
                            matchar[fila][inicio] == 'c' ||
                            matchar[fila][inicio] == 'd' ||
                            matchar[fila][inicio] == 'f' ||
                            matchar[fila][inicio] == 'g' ||
                            matchar[fila][inicio] == 'h' ||
                            matchar[fila][inicio] == 'j' ||
                            matchar[fila][inicio] == 'k' ||
                            matchar[fila][inicio] == 'l' ||
                            matchar[fila][inicio] == 'm' ||
                            matchar[fila][inicio] == 'n' ||
                            matchar[fila][inicio] == 'p' ||
                            matchar[fila][inicio] == 'q' ||
                            matchar[fila][inicio] == 'r' ||
                            matchar[fila][inicio] == 's' ||
                            matchar[fila][inicio] == 't' ||
                            matchar[fila][inicio] == 'v' ||
                            matchar[fila][inicio] == 'w' ||
                            matchar[fila][inicio] == 'x' ||
                            matchar[fila][inicio] == 'y' ||
                            matchar[fila][inicio] == 'z'
            ) {
                switch (matchar[fila][inicio]) {
                    case 'b' -> b = true;
                    case 'c' -> c = true;
                    case 'd' -> d = true;
                    case 'f' -> f = true;
                    case 'g' -> g = true;
                    case 'h' -> h = true;
                    case 'j' -> j = true;
                    case 'k' -> k = true;
                    case 'l' -> l = true;
                    case 'm' -> m = true;
                    case 'n' -> n = true;
                    case 'p' -> p = true;
                    case 'q' -> q = true;
                    case 'r' -> r = true;
                    case 's' -> s = true;
                    case 't' -> t = true;
                    case 'v' -> v = true;
                    case 'w' -> w = true;
                    case 'x' -> x = true;
                    case 'y' -> y = true;
                    case 'z' -> z = true;
                }
                inicio++;
            } else {
                todasConsonantes = false;
                break;
            }
        }

        if (b && c && d && f && g && h && j && k && l && m && n && p && q && r && s && t && v && w && y && z){
            todasConsonantes = true;
        }
        return todasConsonantes;
    }
}
