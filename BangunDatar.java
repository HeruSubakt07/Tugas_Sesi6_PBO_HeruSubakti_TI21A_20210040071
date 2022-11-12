/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ground;

/**
 *
 * @author HeruSubakti_tugas6_20210040071_TI21A
 */
public abstract class BangunDatar {
    String warna;
    
    String getWarna(){
       return warna;
    }
    
    String setWarna(String warna){
        return this.warna = warna;
    }
    
    abstract float getLuas();
}
