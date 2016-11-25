package PracticaLandas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Created by dam on 26/10/16.
 */
public class EjemploLambdas {
    public static void main(String[] args) {
        ITallaString ejemplo1 = (palabra) -> {
            return palabra.substring(0, 3);
        };
        IsumaNumero ejemplo2 = (num1, num2) -> {
            return num1 + num2;
        };
        IreadNumero ejemplo3 = () -> {
            do {
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Introduce un número");
                    int num = Integer.parseInt(br.readLine());
                    return num;
                } catch (Exception e) {
                }
            }while (true);
        };

        System.out.println(ejemplo1.tallaString("Stucom"));
        System.out.println(ejemplo2.sumaNumbers(5, 8));
        System.out.println(ejemplo3.num1());
    }
}
