import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws IOException {
        //testando switch com string
        System.out.println("|___________________________________________________________|");
        System.out.println("|                                                           |");
        System.out.println("|           Bem Vindo a Concessionária Peixoto !!           |");
        System.out.println("|                                                           |");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String saida = "1";

            while(!saida.equals("Sair")){
                if(!saida.equals("Sair")){
                    System.out.println("|___________________________________________________________|");
                    System.out.println("|                                                           |");
                    System.out.println("|         Catálogo:                                         |");
                    System.out.println("|                                                           |");
                    System.out.println("|                  Audi                                     |");
                    System.out.println("|                  Ferrari                                  |");
                    System.out.println("|                  Honda                                    |");
                    System.out.println("|                                                           |");
                    System.out.println("|  Digite 'sair' para encerrar consulta.                    |");
                    System.out.println("|___________________________________________________________|");
                    System.out.println(" ");
                    System.out.print("Qual o carro o senhor deseja saber mais informações? ");

                }
                String carro = reader.readLine();
                carro = carro.substring(0,1).toUpperCase().concat(carro.substring(1));
                saida = carro;
                switch (carro){
                    case "Audi":
                        System.out.println("");
                        System.out.println("Informações:");
                        System.out.println("            Nome: Audi A5");
                        System.out.println("            Origem: Alemã");
                        System.out.println("            Valor: R$120.000");
                        System.out.println(" ");
                        break;

                    case "Ferrari":
                        System.out.println("");
                        System.out.println("Informações:");
                        System.out.println("            Nome: Ferrari");
                        System.out.println("            Origem: Italiana");
                        System.out.println("            Valor: R$750.000");
                        System.out.println(" ");
                        break;

                    case "Honda":
                        System.out.println("");
                        System.out.println("Informações:");
                        System.out.println("            Nome: Honda");
                        System.out.println("            Origem: Japonesa");
                        System.out.println("            Valor: R$70.000");
                        System.out.println(" ");
                        break;

                    case "Sair":
                        System.out.println(" ");
                        System.out.println("Obrigado por visitar nossa Concessionária!!");
                        System.out.println("Volte sempre!!");
                        break;

                    default:
                        System.out.println(" ");
                        System.out.println("Insira uma opção correta");
                        System.out.println(" ");
                }
            }

}}
