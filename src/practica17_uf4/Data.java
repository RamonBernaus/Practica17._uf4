/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica17_uf4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ramon
 */
public class Data {

    public Data() {
    }
    private String Espectacle1 = "15-03-2022";
    private String Espectacle2 = "23-05-2022";
    private String Espectacle3 = "04-06-2022";
    private String Espectacle4 = "27-07-2022";

    public void setEs1(String Es1) {
        this.Espectacle1 = Es1;
    }

    public String getEs1() {
        return Espectacle1;
    }

    public void setEs2(String Es2) {
        this.Espectacle2 = Es2;
    }

    public String getEs2() {
        return Espectacle2;
    }

    public void setEs3(String Es3) {
        this.Espectacle3 = Es3;
    }

    public String getEs3() {
        return Espectacle3;
    }

    public void setEs4(String Es4) {
        this.Espectacle4 = Es4;
    }

    public String getEs4() {
        return Espectacle4;
    }

    public Date Data() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Hi han 4 espectacles previstos en aquestos mesos" + "\n"
                + "1. EL dia " + Espectacle1 + " que es fa al Liceu, i es una Opera" + "\n"
                + "2. EL dia " + Espectacle2 + " que es fa al Teatre, i es una Obra Teatral" + "\n"
                + "3. EL dia " + Espectacle3 + " que es fa al Liceu, i es una Pelicula" + "\n"
                + "4. EL dia " + Espectacle4 + " que es fa al Palau d'esports, i es una Prova esportiva" + "\n");
        Date fecha = sdf.parse(Espectacle1);
        return fecha;
    }
}
