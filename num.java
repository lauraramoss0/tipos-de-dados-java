import java.util.Scanner;

public class num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1; 

        System.out.println("Informe um valor: ");
        n1 = input.nextInt();



        if (n1== 0) {

            System.out.printf("O número é nulo  ");
        } 

        else if (n1 > 0) {
                System.out.printf("O número é positivo  ");
        }
        else if (n1 < 0) {
                System.out.printf("O número é negativo  ");
        }

    }
}


