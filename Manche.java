/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finstere_flure;

/**
 *
 * @author abigail.berthe
 */
public class Manche {
    private int numManche = 1;
    
    public int getNumManche(){
        return this.numManche;
    }
        //conditions d'arrêt d'une manche
    public void arret(Joueur j){
        if(j.pionRestant()<=1){
            if(numManche==1){
            System.out.println("Fin de manche!\n");
            System.out.println("Manche"+numManche+1);
        }
        else
                System.out.println("Fin de Jeu");
           
        }
    }
}
