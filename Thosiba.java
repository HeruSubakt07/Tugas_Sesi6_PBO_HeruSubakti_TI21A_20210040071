/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indohome;

/**
 *
 * @author HeruSubakti_tugas6_20210040071_TI21A
 */
public class Thosiba implements Laptop {

    private int volume;
    private boolean isPowerOn;

    public Thosiba() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Laptop is on...");
        System.out.println("Thosiba portage");
        System.out.println("core i7");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Shutdown in process....");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume is: " + this.getVolume());
            }
        } else {
            System.out.println("Volume Full!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume is = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume is: " + this.getVolume());
            }
        } else {
            System.out.println("Volume = 0!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }

}