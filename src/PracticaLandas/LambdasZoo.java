package PracticaLandas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dam on 26/10/16.
 */
public class LambdasZoo {
    public static  void  main (String [] args){
        List<Animal> animales = new ArrayList<Animal>();
        animales.add(new Animal("Canguro",true,false,false,true));
        animales.add(new Animal("Aguila",false,true,false,true));
        animales.add(new Animal("pez",true,true,true,false));
        List<CheckAtribut> myChecks = new ArrayList<>();

        CheckAtribut checkSalto = (animal) -> {
            return animal.isPotSaltar();
        };
        CheckAtribut checkNadar = (animal) -> {
            return animal.isPotNadar();
        };
        CheckAtribut checkCaminar = (animal) -> {
            return animal.isPotCaminar();
        };
        CheckAtribut checkVolar = (animal) -> {
            return animal.isPotVolar();
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

}
