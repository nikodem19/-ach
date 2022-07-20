/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach;

/**
 *
 * @author Nikodém Babirád
 */
public abstract class Figurka {
    protected int poziciaX;
    protected int poziciaY;

    public Figurka(int poziciaY, int poziciaX) {
        this.poziciaX = poziciaX;
        this.poziciaY = poziciaY;
    }

    public boolean nachadzaSa(int i, int j){
        return this.poziciaX == j && this.poziciaY == i;
    }
   
    public abstract void tah(int y, int x) throws ZlyTahErr;
    public abstract String opis();
}
