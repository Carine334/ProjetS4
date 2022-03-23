/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetS4;

/**
 *
 * @author rados
 */
public class Monstre { //regarde et cherche le pion le plus proche à gauche droite et devant, puis se tourne vers le pion le plus proche et se déplace d'un nombre n de case(s) selon la carte piochée (cartes différentes des joueurs), si rien dans champ de vision continue sur la même trajectoire
    //haut, bas, gauche, droite, 1234
    private int x=0, y=0;
    private int sensMonstre = 4;//il commence en haut à gauche du plateau en regardant vers la droite
    
    
    public boolean regarder (){
        if(sensMonstre==1){//haut
            for(int i=0; i</*nom du tableau où sont stockés les booléens de positions des pions*/.lenght; i++){
            if(t[i]==true){//faire lignes et colonnes, tab2dim
                int 
            }
        }
        }
        else if(sensMonstre==2){//bas
            
        }
        else if(sensMonstre==3){//gauche
            
        }
        else if(sensMonstre==4){//droite
            
        }
        else{
            
        }
    }
    
    //les deux méthodes qui suivent peuvent être améliorer
       public void mangerManche1(Pion p, Joueur j){
        
        if(p.getX()==x && p.getY()==y){ 
            p.setSurPlateau(false);
        }   
        int nb=j.pionRestant();
        nb--;
    //sera suivi de la méthode remettre en fin de manche
    } 
    
    public void mangerManche2(Pion p, Joueur j){
        if(p.getX()==x && p.getY()==y){ 
            p.setSurPlateau(false);
        }   
        int nb=j.pionRestant();
        nb--;
        //le pion ne sera pas remis
    }
}
//méthode pour afficher sa position
//méthode déplacement voir dans Pion



