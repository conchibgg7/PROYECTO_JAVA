
package proyecto_java;


public class Main7 {

    
    public static void main(String[] args) {
        String letra = "";
        String letras = ("");
        int cont = 0;

        while (letra != "stop") {
            System.out.println("Introduce un valor");
            letra = Entrada.readStr();
            if (letra == "stop") {
                System.out.println("Finalizando el proceso");
            } else {
                int lon = letras.length();
                for (int i=0; i < lon; i++) {
                    letras[cont] = letra;
                    cont++;
                    System.out.println("el array: " + letras[i]);
                }
            }
        }
    }

}

//no se como continuar el ejercico y el porqué me da error
