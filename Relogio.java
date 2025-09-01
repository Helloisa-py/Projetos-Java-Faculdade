
package relogio;
import java.util.Scanner;


public class Relogio {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite o valor das horas atuais: ");
      int hora = sc.nextInt();
      
      System.out.println("Digite o valor dos minutos atuais: ");
      int minuto = sc.nextInt();
      
      int total = hora * 60 + minuto;
      
      System.out.println("Ja se passaram " + total + " minutos do dia");
      
      sc.close();
    }
    
}
