package EjemploLanda;

public class EjemploLandas {
    /**Volem crear una clase que al cridar-la ens retorni el número
     * de carácers que té un String.
     * Important, será una clase que només tindrá una funcionalitat.
     * Per fer-ho definirem una @FunctionalInterface per indicar  que ha de tenir una funcio
     * que faci el que volem.
     */
    public static void main(String[] args) {
            //Utilitzant una clase externa
            //Creo una clase externa amb una funció que al cridarla em retorni el número de carácters que té la String

            ICountString count1= new CountString(); //Objeto de está clase, es crear un objeto contra interfaz, el codigo se puede reutilizar

            //OPCIO2: Creem una clase anonima
            //Creo una clase dins el mateix codi, sense donarli un nom i definint dins la funció
            ICountString count2 = new ICountString(){
                @Override
                public String contar(String palabra) {
                    return "La longitud es de : " + palabra.length();
                }
            };
            //OPCIO3: Creem una expresió Lamda
            //amb la sintaxis: Interficie variable = (Parametres de la funció) -> { desplegament de la funció }
        ICountString count3 = (palabra)->{
            return "La longitud es de : " + palabra.length();
        };
        /// UTILITZACIO ///
            //Utilitzant la clase externa
            System.out.println(count1.contar("STUCOM som tots"));

            //Utilizant la clase Anonima
            System.out.println(count2.contar("STUCOM som tots"));

            //Utilitzant la clase Lambda
            System.out.println(count3.contar("STUCOM som tots"));
        }
    }

//interface IContadorCaracteres {
//   int contar(String str);
//}

