/*Els diferents tipus d’espectacles són:
- Pel·lícula: només fa servir el pati de butaques
- ObraTeatral: habilita les llotges i pati de butaques
- Òpera: habilita les llotges i pati de butaques
- Prova Esportiva: només habilita les llotges*/
package practica17_uf4;

import java.util.Arrays;

/**
 *
 * @author ausias
 */
public class Espectacle {

    public Espectacle() {

    }
    Recintes r = new Recintes();
    public String TipusEspectacle(String TipEs) {
        int[][] matriu = new int[4][6];
        switch (TipEs) {
            case "Pelicula":
                r.setPatiButaques(matriu);
                System.out.println(Arrays.deepToString(matriu));
                break;

            case "Obra Teatral":
                r.setPatiButaques(matriu);
                System.out.println(Arrays.deepToString(matriu));
                break;
                
            case "Opera":

                break;
                
            case "Prova Esportiva":

                break;
                
            default:
                break;
        }

        return TipEs;
    }

}
