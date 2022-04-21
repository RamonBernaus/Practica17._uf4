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
        int pisos = (int)(Math.random()*4+1);
        int files = 4;
        int columnes = 6;
        int[][] matriu = new int[files][columnes];
        switch (TipEs) {
            case "Pelicula":
                r.setPatiButaques(matriu);
                System.out.println(Arrays.deepToString(matriu));
                break;

            case "Obra Teatral":
                r.setPatiButaques(matriu);
                System.out.println(Arrays.deepToString(matriu));
                r.setLlotges(5);
                break;
                
            case "Opera":
                r.setPatiButaques(matriu);
                System.out.println(Arrays.deepToString(matriu));
                r.setLlotges(pisos);
                System.out.println(pisos);
                break;
                
            case "Prova Esportiva":
                r.setLlotges(pisos);
                System.out.println(pisos);
                break;
                
            default:
                break;
        }

        return TipEs;
    }

}
