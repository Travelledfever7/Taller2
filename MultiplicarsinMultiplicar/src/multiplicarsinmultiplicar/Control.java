/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicarsinmultiplicar;

import java.util.Scanner;

/**
 *
 * @author lebus
 */
public class Control {
    public Control(){
        Scanner s=new Scanner(System.in);
        System.out.println("Digite su numero a multiplicar");
        int num=s.nextInt();
        System.out.println("Ingrese el multiplicador");
        int mult=s.nextInt();
        multiplicarSinmultiplicar(num,mult);
    }
    public void multiplicarSinmultiplicar(int num,int mult){
        int sol=0;
        for(int i=0;i<mult;i++){
            sol+=num;
        }
        System.out.println("El resultado de la multiplicacion es: " + sol);
    }
}
