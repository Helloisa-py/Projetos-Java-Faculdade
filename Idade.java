/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idade;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a sua idade: ");
        
        int idade = sc.nextInt();
        if (idade >= 18){
            System.out.println("Maior de idade");
        } else { 
            System.out.println("Menor de idade");
        }
        sc.close();
    }
    
}
