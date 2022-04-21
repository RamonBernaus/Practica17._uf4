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
    private int llotges;
    private int pisos;
    private int pati_butaques;
    private int files;
    private int columnes;
    
    public Recintes(){
    
    }
    
    public void setLlotges(int llotges){
        this.llotges = llotges;
    }
    public int getLlotges(){
        return llotges; 
    }
    public void setPisos(int pisos){
        this.pisos = pisos;
    }
        public int getPisos(){
        return pisos; 
    }
    public void setPatiButaques(int patibutaques){
        this.pati_butaques = patibutaques;
    }
        public int getPatiButaques(){
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
        
    
}
