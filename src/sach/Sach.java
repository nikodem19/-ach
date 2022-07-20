/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikodém Babirád
 */
public class Sach {
   private List<Figurka> figurky = new ArrayList<>();
    public void pridajFigurku(Figurka f){
       figurky.add(f);
    }

    public void odoberFigurku(Figurka f){
       figurky.remove(f);
    }
    
    public void vypis(){
        System.out.println("       ♕ Sach ♙");
        System.out.print("  1  2 3  4 5  6  7 8");
        System.out.println();
        for (int i = 1; i <= 8; i++){
            System.out.print(i+" ");
            for (int j = 1; j <= 8; j++){
                Figurka tmp = null;
                for (Figurka f : figurky){
                    if (f.nachadzaSa(i,j)){
                        tmp = f;
                        break;
                    }
                }
                if(null== tmp){
                    System.out.print("□ ");
                }else {
                   System.out.print(tmp.opis()); 
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void tah(int pozY, int pozX, int y, int x){
        for (Figurka f : figurky){
            if(f.nachadzaSa(pozY, pozX)){
                try {
                    f.tah(y, x);
                    System.out.println("Taham figurku: "+f.opis()+"na poziciu: "+y+" "+x);
                } catch (ZlyTahErr e) {
                    System.out.println("Zly tah");
                }
            }
        }
    }
    
    
}
