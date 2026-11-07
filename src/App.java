
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
        int[] cantidadKilogramo  = new int[cantidadCargas];
        int pesoTotal = 0;

        for (int i=0 ; i<cantidadCargas ; i++) {
            System.out.println("Ingrese la cantidad de kilogramos de la carga" + (i+1));
           cantidadKilogramo[i] = validarLimites(valorMinKilogramos, valorMaxKilogramos);
           pesoTotal += cantidadKilogramo;
        }

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




}
