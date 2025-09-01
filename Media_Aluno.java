/* Recebe o valor de duas notas digitadas pelo usuário, calcula a media e
* exibe uma mensagem de aprovado ou reprovado de acordo com a condicao
*/
package media_aluno;

import java.util.Scanner;

public class Media_Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite a primeira nota: ");
        float n1 = sc.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float n2 = sc.nextFloat();
        
        float m = (n1+n2)/2;
        
        if (m>=6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
    
}
