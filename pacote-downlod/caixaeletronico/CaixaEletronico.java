/*Caixa Eletrônico:
Crie um programa que simule um caixa eletrônico, onde o saldo inicial será de 
R$ 150,00.
O caixa deverá conter um Menu onde tenha as seguintes opções:
1 - Depositar dinheiro
2 - Efetuar saque
3 - Mostrar Saldo
 */
package caixaeletronico;

import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-07-11
 * @author irion-silva
 */
public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldoInicial = 150.00, valorDeposito, valorSaque, saldoAtual = 0;
        int opcao;
        boolean encerrar = false;
        String charOp;
        
        saldoAtual = saldoInicial;
        do {
            System.out.println("-----CAIXA ELETRÔNICO-----");
            System.out.print("1 - Depositar dinheiro \n2 - Efetuar saque \n3 - Mostrar saldo \nEscolha uma opção:");
            opcao = entrada.nextInt();
            
            switch (opcao){
                case 1:
                    System.out.print("Informe o valor do depósito:");
                    valorDeposito = entrada.nextDouble();
                    if (valorDeposito > 0){
                    saldoAtual = saldoAtual + valorDeposito;
                    System.out.println("Sucesso.");
                    } else {
                        System.out.println("Informe um valor de depósito válido.");
                    }
                    break;
                case 2:
                    System.out.print("Informe o valor do saque:");
                    valorSaque = entrada.nextDouble();
                    if (valorSaque > saldoAtual){
                        System.out.println("Valor indisponível para saque");
                    } else {
                        saldoAtual = saldoAtual - valorSaque;
                        System.out.println("Sucesso.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo: %.2f%n", saldoAtual);
                    break;
                default:
                    System.out.println("Opção informada não disponível no MENU.");
                    
            }
            System.out.print("Deseja continuar? [S/N]");
            charOp = entrada.next();
            if (charOp.equals("N") || charOp.equals("n")){
                encerrar = true;
            } else {
                encerrar = false;
            }
        }while (encerrar == false);
            
        

    }
    
}
