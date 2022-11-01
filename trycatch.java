import java.util.Scanner;

public class trycatch {
    public static void main(String[] args){
        try{
            System.out.println("Digite um número: ");
            Scanner opc = new Scanner(System.in);
            int num1 = opc.nextInt();
            System.out.println(num1);
            
        } catch(Exception e){
            System.out.println("Ocorreu um erro: "+e.getMessage());
        }
        System.out.println("Fim");

    }

    
}