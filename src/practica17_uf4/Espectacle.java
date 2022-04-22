/*Els diferents tipus d’espectacles són:
- Pel·lícula: només fa servir el pati de butaques
- ObraTeatral: habilita les llotges i pati de butaques
- Òpera: habilita les llotges i pati de butaques
- Prova Esportiva: només habilita les llotges*/
package practica17_uf4;

import java.util.Scanner;

/**
 *
 * @author ausias
 */
public class Espectacle {

    public Espectacle() {

    }
    Recintes r = new Recintes();
    Scanner s = new Scanner(System.in);

    public String TipusEspectacle(String TipEs) {
        String res = "";
        String str;
        switch (TipEs) {
            case "Pelicula":
                str = "butaca";
                System.out.println(r.OmplirMatriu(str));
                break;

            case "Obra Teatral":
                System.out.println("Vols anar a les llotges o a les butaques?");
                str = s.nextLine();
                if (str.equals("butaques") || str.equals("butaca")) {
                    System.out.println(r.OmplirMatriu(str));
                } else if (str.equals("llotges")) {
                    System.out.println(r.OmplirMatriu(str));
                }
                break;

            case "Opera":
                System.out.println("Vols anar a les llotges o a les butaques?");
                str = s.nextLine();
                if (str.equals("butaques") || str.equals("butaca")) {
                    System.out.println(r.OmplirMatriu(str));
                } else if (str.equals("llotges")) {
                    System.out.println(r.OmplirMatriu(str));
                }

                break;

            case "Prova Esportiva":
                str = "llotges";
                System.out.println(r.OmplirMatriu(str));
                break;

            default:
                break;
        }

        return res;
    }
public String ToString(){
        String Espectacle;
        String Recinte;
String str = "";
        System.out.println("En quin Recinte vols anar? " + "\n"
                + "Al Liceu, al Teatre o al Palau d'esports?");
        Recinte = s.nextLine();
        switch (Recinte) {
            case "Liceu":
                System.out.println("Quin espectacle vols anar a veure? " + "\n"
                        + "A veure una Pelicula, a l'Obra Teatral o a l'Opera?");
                Espectacle = s.nextLine();
                System.out.println(TipusEspectacle(Espectacle));
                break;
            case "Teatre":
                System.out.println("Quin espectacle vols anar a veure? " + "\n"
                        + "A veure una Pelicula o a l'Obra Teatral?");
                Espectacle = s.nextLine();
                System.out.println(TipusEspectacle(Espectacle));
                break;
            case "Palau d'esports":
                System.out.println("Quin espectacle vols anar a veure? " + "\n"
                        + "A veure una Pelicula, a l'Obra Teatral, a l'Opera o a una Prova esportiva?");
                Espectacle = s.nextLine();
                System.out.println(TipusEspectacle(Espectacle));
                break;
            default:
                break;
        }
        return str;
    }
}
