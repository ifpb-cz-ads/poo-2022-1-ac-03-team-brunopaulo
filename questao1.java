import java.util.Scanner;

public class questao1 {
    public static void main(String... args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = ler.nextInt();
        if(idade<16){
            System.out.println("Voce nao pode votar");
        } else if(idade == 16 || idade == 17 || idade >65){
            System.out.println("Seu voto eh facultativo");
        } else if(idade >17 && idade <64){
            System.out.println("Seu voto eh obrigatorio");
        }
    }
}