/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica17_uf4;

/**
 *
 * @author ausias
 */
public class Probes {
    public static void main(String[] args) {
        Espectacle e = new Espectacle();
        int [][]matriu = new int[2][2];
        if(e.RecorrerMatriu(matriu) == 0){
            System.out.println("El seient esta ocupat");
        } else if(e.RecorrerMatriu(matriu) == 1){
            System.out.println("El seient ha sigut reservat correctament ");
        }
    }
}
