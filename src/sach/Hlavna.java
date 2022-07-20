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
public class Hlavna {
    public static void main(String[] args) {
        Sach s = new Sach();
        s.pridajFigurku(new Pesiak(7,2));
        s.pridajFigurku(new Pesiak(7,4));
        
        s.pridajFigurku(new Dama(2,3));
        s.pridajFigurku(new Dama(4,4));
        s.vypis();
        
        s.tah(7,2,6,2);
        s.tah(4,4,2,6);
        s.vypis();

        s.tah(2,3,8,3);
        s.vypis();
    }
}
