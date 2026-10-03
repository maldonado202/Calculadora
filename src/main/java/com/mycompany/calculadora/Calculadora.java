/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double num1;
        Double num2;
        Double resultado;
        int operacion;
        
        System.out.println("--CALCULADORA--");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("Ingrese un numero: ");
        operacion = teclado.nextInt();
        
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextDouble();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextDouble();
        
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: "+ resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: "+ resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: "+ resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("Resultado: "+ resultado);
                break;
             
            default:
                throw new AssertionError();
        }
    }
}

