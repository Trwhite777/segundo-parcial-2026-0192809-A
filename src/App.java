
import java.util.Scanner;

public class App {
    static  Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al centro de reciclaje");
        System.out.println("Cuantas cargas desea registrar un valor entre 3 y 20");
        int valorMinCargas = 3;
        int valorMaxCargas = 20;
        int valorMinKilogramos = 5;
        int valorMaxKilogramos = 200;
        int cantidadCargas = validarLimites(valorMinCargas,valorMaxCargas);
        int[] cargas  = new int[cantidadCargas];
        int pesoTotal = 0;
        int pesoMayor = 0;
        int posicionPesoMayor = 0;
        int cargasEntre5Y80 = 0;
        int cargasMayoresA80 = 0;



        for (int i=0 ; i<cantidadCargas ; i++) {
           System.out.println("Ingrese la cantidad de kilogramos de la carga " + (i+1));
           cargas[i] = validarLimites(valorMinKilogramos, valorMaxKilogramos);
           // el mismo visual indica lo que significa 5 y 80 5 como valor minimo y 80 como maximo
           if (validarNumeroDentroDeLimite(cargas[i], 5, 80 )) {
            cargasEntre5Y80++;
           } else {
            cargasMayoresA80++;
           }

           if (cargas[i] > pesoMayor) {
            posicionPesoMayor = i+1;
            pesoMayor = cargas[i];
           }

           pesoTotal += cargas[i];
        }

        double promediototal  = pesoTotal/cantidadCargas;


        int countCargasMayorAlPromedio = contarNumerosMayoresAunNumeroDeterminado(cargas, promediototal);



        
        System.out.println("CANTIDAD DE CARGAS " + cantidadCargas);
        imprimirArrayUnidimencional(cargas);
        System.out.println("Existen " + cargasEntre5Y80 + " cargas entre 5 y 80 kg");
        System.out.println("Existen " + cargasMayoresA80 + "  cargas Mayores a 80");
        System.out.println("Existen " + countCargasMayorAlPromedio + "Cargas Mayores al promedio");
        System.out.println("Promedio de cargas  = " + promediototal);
        System.out.println("El mayor peso es " + pesoMayor);
        System.out.println("Y se encontro en la posicion " + posicionPesoMayor);

        

    }

    public static int validarLimites(int valorMin , int valorMax) {
        int numeroLimitado = 23;
        while (true) { 
            numeroLimitado = lector.nextInt();
            if (numeroLimitado>=valorMin && numeroLimitado<=valorMax) {
                break;
            } else {
                System.out.println("ingresa nuevamente recuerda un valor entre " + valorMin + "Y" + valorMax);
            }
        }
        return numeroLimitado;
    }

    public static boolean validarNumeroDentroDeLimite(int numero , int valorMin , int valorMax) {
        if (numero>=valorMin && numero<=valorMax) {
            return true;
        } else {
            return false;
        }
    }

    public static void imprimirArrayUnidimencional(int[] array) {
        for (int valor : array) {
            System.out.print(valor  + ", ");
        }
        System.out.println();
    }

    public static int contarNumerosMayoresAunNumeroDeterminado(int[] array , double  numeroComparador) {
        int count =0;
        for (int valor : array) {
            if (valor>numeroComparador) {
                count++;
            }
        }
        return count;
    }






}
