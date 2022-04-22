//Menu executbale
package practica17_uf4;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Menu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Recintes r = new Recintes();
        Espectacle e = new Espectacle();
        int[][] matriu = new int[1][1];
        String Espectacle;
        String Recinte;
        System.out.println("En quin Recinte vols anar? " + "\n"
                + "Al Liceu, al Teatre o al Palau d'esports?");
        Recinte = s.nextLine();
        switch (Recinte) {
            case "Liceu":
                System.out.println("Quin espectacle vols anar a veure? " + "\n"
                        + "A veure una Pelicula, a l'Obra Teatral o a l'Opera?");
                Espectacle = s.nextLine();
                System.out.println(e.TipusEspectacle(Espectacle));
                break;
            case "Teatre":
                System.out.println("Quin espectacle vols anar a veure? " + "\n"
                        + "A veure una Pelicula o a l'Obra Teatral?");
                Espectacle = s.nextLine();
                System.out.println(e.TipusEspectacle(Espectacle));
                break;
            case "Palau d'esports":
                System.out.println("Quin espectacle vols anar a veure? " + "\n"
                        + "A veure una Pelicula, a l'Obra Teatral, a l'Opera o a una Prova esportiva?");
                Espectacle = s.nextLine();
                System.out.println(e.TipusEspectacle(Espectacle));
                break;
            default:
                break;
        }
        
    }

}
