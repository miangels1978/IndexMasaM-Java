package dev.miguelangel;
import java.util.Scanner;


/**
 * Hello world!
 */


public final class App {
   
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Scanner capt = new Scanner(System.in);
               
        System.out.println("Ingresa tu altura en centimetros");
        float sizePerson = capt.nextInt();
        sizePerson = sizePerson/100;
        System.out.println("Ingresa tu peso en kilogramos (Kg):");
        float weightPerson = capt.nextInt();
        
        double imc;
        imc = weightPerson / Math.pow(sizePerson,2);
        System.out.print("Basándonos en tu índice de masa corporal calculado, que es de "+Math.round(imc * 100) / 100d+", podemos observar que estás en la categoría de ");
             
        if (imc < 16) {
            System.out.println("Delgadez severa");
        } 
        else if (imc >= 16 && imc < 17) {
            System.out.println("Delgadez moderada");
        }
        else if (imc >= 17 && imc < 18.5) {
            System.out.println("Delgadez leve");
        } 
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } 
        else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } 
        else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidad leve");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obecidad moderada");
        } else if (imc >= 40) {
            System.out.println("Obecidad mórbida");
        } 
        capt.close();
    }  

}
    

