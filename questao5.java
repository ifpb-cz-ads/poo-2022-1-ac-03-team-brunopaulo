import java.util.Scanner;

public class questao5 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número referente ao dia da semana:");
        int dia = ler.nextInt();
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-Feira");
            case 3 -> System.out.println("Terça_Feira");
            case 4 -> System.out.println("Quarta_Feira");
            case 5 -> System.out.println("Quinta_Feira");
            case 6 -> System.out.println("Sexta-Feira");
            case 7 -> System.out.println("Sábado");
        }
    }
}
