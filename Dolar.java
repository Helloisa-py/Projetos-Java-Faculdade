/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



/* Conversor de reais em dolar, verificar quantos dolares possui */



package dolar;
import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor da taxa de conversao atual do dolar para o real: ");
        float taxa = sc.nextFloat();
        
        System.out.println("Digite quantos dolares voce tem: ");
        float dolar = sc.nextFloat();
        
        float reais = taxa * dolar;
        
        System.out.println("O valor dos dolares em reais e: " + reais);
        
        sc.close();
    }
    
}

