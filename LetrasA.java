import java.util.Scanner;

public class LetrasA {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String str = scan.nextLine();

        if(str.toLowerCase().indexOf("a")>=0){

            int cont = str.length() - str.toLowerCase().replace("a", "").length();
            
            System.out.println("A frase contém a letra A e ela aparece "+cont+" vezes");

        }else{
            System.out.println("A frase não contém a letra A");
        }

        scan.close();


    }

}
