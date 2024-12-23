import java.util.Scanner;

Scanner x = new Scanner(System.in); // x vai ser uma nova instância da classe Scanner.

System.out.println("Qual é o seu nome?");
String nome = x.nextLine(); // nextLine() é um método do objeto scanner.
System.out.println("Seja bem-vindo " + nome)


x.close(); // É uma boa prática fechar o objeto scanner criado após o seu uso.



/*
Métodos de leitura comuns da classe Scanner:

1 - nextLine() para Strings
2 - nextInt()
3 - nextDouble()
4 - nextFloat()
5 - nextBoolean()


*/
