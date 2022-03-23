/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetS4;

import java.util.ArrayList;

/**
 *
 * @author Utilisateur
 */
public class Joueur {
    //joueur
    String nom;   //pseudo du joueur
    ArrayList<Pion> tab=new ArrayList<>(4);   //les pions qu'il a en sa possession
    public Joueur(String e, ArrayList possession){
        this.nom=e;
        this.tab=possession;
    }
    
       public int plusMonstrueux(){
        Random rand = new Random();
        int nbJoueurs=2;
        int numJMonstrueux= rand.nextInt(2+1);
        System.out.println("le joueur: "+numJMonstrueux+"commence");
        return numJMonstrueux;
    }
    
        //retourne le nombre de pion restants
    public int pionRestant(){
        return tab.size();
    }
    
    
    
}
