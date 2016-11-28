package PracticaLandas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by dam on 28/11/16.
 */
public class LambdasZooPredicate {
    public static  void  main (String [] args){
        List<Animal> animales = new ArrayList<Animal>();
        animales.add(new Animal("Canguro",true,false,false,true));
        animales.add(new Animal("Aguila",false,true,false,true));
        animales.add(new Animal("pez",true,true,true,false));
        List<Predicate<Animal>> myChecks = new ArrayList<>();

        Predicate<Animal> checkSalto = (animal) -> {
            return animal.isPotSaltar();
        };
        Predicate<Animal> checkNadar = (animal) -> {
            return animal.isPotNadar();
        };
        Predicate<Animal> checkCaminar = (animal) -> {
            return animal.isPotCaminar();
        };
        Predicate<Animal> checkVolar = (animal) -> {
            return animal.isPotVolar();
        };

        myChecks.add(checkSalto);
        myChecks.add(checkCaminar);
        myChecks.add(checkVolar);
        myChecks.add(checkNadar);

        showCheckAtr(animales, myChecks);

    }

    public static void showCheckAtr(List<Animal> animales, List<Predicate<Animal>> myChecks){
        animales.forEach(animal -> {
            myChecks.forEach(checkAtribut -> checkAtribut.test(animal));
        });
    }
}
