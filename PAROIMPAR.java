/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paroimpar;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class PAROIMPAR {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        numero=teclado.nextInt();
        
        if(numero%2 == 0){
        System.out.println("Es par ");
        }else{
        System.out.println("Es impar ");
        }
    }
}
