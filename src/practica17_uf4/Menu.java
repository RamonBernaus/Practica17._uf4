//Menu executbale
package practica17_uf4;

/**
 *
 * @author Ramon
 */
public class Menu {
    
    public static void main(String[] args) {
        Recintes r = new Recintes();
        Espectacle e = new Espectacle();
        String str = "Pelicula";
        System.out.println(e.TipusEspectacle(str));
    }
    
}
