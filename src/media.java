import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media >= 7.0){
            System.out.println("Aluno APROVADO com média: " + media);
        }else{
            System.out.println("Aluno REPROVADO por média: " + media);
        }
        sc.close();
    }
}
