package com.mycompany.exercicio18;

/**
 *
 * @author marco
 */

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int num, quadrado, cubo;
        double raiz;
        
        do{
            System.out.printf("\nDigite um numero maior que [0]: ");
            num = console.nextInt();
            
            if(num > 0){
                quadrado = num * num;
                cubo = num * num * num;
                raiz = Math.sqrt(num);

                System.out.printf("O numero %d ao quadrado e: %d \nAo cubo: %d\nRaiz quadrada: %.2f\n", num, quadrado, cubo, raiz);
            }
            
            
        }while(num > 0);
        
        System.out.printf("Saindo...");
    }
}
