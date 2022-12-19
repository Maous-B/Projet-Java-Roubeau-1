
import java.lang.Math;

import java.lang.Thread;

public class Projet {
	
	public static void main(String args[]){

        int X, points_joueur_1 = 0, points_joueur_2 = 0, choix_premier_tour = (int) (Math.random() * 2 + 1), tour_du_joueur = 0;

        /* Initialisation des variables
        - points_joueur_1 et points_joueur_2 sont les variables d'initialisation du début
        - X est le dé lancé au hasard avec le module Math.random() qui génère un nombre entre 1 et 6
        - choix_premier_tour est un nombre au hasard entre 1 et 2 et cela permet de choisir qui commence
        - tour_du_joueur sera changé a chaque fois qu'un joueur

         */
        String[] dice = {
                "  _________\n /        /|\n/________/ |\n|        | |\n|        | |\n|        | /\n|________|/",
                "  _________\n /        /|\n/________/ |\n|        | |\n|   o    | |\n|        | /\n|________|/",
                "  _________\n /        /|\n/________/ |\n| o      | |\n|        | |\n|      o | /\n|________|/",
                "  _________\n /        /|\n/________/ |\n| o      | |\n|   o    | |\n|      o | /\n|________|/",
                "  _________\n /        /|\n/________/ |\n| o    o | |\n|        | |\n| o    o | /\n|________|/",
                "  _________\n /        /|\n/________/ |\n| o    o | |\n|   o    | |\n| o    o | /\n|________|/",
                "  _________\n /        /|\n/________/ |\n| o    o | |\n| o    o | |\n| o    o | /\n|________|/",
        };


		
        System.out.println("Choix du joueur qui va jouer le premier tour");


        
        // Si le choix au début est 1, c'est le joueur 1 qui commence
        if(choix_premier_tour == 1 ) {
            System.out.println("Le premier joueur a été choisit aléatoirement et peut commencer");
            tour_du_joueur = 1; // Attribution du tour au joueur 1
        }

		// Sinon, c'est le joueur 2 qui commence
        else {
            System.out.println("Le deuxième joueur a été choisit aléatoirement et peut commencer");
            tour_du_joueur = 2; // Attribution du tour au joueur 2
        }


        // Tant que l'un des deux joueurs n'atteint pas 30 points
        while(points_joueur_1 < 30 || points_joueur_2 < 30) {


            // X = le dé et il va générer un nombre aléatoire entre 1 et 6
            X = (int) (Math.random() * 6 + 1);

            //Merci à Hugo pour avoir fait un ASCII Art qui affiche un dé en texte    
            System.out.println(dice[X]);
			
			
			//Si le dé est égal a 6
            if(X == 6) {
				
				// Si le tour du joueur est 1, il va faire jouer le joueur 1
                if(tour_du_joueur == 1) {
					
					//Si le dé 6 + les points du joueur 1 sont supérieur à 30 (supérieur à la limite du score), la boucle va se casser 
                    if(points_joueur_1 + X >= 30) {
                        System.out.println("Le joueur 1 a tiré le dé 6. Cependant, l'ajout de ce point fait qu'il dépasse le maximum de points. donc il a gagné");
                        points_joueur_1 = 30; //Le joueur 1 sera attribué 30 points car on sait qu'il aura gagné et qu'il a dépassé les 30 points
                        break; // La boucle se casse et l'algorithme pourra sortir de celle-ci
                    }
					
					//Sinon, on continue toujours d'ajouter des points
                    else {
						
                        points_joueur_1 += X; // Attribution des points au joueur 1 
                        System.out.println("Le joueur 1 a tiré le dé 6, il gagne 6 et donc peut rejouer. Son score est de " + points_joueur_1 + " points.");
                        tour_du_joueur = 1; // c'est toujours au joueur 1 car il avait tiré le dé 6, donc il est attribué avec le chiffre 1
                    }
                }
				//Si ce n'est pas le tour du joueur 1, c'est surement au tour du joueur 2
                else {
					//Pareil mais c'est pour le tour du joueur 2 : Si le dé 6 + les points du joueur 1 sont supérieur à 30 (supérieur à la limite du score), la boucle va se casser 
                    if(points_joueur_2 + X >= 30) {
                        System.out.println("Le joueur 2 a tiré le dé 6. Cependant, l'ajout de ce point fait qu'il dépasse le maximum de points.");
                        points_joueur_2 = 30; //Le joueur 2 sera attribué 30 points car on sait qu'il aura gagné et qu'il a dépassé les 30 points
                        break; // La boucle se casse et l'algorithme pourra sortir de celle-ci
                    }
                    else {
                        points_joueur_2 += X; // Attribution des points au joueur 2
                        System.out.println("Le joueur 2 a tiré le dé 6, il gagne 6 points et donc peut rejouer. Son score est de " + points_joueur_2 + " points");
                        tour_du_joueur = 2; // c'est toujours au joueur 2 car il avait tiré le dé 6, donc il est attribué avec le chiffre 2
                    }
                }
            }
			
			//Sinon, si l'un des deux joueurs n'a pas tiré le dé 6
            else {
				
				
                if(tour_du_joueur == 1) {
					//Si le dé tiré + les points du joueur 1 sont supérieur à 30 (supérieur à la limite du score), la boucle va se casser 
                    if((points_joueur_1) + X >= 30) {
                        System.out.println("Le joueur 1 a tiré le dé " + X + ". Cependant, l'ajout de ce point fait qu'il dépasse le maximum de points.");
                        points_joueur_1 = 30; //Le joueur 1 sera attribué 30 points car on sait qu'il aura gagné et qu'il a dépassé les 30 points
                        break; // La boucle se casse et l'algorithme pourra sortir de celle-ci
                    }
                    else {
                        points_joueur_1 += X; // Attribution des points au joueur 1
                        System.out.println("Le joueur 1 a tiré le dé " + X + ". Son score est de " + points_joueur_1 + " points");
                        System.out.println("C'est au tour du joueur 2"); //Le tour sera attribué au joueur 2
                        tour_du_joueur = 2; //Le tour sera attribué au joueur 2, donc la variable est attribuée au chiffre 2
                    }

                }

                else {
					//Si le dé tiré + les points du joueur 2 sont supérieur à 30 (supérieur à la limite du score), la boucle va se casser 
                    if(points_joueur_2 + X >= 30) {
                        System.out.println("Le joueur 2 a tiré le dé " + X + ". Cependant, l'ajout de ce point fait qu'il dépasse le maximum de points.");
                        points_joueur_2 = 30; //Le joueur 2 sera attribué 30 points car on sait qu'il aura gagné et qu'il a dépassé les 30 points
                        break; // La boucle se casse et l'algorithme pourra sortir de celle-ci
                    }

                    else {
                        points_joueur_2 += X; // Attribution des points au joueur 2
                        System.out.println("Le joueur 2 a tiré le dé " + X + ". Son score est de " + points_joueur_2 + " points");
                        System.out.println("C'est au tour du joueur 1"); //Le tour sera attribué au joueur 1
                        tour_du_joueur = 1; //Le tour sera attribué au joueur 1, donc la variable est attribuée au chiffre 1
                    }
                }
            }
        }

		//Si les points du joueur 1 sont supérieur a ceux du joueur 2, le joueur 1 a gagné
        if(points_joueur_1 > points_joueur_2) {
            System.out.println("Le joueur 1 a gagné");
        }
		//Sinon, le joueur 2 a gagné
        else {
            System.out.println("Le joueur 2 a gagné");
        }
		//Le programme va ainsi afficher les scores finaux
        System.out.println("Scores : \nJoueur 1 : " + points_joueur_1 + "\nJoueur 2 : " + points_joueur_2);
    }
}
