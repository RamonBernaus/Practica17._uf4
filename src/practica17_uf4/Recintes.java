/* Els recintes tenen una sèrie de localitats que, segons el tipus d’espectacle, poden
habilitar les llotges que poden estar a diferents pisos, i d’altres habiliten el pati de
butaques que està format per diverses files i columnes. */

package practica17_uf4;

import java.util.Scanner;

/**
 *
 * @author ausias
 */

public class Recintes {
    
    Scanner s = new Scanner(System.in);
    private int[][] llotges;
    private int pisos;
    private int palcos;
    private int[][] pati_butaques;
    private int files;
    private int columnes;
    
    public Recintes(){
    
    }
    
    public void setLlotges(int[][] llotges){
        this.llotges = llotges;
    }
    public int[][] getLlotges(){
        return llotges; 
    }
    public void setPisos(int pisos){
        this.pisos = pisos;
    }
        public int getPisos(){
        return pisos; 
    }
    public void setPatiButaques(int[][] patibutaques){
        this.pati_butaques = patibutaques;
    }
        public int[][] getPatiButaques(){
        return pati_butaques; 
    }
    public void setFiles(int files){
        this.files = files;
    }
        public int getFiles(){
        return files; 
    }
    public void setColumnes(int columnes){
        this.columnes = columnes;
    }
        public int getColumnes(){
        return columnes; 
    }
        
        public String OmplirMatriu(String Tipus) {
        String str = "";
        int files = (int) (Math.random() * 8 + 1);
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
        if (Tipus.equals("butaca")) {
            Reserva(files, columnes);
            RecorrerMatriu(matriu);
        } else if (Tipus.equals("llotges")) {
            ReservaPalco(files, columnes);
            RecorrerMatriu(matriu);
        } else{
            System.out.println("Error");}

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

    public int ReservaPalco(int pis, int num_palco) {
        int pis_res, palco_res;
        System.out.println("Els seient amb una X estan ja ocupats, els seients amb un [ ] estan lliures. ");
        System.out.print("En quin " + pis + " pis vols seure? ");
        pis_res = s.nextInt();
        System.out.print("En quin  dels " + num_palco + " palcos vols seure? ");
        palco_res = s.nextInt();

        return 0;
    }

    public int RecorrerMatriu(int matriu[][]) {
        int a=2;
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                a = matriu[i][j];
            }
        } if(a == 0){
            System.out.println("El seient esta ocupat");
        } else if(a == 1){
            System.out.println("El seient ha sigut reservat correctament ");
        } else{
        System.out.println("Error");
}
        return a;
    }
}
