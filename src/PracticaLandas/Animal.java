package PracticaLandas;

/**
 * Created by dam on 26/10/16.
 */
public class Animal {
    private String especie;
    private boolean potSaltar;
    private boolean potVolar;
    private boolean potNadar;
    private boolean potCaminar;

    public Animal(String especie, boolean potSaltar, boolean potVolar, boolean potNadar, boolean potCaminar) {
        this.especie=especie;
        this.potSaltar = potSaltar;
        this.potVolar = potVolar;
        this.potNadar = potNadar;
        this.potCaminar = potCaminar;
    }

    public boolean isPotSaltar() {
        return potSaltar;
    }

    public boolean isPotVolar() {
        return potVolar;
    }

    public boolean isPotNadar() {
        return potNadar;
    }

    public boolean isPotCaminar() {
        return potCaminar;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                '}';
    }
}
