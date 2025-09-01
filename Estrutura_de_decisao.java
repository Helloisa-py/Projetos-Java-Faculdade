/* Recebe um número inteiro correspondente a nota do usuario e mostra uma mensagem dizendo se 
* foi aprovado ou nao de acordo com o merito escolhido 
*/

package estrutura_de_decisao;
import java.util.Scanner;
        
public class Estrutura_de_decisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite a sua nota: ");
        float nota = sc.nextFloat();
        
        if (nota >= 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
    
}

