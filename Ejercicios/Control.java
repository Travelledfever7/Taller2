/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dividirsindividir;

import java.util.Scanner;

/**
 *
 * @author lebus
 */
public class Control {
    public Control(){
        Scanner s=new Scanner(System.in);
        System.out.println("Dame el valor del divisor");
        int divisor=s.nextInt();
        System.out.println("Dame el valor del dividendo");
        int dividendo=s.nextInt();
        dividir(divisor,dividendo);
    }
    public void dividir(int divisor, int dividendo){
        if(divisor%dividendo==0){
            int sol=0;
            while(divisor>0){
                divisor-=dividendo;
                sol++;
            }
            System.out.println("La solucion de la division es:" + sol);
        }else{
             System.out.println("Los datos suministrados no son divisibles");
        }
    }
}
