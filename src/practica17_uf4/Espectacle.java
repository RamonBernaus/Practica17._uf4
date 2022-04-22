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
        int pisos = (int) (Math.random() * 4 + 1);
        int[][] matriu = new int[1][1];
        String str;
        switch (TipEs) {
            case "Pelicula":
                System.out.println(Omplirfiles());
                r.setPatiButaques(matriu);
                break;

            case "Obra Teatral":
                System.out.println("Vols anar a les llotges o a les butaques?");
                str = s.nextLine();
                if (str.equals("butaques") || str.equals("butaca")) {
                    System.out.println(Omplirfiles());
                } else if (str.equals("butaques")) {
                    r.setLlotges(pisos);
                    System.out.println(pisos);
                }
                break;

            case "Opera":
                System.out.println("Vols anar a les llotges o a les butaques?");
                str = s.nextLine();
                if (str.equals("butaques") || str.equals("butaca")) {
                    System.out.println(Omplirfiles());
                } else if (str.equals("butaques")) {
                    r.setLlotges(pisos);
                    System.out.println(pisos);
                }

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

    public String Omplirfiles() {
        String str = "";
        int files = (int) (Math.random() * 8 + 2);
        int columnes = (int) (Math.random() * 8 + 1);
        int[][] matriu = new int[files][columnes];
        for (int x = 0; x < matriu.length; x++) {
            System.out.print(x + 1 + " |");
            for (int y = 0; y < matriu[x].length; y++) {
                matriu[x][y] = (int) (Math.random() * 2);
                switch (matriu[x][y]) {
                    case 0:
                        System.out.print("  X  ");
                        break;
                    case 1:
                        System.out.print(" [ ] ");
                        break;
                    default:
                        break;
                }
                if (y != matriu[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        System.out.println("");
        Reserva(files, columnes);

        return str;
    }

    public int Reserva(int fila, int columna) {
        int fila_res, colum_res;
        System.out.println("Els seient amb una X estan ja ocupats, els seients amb un [ ] estan lliures. ");
        System.out.print("En quina de les " + fila + " files vols seure? ");
        fila_res = s.nextInt();
        System.out.print("En quin dels  " + columna + " seients vols seure? ");
        colum_res = s.nextInt();

        return 0;
    }

    public int RecorrerMatriu(int matriu[][]) {
        for (int i = 0; i < matriu.length; i++) {

            System.out.print(i + 1 + " |");

            for (int j = 0; j < matriu[i].length; j++) {

                System.out.print(matriu[i][j]);

                if (j != matriu[i].length - 1) {

                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        return 0;
    }
}
