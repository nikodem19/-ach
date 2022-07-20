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
public class Pesiak extends Figurka{
    public Pesiak(int poziciaY, int poziciaX) {
        super(poziciaY, poziciaX);
    }

    public void tah(int y, int x) throws ZlyTahErr {
        if(poziciaX == x && (poziciaY == y+1 || poziciaY == y -1) && (x<9 && x>0) && (y>0 && y<9)){
                poziciaY = y;
        }else {
            throw new ZlyTahErr();
        }
    }
    public String opis() {
        return "♙ ";
    }
    
}
