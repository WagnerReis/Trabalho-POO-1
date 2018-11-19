package vt.poo.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nClientes;
        int nDvds;
        String nome;
        String nomeDvd;
        float total;

        System.out.println("Quantos clientes deseja cadastrar: ");
        nClientes = sc.nextInt();
        System.out.println("Quantos dvds deseja cadastrar: ");
        nDvds = sc.nextInt();

        DVD d[] = new DVD[nDvds];
        Cliente c[] = new Cliente[nClientes];

        for (int i = 0; i < nClientes; i++) {
            c[i] = new Cliente();
        }

        for (int i = 0; i < nDvds; i++) {
            d[i] = new DVD();
        }
        
        System.out.println("-------------------------------------------\n");
        
        for (int i = 0; i < nDvds; i++) {
            System.out.println(d[i].toString());
        }
        
        System.out.println("-------------------------------------------\n");
        
        sc.nextLine();
        System.out.println("Informe o nome do clinte para locação: ");
        nome = sc.nextLine();

        for (int i = 0; i < nClientes; i++) {
            if (c[i].getNome().equals(nome)) {

                Locacao l = new Locacao(c[i]);
                
                System.out.println("Quantidade de dvds a serem alugados: ");
                l.setQuanti(sc.nextInt());
                
                sc.nextLine();
                System.out.println("Informe o nome do DVD: ");
                    nomeDvd = sc.nextLine();
                    
                for (int j = 0; j < l.getQuanti(); j++) {
                     for (i = 0; i < nDvds; i++){
                        if(d[i].verificaEstoque(l.getQuanti(), nomeDvd ) == true ){
                            l.adicionarDVD(d[i]);
                        }else{
                            System.exit(0); 
                        }
                    }
                }
                
                System.out.println("Informe a data de locacao: ");
                l.setData_locacao(sc.nextLine());
                
                total = l.calcularValorTotal();
                l.EmitirRecibo();
               
            }

        }
    }
}
