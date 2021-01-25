
package proyecto_java;


public class Main4 {

    
    public static void main(String[] args) {
        int[] numero = {2, 6, 10};
        double media = 0.0;
        for (int i=0; i < numero.length; i++) {
        media = media + numero[i];
        media = media / numero.length;
        }
        System.out.println("La media es=  " + numero);
    }
    
}
