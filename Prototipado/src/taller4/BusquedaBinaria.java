package taller4;

public class BusquedaBinaria {
    public static void main(String[] args) {
        // Declaracion e inicializacion de variables
        int []valores = new int[200];
        int contador = 1;
        int numeroBuscar = 200;
        int indice = -1;
        // Generador de numeros secuenciales desde el 1 - 200
        for (int i = 0; i < valores.length ; i++) {
            valores[i] = contador;
            contador++;
        }
        // Calcular la posicion del numero a buscar
        for (int i = 0; i < valores.length ; i++) {
            if(valores[i] == numeroBuscar ){
                indice = i;
            }
        }
        // Imprimir resultados
        if(indice == -1){
            System.out.printf("El numero %d no se encuentra en el array.",numeroBuscar);
        } else {
            System.out.printf("El numero %d se encuentra en la posicion %d del array",numeroBuscar,indice);
        }

    }
}
