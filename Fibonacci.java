import java.util.Scanner;

public class Fibonacci {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        boolean pertenceFibonacci = verifica(num);
        System.out.println(num + (pertenceFibonacci ? " pertence" : " não pertence" ) + " à sequência de Fibonacci.");

        scan.close();

    }

    static boolean verifica( int num ){

        //Fórmula de Binet
        //“Um número é Fibonacci se e apenas se uma ou ambas as expressões 5*n2 + 4 ou 5*n2 – 4 retornarem um quadrado perfeito.”

        Double resultado = Math.sqrt(5*(num*num)+4);

        if (resultado.intValue() == resultado.doubleValue()) {
            
            return true;

        }

        resultado = Math.sqrt(5*(num*num)-4);

        return (resultado.intValue() == resultado.doubleValue());

    }


}
