import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){
        
        
        System.out.println("--Sistema de medição de temperatura--");
        
        Scanner sc = new Scanner(System.in);

        int temperatura = 0;
        int total = 0;
        int rodadas = 13;
        int max = 10;
        int min = 4;
        

        for (int r = 1; r < rodadas; r++){
            System.out.print("Insira o valor de temperatura "+ r + " (Entre 4 e 10): ");
            int valor = sc.nextInt();
            if (valor >= min && valor <= max) {
                total = total + valor;
            } else { 
                System.out.println("Valor incorreto, por favor insira um valor entre 4 e 10!\n");
                r -- ;
             }
               
        }

        double media = total/12; 

        System.out.print("A média de hoje das temperaturas é: " + media + "");
    }
}
