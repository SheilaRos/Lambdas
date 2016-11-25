package PracticaLandas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dam on 26/10/16.
 */
public class LambdasZoo implements CheckAtribut {
    public static  void  main (String [] args){
        List<Animal> animales = new ArrayList<Animal>();
        animales.add(new Animal("Canguro",true,false,false,true));
        animales.add(new Animal("Aguila",false,true,false,true));
        animales.add(new Animal("pez",true,true,true,false));
        List<CheckAtribut> myChecks = new ArrayList<>();

        CheckAtribut checkSalto = (Animal) -> {
            return Animal.isPotSaltar();
        };
        CheckAtribut checkNadar = (Animal) -> {
            return Animal.isPotNadar();
        };
        CheckAtribut checkCaminar = (Animal) -> {
            return Animal.isPotCaminar();
        };
        CheckAtribut checkVolar = (Animal) -> {
            return Animal.isPotVolar();
        };

        myChecks.add(checkSalto);
        myChecks.add(checkCaminar);
        myChecks.add(checkVolar);
        myChecks.add(checkNadar);

        showCheckAtr(animales, myChecks);

    }

    public static void showCheckAtr(List<Animal> animales, List<CheckAtribut> myChecks){
        animales.forEach(animal -> {
            myChecks.forEach(checkAtribut -> checkAtribut.test(animal));
        });
    }

    @Override
    public boolean test(Animal a) {
        return false;
    }
}
