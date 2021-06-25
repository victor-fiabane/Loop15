
package loop15;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Loop15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, media, num;
        cont = 0; num = 0;
        Scanner teclado = new Scanner(System.in);
        while(cont <= 15){
            System.out.println("Escolha um número:");
            num = teclado.nextInt();
            cont++;
        }
        media = (num + cont) / 15;
        System.out.println("Media:"+media);
    }
    
}
