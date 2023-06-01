import java.util.Scanner;

public class App {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        menu();
    }

    public static void menu() {
        System.out.println("Informe o exercício que deseja verificar: ");
        System.out.println("1. Operação de três números");
        System.out.println("2. Média de notas");
        System.out.println("3. Concessionária");
        System.out.println("4. Soma de cinco números");
        System.out.println("5. Vetor com quíntuplos");
        System.out.println("6. Tabuada de 10");
        System.out.println("7. Nomes em ordem inversa");
        System.out.println("8. Potência");
        System.out.println("9. Triângulo");
        System.out.println("10. Info. Dev.");
        System.out.println("11. Sair");

        int opcao = input.nextInt();
        
        switch (opcao){
            case 1: 
                tresNum();
                continua();
                break;

            case 2:
             variasNotas();
             continua();
             break;
            
            case 3:
            carango();
            continua();
            break;

            case 4:
            somaNumeros();
            continua();
            break;

            case 5:
            vetorQuintuplo();
            continua();
            break;
        
            case 6:
            tabuada();
            continua();
            break;

            case 7:
            nomes();
            continua();
            break;

            case 8:
            potencia();
            continua();
            break;

            case 9:
            triangulo();
            continua();
            break;

            case 10:
            nomeDev();
            continua();
            break;

            case 11:
            break;

            default:
            System.out.println("Opção inválida. Tente novamente.");
            menu();
        }
    }

    public static void continua() {
        int continua;
        System.out.println("Deseja continuar?");
        System.out.println("1. Abrir menu novamente.");
        System.out.println("2. Sair.");
        continua = input.nextInt();
        if(continua == 1){
            menu();
        }
    }
  
    public static void tresNum() {

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Seja bem vindo, " + nome + ".");
        
        System.out.println("Informe o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = input.nextInt(); 

        System.out.println("Informe o terceiro número: ");
        int num3 = input.nextInt();

        System.out.println("Informe a operação desejada: ");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int opcao = input.nextInt();

        switch (opcao) {
            case(1): System.out.println("A soma dos números é : " + (num1 + num2 + num3) + ".");
            break;
            case(2): System.out.println("A subtração dos números é : " + (num1 - num2 - num3) + ".");
            break;
            case(3): System.out.println("A multiplicação dos números é : " + (num1 * num2 * num3) + ".");
            break;
            case(4): System.out.println("A divisão dos números é : " + (num1 / num2 / num3) + ".");
            break;
            default: System.out.println("Opção inválida.");
            break;
        }
                


    }

    public static void variasNotas() {

        System.out.println("Informe uma nota: ");
        float nota1 = input.nextFloat();

        System.out.println("Informe outra nota: ");
        float nota2 = input.nextFloat();

        System.out.println("Informe outra nota: ");
        float nota3 = input.nextFloat();

        System.out.println("Informe outra nota: ");
        float nota4 = input.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas informadas é: " + media);

    }

    public static void carango() {
        System.out.println("Informe o valor do veículo: ");    
        float valor = input.nextFloat();
        if (valor == 0) {System.exit(1);}

        System.out.println("Informe o tipo de seu combustível: ");
        System.out.println("1. Gasolina");
        System.out.println("2. Diesel");
        System.out.println("3. Álcool");
        int tipoCombustivel = input.nextInt();

        switch(tipoCombustivel){
            case 1: System.out.println("O total a pagar do veículo é R$" + (valor - (valor * 21/100)) + " , com desconto de R$ " + (valor * 21/100));
            break;
            case 2: System.out.println("O total a pagar do veículo é R$" + (valor - (valor * 14/100)) + " , com desconto de R$ " + (valor * 14/100));
            break;
            case 3: System.out.println("O total a pagar do veículo é R$" + (valor - (valor * 25/100)) + ", com desconto de R$ " + (valor * 25/100));
            default: System.out.println("Opção inválida.");
            break;
        }


    
    }

    public static void somaNumeros() {
        System.out.println("Informe o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = input.nextInt(); 

        System.out.println("Informe o terceiro número: ");
        int num3 = input.nextInt();

        System.out.println("Infrome o  quarto número: ");
        int num4 = input.nextInt();

        System.out.println("Informe o quinto número: ");
        int num5 = input.nextInt();

        int soma = num1 + num2 + num3 + num4 + num5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("Os números digitados foram: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }

    public static void vetorQuintuplo() {
        int num[] = new int[10];
        int num2[] = new int[10];

        System.out.println("Informe o primeiro número: ");
        num[0] = input.nextInt();
        System.out.println("Informe o segundo número: ");
        num[1] = input.nextInt();
        System.out.println("Informe o terceiro número: ");
        num[2] = input.nextInt();
        System.out.println("Informe o quarto número: ");
        num[3] = input.nextInt();
        System.out.println("Informe o quinto número: ");
        num[4] = input.nextInt();
        System.out.println("Informe o sexto número: ");
        num[5] = input.nextInt();
        System.out.println("Informe o sétimo número: ");
        num[6] = input.nextInt();
        System.out.println("Informe o oitavo número: ");
        num[7] = input.nextInt();
        System.out.println("Informe o nono número: ");
        num[8] = input.nextInt();
        System.out.println("Informe o decimo número: ");
        num[9] = input.nextInt();

        System.out.println("Os números digitados multiplicados por 5 são: ");
        for(int i=0; i<10; i++){
            num2[i] = (num[i] * 5);
            System.out.println(num2[i]);
        }
        

    }

    public static void tabuada() {
        System.out.println("Informe um número para verificar sua tabuada de 10: ");
        int num = input.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void nomes() {
    System.out.println("Informe o primeiro nome: ");
    String nome1 = input.nextLine();
    System.out.println("Informe o segundo nome: ");
    String nome2 = input.nextLine();
    System.out.println("Informe o terceiro nome: ");
    String nome3 = input.nextLine();
    System.out.println("Informe o quarto nome: ");
    String nome4 = input.nextLine();
    System.out.println("Informe o quinto nome: ");
    String nome5 = input.nextLine();

    System.out.println("Os nomes digitados na ordem inversa são: ");
    System.out.println(nome5);
    System.out.println(nome4);
    System.out.println(nome3);
    System.out.println(nome2);
    System.out.println(nome1);

    }

    public static void potencia(){
        System.out.println("Informe um número: ");
        int num = input.nextInt();
        System.out.println("Informe outro número, pelo qual o primeiro será potencializado: ");
        int num2 = input.nextInt();

        System.out.println("O resultado da potência é: " + Math.pow(num, num2));
    }

    public static void triangulo(){
        System.out.println("Informe o primeiro número: ");
        int num1 = input.nextInt();
        while(num1 < 1){
            System.out.println("Não é possível formar um triângulo com esse número. Tente novamente: ");
            num1 = input.nextInt();
        }
        System.out.println("Informe o segundo número: ");
        int num2 = input.nextInt();
        while(num2 < 1){
            System.out.println("Não é possível formar um triângulo com esse número. Tente novamente: ");
            num2 = input.nextInt();
        }
        System.out.println("Informe o terceiro número: ");
        int num3 = input.nextInt();
        while(num3 < 1){
            System.out.println("Não é possível formar um triângulo com esse número. Tente novamente: ");
            num3 = input.nextInt();
        }
        
        if(num1 == num2){
            if(num2 == num3){
                System.out.println("Esse triângulo é equilátero.");
            }
            else{
                System.out.println("Esse triângulo é isósceles.");
            }
        }
        else{
            if(num1 == num3){
                System.out.println("Esse triângulo é isósceles.");
            }
            else{
                System.out.println("Esse triângulo é escaleno.");
            }
        }
    }

    public static void nomeDev(){
        String nome[] = new String[10];
        nome[0] = ("Pedro");
        nome[1] = ("Maria");
        nome[2] = ("João");
        nome[3] = ("Felipe");
        nome[4] = ("Jonas");
        nome[5] = ("Tobias");
        nome[6] = ("Fernanda");
        nome[7] = ("Elaine");
        nome[8] = ("Eri");
        nome[9] = ("Graziela");

        float salario[] = new float[10];
        salario[0] = (1000);
        salario[1] = (2000);
        salario[2] = (3000);
        salario[3] = (4000);
        salario[4] = (5000);
        salario[5] = (6000);
        salario[6] = (7000);
        salario[7] = (8000);
        salario[8] = (9000);
        salario[9] = (10000);

        String nivel[] = new String[10];
        nivel[0] = ("Dev Pleno");
        nivel[1] = ("Dev Sênior");
        nivel[2] = ("Dev Sênior");
        nivel[3] = ("Dev Júnior");
        nivel[4] = ("Estagiário");
        nivel[5] = ("Estagiário");
        nivel[6] = ("Estagiário");
        nivel[7] = ("Dev Pleno");
        nivel[8] = ("Dev Júnior");
        nivel[9] = ("Dev Sênior");

        System.out.println("Informe um nome para verificar seu nível e salário: ");
        for(int i = 0; i<10; i++){
            System.out.println(i + "." + nome[i]);
        }
        int opcao = input.nextInt();

        System.out.println(nome[opcao] + " possui salário de R$" + salario[opcao] + " e é de nível " + nivel[opcao]);
    
    }
}
