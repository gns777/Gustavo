/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soma;

/**
 *
 * @author GUSTAVONUNESSOLETTI
 */
import java.util.Scanner;
public class Soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Somar números");
        Scanner ler= new Scanner (System.in);
        int a, b, Soma;
        System.out.println("Digite um número: ");
        a = ler.nextInt ();
          System.out.println("Digite outro número");
        b = ler.nextInt ();
        Soma = a + b;
        System.out.println("A soma = "+ Soma);
        
        
    }
    
}
