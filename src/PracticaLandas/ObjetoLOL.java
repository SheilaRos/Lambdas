package PracticaLandas;
public class ObjetoLOL {
    private int vida = 0;
    private int dAtaque = 0;
    private int vAtaque = 0;
    private int vMovimiento = 0;
    private int regVida = 0;
    private int armadura = 0;
    private int resMagica = 0;
    private int mana = 0;
    public ObjetoLOL() {}
    public ObjetoLOL(int vida, int dAtaque, int vAtaque, int vMovimiento, int regVida, int armadura, int resMagica, int mana) {
        this.vida = vida;
        this.dAtaque = dAtaque;
        this.vAtaque = vAtaque;
        this.vMovimiento = vMovimiento;
        this.regVida = regVida;
        this.armadura = armadura;
        this.resMagica = resMagica;
        this.mana = mana;
    }
    public int getVida() {return vida;}
    public void setVida(int vida) {this.vida = vida;}
    public int getdAtaque() {return dAtaque;}
    public void setdAtaque(int dAtaque) {this.dAtaque = dAtaque;}
    public int getvAtaque() {return vAtaque;}
    public void setvAtaque(int vAtaque) {this.vAtaque = vAtaque;}
    public int getvMovimiento() {return vMovimiento;}
    public void setvMovimiento(int vMovimiento) {this.vMovimiento = vMovimiento;}
    public int getRegVida() {return regVida;}
    public void setRegVida(int regVida) {this.regVida = regVida;}
    public int getArmadura() {return armadura;}
    public void setArmadura(int armadura) {this.armadura = armadura;}
    public int getResMagica() {return resMagica;}
    public void setResMagica(int resMagica) {this.resMagica = resMagica;}
    public int getMana() {return mana;}
    public void setMana(int mana) {this.mana = mana;}
    @Override
    public String toString() {
        return "ObjetoLOL{" +
                "vida=" + vida +
                ", dAtaque=" + dAtaque +
                ", vAtaque=" + vAtaque +
                ", vMovimiento=" + vMovimiento +
                ", regVida=" + regVida +
                ", armadura=" + armadura +
                ", resMagica=" + resMagica +
                ", mana=" + mana +
                '}';
    }
}
