package PracticaLandas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dam on 30/11/16.
 */
public class LOLAPP {
    public static void main(String[] args){
        List<ObjetoLOL> lista = new ArrayList<>();
        lista.add(new ObjetoLOL("Cuchilla negra",300, 50, 0, 0, 0, 0, 0, 0));
        lista.add(new ObjetoLOL("Sanguinaria", 0, 70, 20, 0, 10, 0, 0, 0));
        lista.add(new ObjetoLOL("Warmog", 800, 0, 0, 0, 200, 0, 0, 0));
        lista.add(new ObjetoLOL("Huracan de runnan", 0, 0, 30, 8, 0, 0, 0, 0));

        List<CheckEstadistica> myCheks = new ArrayList<>();

        CheckEstadistica vida  = (objeto) -> {
            if(objeto.modificaVida()) {
                System.out.print("Modifican la vida : ");
            }
            return objeto.modificaVida();
        };

        CheckEstadistica ataque  = (objeto) -> {
            if(objeto.modificaAtaque()) {
                System.out.print("Modifican el ataque : ");
            }
            return objeto.modificaAtaque();
        };
        CheckEstadistica vAtaque  = (objeto) -> {
            if(objeto.modificaVAtaque()) {
                System.out.print("Modifican la velocidad de ataque : ");
            }
            return objeto.modificaVAtaque();
        };
        CheckEstadistica vMovimiento  = (objeto) -> {
            if(objeto.modificaVMovimiento()) {
                System.out.print("Modifican la velocidad de movimiento : ");
            }
            return objeto.modificaVMovimiento();
        };
        CheckEstadistica regVida  = (objeto) -> {
            if(objeto.modificaRegVida()) {
                System.out.print("Modifican la regeneración de vida : ");
            }
            return objeto.modificaRegVida();
        };
        CheckEstadistica armadura  = (objeto) -> {
            if(objeto.modificaArmadura()) {
                System.out.print("Modifican la armadura : ");
            }
            return objeto.modificaArmadura();
        };
        CheckEstadistica resMagica  = (objeto) -> {
            if(objeto.modificaRMagica()) {
                System.out.print("Modifican la resistencia mágica : ");
            }
            return objeto.modificaRMagica();
        };
        CheckEstadistica mana  = (objeto) -> {
            if(objeto.modificaMana()) {
                System.out.print("Modifican la mana : ");
            }
            return objeto.modificaMana();
        };

        myCheks.add(vida);
        myCheks.add(ataque);
        myCheks.add(vAtaque);
        myCheks.add(vMovimiento);
        myCheks.add(regVida);
        myCheks.add(armadura);
        myCheks.add(resMagica);
        myCheks.add(mana);


        showCheckAtr(lista, myCheks);


    }
    public static void showCheckAtr(List<ObjetoLOL> objeto, List<CheckEstadistica> myChecks){
        for(CheckEstadistica a: myChecks){
            for(ObjetoLOL o : objeto){
                if(a.checkEstadistica(o)){
                    System.out.println(o);
                }
            }
        }
    }
}
