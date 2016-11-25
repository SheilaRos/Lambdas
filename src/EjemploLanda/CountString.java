package EjemploLanda;


public class CountString implements ICountString{

    @Override
    public String contar(String palabra) {
        return "La longitud de la palabra es de : "+palabra.length();
    }
}
