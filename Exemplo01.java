import java.util.Scanner;

public class Exemplo01 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        String nomeAluno;
        String matricula;
        int idade;
        double notaAP1, notaAP2, notaAP3, mediaFinal;
        boolean ehAprovado;

        System.out.println("Digite o nome do aluno:");
        nomeAluno = scanner.next();
        System.out.println("Digite a matrícula do aluno:");
        matricula = scanner.next();
        System.out.println("Digite a idade do aluno:");
        idade = scanner.nextInt();
        System.out.println("Digite a nota da AP1 do aluno:");
        notaAP1 = scanner.nextDouble();
        System.out.println("Digite a nota da AP2 do aluno:");
        notaAP2 = scanner.nextDouble();
        System.out.println("Digite a nota da AP3 do aluno:");
        notaAP3 = scanner.nextDouble();

        mediaFinal = (notaAP1*0.3) + (notaAP2*0.3) + (notaAP3*0.4);

        System.out.println("Média final: " + mediaFinal);
        
        System.out.println("Digite 'true' se o aluno foi aprovado e 'false' se não.");
        
        ehAprovado = scanner.nextBoolean();

        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Matrícula do Aluno: " + matricula);
        System.out.println("Idade do Aluno: " + idade);
        System.out.println("Nota AP1: " + notaAP1);
        System.out.println("Nota AP2: " + notaAP2);
        System.out.println("Nota AP3: " + notaAP3);
        System.out.println("Média final: " + mediaFinal);



        System.out.println("Resultado: " + ehAprovado);


    }
}