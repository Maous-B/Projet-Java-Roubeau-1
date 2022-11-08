
import java.lang.Math;

import java.lang.Thread;

public class Projet {
	
	public static void main(String args[]){
		
		 int X, points_joueur_1 = 0, points_joueur_2 = 0, choix_premier_tour = (int) (Math.random() * 2 + 1), tour_du_joueur = 0;
		 
		 //System.out.println(X);
		 System.out.println("Choix du joueur qui va jouer le premier tour");
		 
		 
		 if(choix_premier_tour == 1) {
			System.out.println("Le premier joueur a été choisit aléatoirement et peut commencer");
			tour_du_joueur = 1;
		 } 
		 
		 else {
			System.out.println("Le deuxième joueur a été choisit aléatoirement et peut commencer");
			tour_du_joueur = 2;
		 }
		 
		 
		 
		 while(points_joueur_1 < 30 || points_joueur_2 < 30) {
			 
			 X = (int) (Math.random() * 6 + 1);
			 
			 if(X == 6) {
				 if(tour_du_joueur == 1) {
					 
					 System.out.println("Le premier joueur a tiré le dé 6, il gagne "+ points_joueur_1 + " et donc peut rejouer, c'est au tour du deuxième joueur");
					 
					 if(points_joueur_1 < 30) {
						 points_joueur_1 += X;
					 }
					 else {
						 System.out.println("Le joueur 1 a atteint le maximum de points");
						 break;
					 }
					 
					 tour_du_joueur = 1;
				 }
				 
				 else {
					 System.out.println("Le deuxième joueur a tiré le dé 6, il gagne " + points_joueur_2 + " et donc peut rejouer, c'est au tour du premier joueur");
					 
					 if(points_joueur_2 < 30) {
						 points_joueur_2 += X;
					 }
					 else {
						 System.out.println("Le joueur 2 a atteint le maximum de points");
						 break;
					 }
					 
					 tour_du_joueur = 2;
				 }
			 }
			 
			 else {
				 
				 if(tour_du_joueur == 1) {
					 if(points_joueur_1 < 30) {
						 points_joueur_1 += X;
					 }
					 else {
						 System.out.println("Le joueur 1 a atteint le maximum de points");
						 break;
					 }
					 points_joueur_1 += X;
					 tour_du_joueur = 2;
					 System.out.println("Le premier joueur a tiré le dé " + X + " et gagne " + points_joueur_1 + " points, c'est au tour du deuxième joueur");
				 }
				 else {
					 if(points_joueur_2 < 30) {
						 points_joueur_2 += X;
					 }
					 else {
						 System.out.println("Le joueur 2 a atteint le maximum de points");
						 break;
					 }
					 tour_du_joueur = 1;
					 System.out.println("Le deuxième joueur a tiré le dé " + X + " et gagne " + points_joueur_2 + " points, c'est au tour du premier joueur");
				 }
			 }
		 }
		 
		 
		 if(points_joueur_1 > points_joueur_2) {
			 System.out.println("Le joueur 1 a gagné");
		 }
		 else {
			 System.out.println("Le joueur 2 a gagné");
		 }
		 
		 System.out.println("Scores : \nJoueur 1 : " + points_joueur_1 + "\nJoueur 2 : " + points_joueur_2);
	}
}
