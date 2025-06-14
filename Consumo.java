public class Consumo {
    public static void main(String[] args) {
        int[][] gasolina= {
            {11,6,1},
            {4,8,2},
            {1,7,15},

        };
        System.out.println("promedio es "+promedioConsumoModerado(gasolina));
        System.out.println("los consumos altos son "+contarConsumosAltos(gasolina));
        System.out.println("los consumos bajo son  "+ imprimirConsumoBajo(gasolina));
        System.out.println("promedio de todas las gasolinas " + promedioDeTodoConsumo(gasolina));
    
    }
public static int contarConsumosAltos(int[][] gasolina){
    int consumosAltos=0;
    for (int[] fila : gasolina) {
        for (int[] col : gasolina) {
            if(8>gasolina.length){
               consumosAltos++;
            }
            
        }
    }
       return consumosAltos;

}
public static int promedioConsumoModerado(int[][] gasolina){
    int suma=0;
    for (int[] fila : gasolina) {
        for (int[] col : gasolina) {
            if(7<gasolina.length && 4>gasolina.length){

                suma=suma+gasolina.length;
                
            }
            
        }
    }
        return suma/gasolina.length;

}
public static int imprimirConsumoBajo(int[][] gasolina){
    int consumosBajos=0;
    for (int[] fila : gasolina) {
        for (int[] col : gasolina) {
            if(3<gasolina.length){
               consumosBajos++;
            }
            
        }
    }
    return consumosBajos;
}


public static int promedioDeTodoConsumo(int[][] gasolina){
int suma=0;
    for (int[] fila : gasolina) {
        for (int[] col : gasolina) {
            if(0<gasolina.length ){
                suma=suma+gasolina.length;
                
            }
            
        }
    }
        return suma/gasolina.length;
}
}

