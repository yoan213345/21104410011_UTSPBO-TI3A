/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uts_no2;

/**
 *
 * @author yoan ockta pradana
 */

public class MainEnergi {
    MainEnergi me = new MainEnergi ();
    scanner input = new scanner (source:System.in);
    
    System.out.print(s:"Masukkan kecepatan benda = ");
    Double v = input.nextDouble();
    me.setKecepatanBenda (KecepatanBenda:v);
    System.out.println();
    
    System.out.print(s:"Masukkan Massa Benda =");
    Double m = input.nextDouble();
    me.setMassabenda(MassaBenda:M);
    System.out.println();
    
    Double ek = 0.5 / me.getMassabenda()*me.KecepatanBenda
            me.setEK(EK:EK);
            
    System.out.println("Jadi Hsilnya adalah "+ me.getEK())

}
}
