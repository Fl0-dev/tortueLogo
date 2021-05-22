/**
 * Classe main qui permet après la création
 * de déplacer une tortue selon des méthodes dans la classe Tortue
 * @author Florian
 * @date 22/05/2021
 * @version 1.0
 */
public class Logo {
    //création de l'instance
    static Tortue tortue = new InstrumentedTortue();

    public static void main(String[] args) {

        //utilisation des méthodes de déplacement
        tortue.tournerDroite(90);
        tortue.avancer(200);
        tortue.tournerGauche(90);
        tortue.avancer(400);
        tortue.tournerGauche(90);
        tortue.avancer(100);

        tortue.tournerGauche(90);
        tortue.avancer(300);
        tortue.tournerDroite(90);
        tortue.avancer(200);
        tortue.tournerDroite(90);
        tortue.avancer(300);

        tortue.tournerGauche(90);
        tortue.avancer(100);
        tortue.tournerGauche(90);
        tortue.avancer(400);
        tortue.tournerGauche(90);
        tortue.avancer(200);

        System.out.println(tortue.x);
        System.out.println(tortue.y);
        System.out.println(tortue.angleActuel);

    }
}
