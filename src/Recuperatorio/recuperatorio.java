package Recuperatorio;
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
        recorrer_filas();

    }

        public static void recorrer_filas(){
            for (int i = 0; i < MAXFILAS ; i++) {
                detectar_secuencia(i);
                System.out.println("");
            }
        }
            public static void detectar_secuencia(int fila){
                int inicioSec_columna;
                int finSec_columna;

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
                    if(secuenciaVocales(inicio, fin, fila) || secuenciaConsonantes(inicio, fin)){

                    }
                }
                    public static boolean secuenciaVocales(int inicio, int fin, int fila){
                    boolean todasVocales = false;
                    boolean todasConsonantes = false;
                        while(inicio <= fin){
                            if(matchar[fila][inicio] == 'a' || matchar[fila][inicio] == 'e' || matchar[fila][inicio] == 'i' || matchar[fila][inicio] == 'o' || matchar[fila][inicio] == 'u'){
                                todasVocales = true;
                                inicio++;
                            }else{
                                todasVocales = false;
                                todasConsonantes = true;
                                break;
                            }
                        }
                    return todasVocales;
                    }

                    public static boolean secuenciaConsonantes(int inicio, int fin){

                    }
}


