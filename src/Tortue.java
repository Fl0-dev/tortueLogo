/**
 * Classe pour création d'une tortue et ses méthodes de déplacement
 * avec comme attribut:
 * x étant l'axe des abscisses
 * y étant l'axe des ordonnées
 * angleActuel étant l'angle vers lequel se déplace la tortue
 */
public class Tortue {
    int x = 0;
    int y = 0;
    int angleActuel;

    /**
     * Constructeur
     */
    public Tortue() {
    }

    /**
     * Méthode pour avancer
     * @param combien int qui donne le nombre de pas
     */
    public void avancer(int combien){
        switch (angleActuel) {
            case 0 -> y = y + combien;
            case 270 -> x = x - combien;
            case 180 -> y = y - combien;
            case 90 -> x = x + combien;
        }

    }

    /**
     * méthode qui permet de tourner vers la droite
     * @param angle ici toujours 90
     */
    public void tournerDroite(int angle){
        switch (angleActuel) {
            case 0 -> angleActuel = 90;
            case 270 -> angleActuel = 0;
            case 180 -> angleActuel = 270;
            case 90 -> angleActuel = 180;
        }

        }

    /**
     * méthode qui permet de tourner vers la gauche
     * @param angle ici toujours 90
     */
    public void tournerGauche(int angle){
        switch (angleActuel) {
            case 0 -> angleActuel = 270;
            case 270 -> angleActuel = 180;
            case 180 -> angleActuel = 90;
            case 90 -> angleActuel = 0;
        }
    }
}
