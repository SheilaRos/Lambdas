package PracticaLandas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dam on 30/11/16.
 */
public class PersonajeLOL extends ObjetoLOL{
    private List<ObjetoLOL> misObjetos = new ArrayList<>();

    public PersonajeLOL(String nombre, int vida, int dAtaque, int vAtaque, int vMovimiento, int regVida, int armadura, int resMagica, int mana) {
        super(nombre, vida, dAtaque, vAtaque, vMovimiento, regVida, armadura, resMagica, mana);
    }

    public List<ObjetoLOL> getMisObjetos() {return misObjetos;}
    public void setMisObjetos(List<ObjetoLOL> misObjetos) {this.misObjetos = misObjetos;}

    @Override
    public String toString() {
        return "PersonajeLOL{" +
                "name=" + this.getNombre() +
                ", vida=" + this.getVida() +
                ", dAtaque=" + this.getdAtaque() +
                ", vAtaque=" + this.getvAtaque() +
                ", vMovimiento=" + this.getvMovimiento() +
                ", regVida=" + this.getRegVida() +
                ", armadura=" + this.getArmadura() +
                ", resMagica=" + this.getResMagica() +
                ", mana=" + this.getMana() +
                ", misObjetos=" + misObjetos +
                '}';
    }
}
