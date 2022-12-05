/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS;

/**
 *
 * @author yoan ockta pradana
 */
public class Dangdut {
    
    string penyanyi = "Ayu Ting Ting";
    string lagu = "Alamat Palsu";
    
    Dangdut(){
        
    }
    
    void siger(string penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(string lagu){
        this.lagu = lagu;
    }
    
    void cetakLebel(){
        system.out.println(this.penyanyi+" <=> "+this.lagu);
    }
           

}
