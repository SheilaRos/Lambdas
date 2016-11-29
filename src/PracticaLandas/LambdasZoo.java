package PracticaLandas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dam on 26/10/16.
 */
public class LambdasZoo {
    public static  void  main (String [] args){
        List<Animal> animales = new ArrayList<>();
        animales.add(new Animal("Canguro",true,false,false,true));
        animales.add(new Animal("Aguila",false,true,false,true));
        animales.add(new Animal("pez",true,true,true,false));
        List<CheckAtribut> myChecks = new ArrayList<>();

        CheckAtribut checkSalto = (animal) -> {
            System.out.print("Testing check salto : ");
            return animal.isPotSaltar();
        };
        CheckAtribut checkNadar = (animal) -> {
            System.out.print("Testing check nadar : ");
            return animal.isPotNadar();
        };
        CheckAtribut checkCaminar = (animal) -> {
            System.out.print("Testing check caminar : ");
            return animal.isPotCaminar();
        };
        CheckAtribut checkVolar = (animal) -> {
            System.out.print("Testing check volar : ");
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
            System.out.println("");
            System.out.println("Testing animal "+animal.getEspecie());
            myChecks.forEach(checkAtribut -> System.out.println(checkAtribut.test(animal)));
        });
    }
}
