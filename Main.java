/*
OBJETIVO:
1 Comprimento: A senha deve ter pelo menos 8 caracteres e no máximo 30.
2 Letra Maiúscula: Deve conter pelo menos uma letra maiúscula
3 Letra Minúscula: Deve conter pelo menos uma letra minúscula
4 Número: Deve conter pelo menos um dígito numérico
5 Caractere Especial: Deve conter pelo menos um caractere especial
6 Sem Espaços: A senha não pode conter espaços.
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean SenhaSegura = false;
        boolean temComprimentoMinimo = false;
        boolean temLetraMaiuscula = false;
        boolean temLetraMinuscula = false;
        boolean temNumero = false;
        boolean temCaractereEspecial = false;
        boolean temEspacos = false;
        String senha;



        while(!SenhaSegura){

            System.out.print("DIGITE SUA SENHA: ");
            senha = scanner.nextLine();

            Verificadores verificadores = new Verificadores(senha);

            temComprimentoMinimo = verificadores.VerificadorTamanho();
            temLetraMaiuscula = verificadores.VerificadorMaiuscula();
            temLetraMinuscula = verificadores.VerificadorMinuscula();
            temNumero = verificadores.VerificadorNumero();
            temCaractereEspecial = verificadores.VerificadorNumeroEspecial();
            temEspacos = verificadores.VerificadorEspaco();

            if (!temComprimentoMinimo){
                System.out.println("*** A SENHA DEVE TER ENTRE 8 e 30 CARACTERES *****");
                continue;
            }
            if (!temLetraMaiuscula){
                System.out.println("*** A SENHA DEVE TER PELO MENOS UMA LETRA MAIUSCULA ***");
                continue;
            }
            if (!temLetraMinuscula){
                System.out.println("*** A SENHA DEVE TER PELO MENOS UMA LETRA MINUSCULA ***");
                continue;
            }
            if (!temNumero){
                System.out.println("*** A SENHA DEVE TER PELO MENOS UM NUMERO ***");
                continue;
            }
            if (!temCaractereEspecial){
                System.out.println("*** A SENHA DEVE TER AO MENOS UM CARACTERE ESPECIAL");
                continue;
            }
            if(temEspacos){
                System.out.println("*** A SENHA NAO PODE TER ESPACOS ***");
                continue;
            }


            if (temComprimentoMinimo && temLetraMaiuscula && temLetraMinuscula && temNumero && temCaractereEspecial && !temEspacos){
                SenhaSegura = true;
            }

            if (SenhaSegura){System.out.println("ENTRANDO...");}

















        }

        scanner.close();
    }
}