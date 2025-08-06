import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        byte idade = sc.nextByte();

        System.out.println("Digite o numero de Irmãos: ");
        short numeroIrmaos= sc.nextShort();

        System.out.println("Digite o seu salário: ");
        int salario = sc.nextInt();

        System.out.println("Digite o seu telefone ");
        long telefone = sc.nextLong();

        System.out.println("Digite a sua altura: ");
        float altura = sc.nextFloat();

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite seu Gênero (M/F): ");
        char genero = sc.next().charAt(0);

        System.out.println("Você é casado? (true/false) ");
        boolean casado = sc.nextBoolean();

        boolean maiorIdadetrue = false;
        if (idade >= 18){
             maiorIdadetrue = true;
        }

        double imc = peso / (altura*altura);



        System.out.println("Idade: " + idade);
        System.out.println("Número de irmãos: " + numeroIrmaos);
        System.out.println("Salário mensal: "+ salario);
        System.out.println("Telefone" + telefone);
        System.out.println("Altura: " + altura + ("metros"));
        System.out.println("Peso: " + peso + ("kg"));
        System.out.println("Genero: " + genero);
        System.out.println("Casado: " + casado);
        System.out.println("Maior de idade: " + maiorIdadetrue);
        System.out.print("IMC aproximado: " + imc);

        System.out.println("teste 2");



    }
}