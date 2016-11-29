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
            System.out.print("Testing check saltar : ");
            return animal.isPotSaltar();
        };
        Predicate<Animal> checkNadar = (animal) -> {
            System.out.print("Testing check nadar : ");
            return animal.isPotNadar();
        };
        Predicate<Animal> checkCaminar = (animal) -> {
            System.out.print("Testing check caminar : ");
            return animal.isPotCaminar();
        };
        Predicate<Animal> checkVolar = (animal) -> {
            System.out.print("Testing check volar : ");
            return animal.isPotVolar();
        };

        myChecks.add(checkSalto);
        myChecks.add(checkCaminar);
        myChecks.add(checkVolar);
        myChecks.add(checkNadar);

        showCheckAtr(animales, myChecks);

    }

    public static void showCheckAtr(List<Animal> animales, List<Predicate<Animal>> myChecks){
        System.out.println("Hecho con Predicate : ");
        animales.forEach(animal -> {
            System.out.println("");
            System.out.println("Testing animal "+animal.getEspecie());
            myChecks.forEach(checkAtribut -> System.out.println(checkAtribut.test(animal)));
        });
    }
}
