/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author lebus
 */
public class Control {

    public Control() {
        Scanner s=new Scanner(System.in);
        System.out.println("Que termino quieres de la sucesion?");
        int num=s.nextInt();
        System.out.println(fibonacci(num));
    }

    public int fibonacci(int n_term){
        if(n_term<=1){
            return n_term;
        }else{
            return fibonacci(n_term-1)+fibonacci(n_term-2);
        }
    }
}
