/* Recebe um numero inteiro digitado correspondente a idade do usuario e exibe uma mensagem
* dizendo se e maior de idade ou menor de idade
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

