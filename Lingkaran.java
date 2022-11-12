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
public class Lingkaran extends BangunDatar {

    private float jari_jari;

    public Lingkaran(float jari_jari) {
        this.jari_jari= jari_jari;
    }
    
    
    @Override
    float getLuas() {
        return (float) (Math.PI *  jari_jari *  jari_jari);
    }
}