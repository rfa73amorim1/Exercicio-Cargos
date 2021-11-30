package Exercicio.Cargos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        GerenciadoDePessoas gerenciadoDePessoas = new GerenciadoDePessoas();
        for (int i = 0; i < 5; i++){
            System.out.println("Digite o nome da " + (i+1) +"a. pessoa: ");
            String nome = scan.nextLine();
            System.out.println("Digite o cargo da " + (i+1) +"a. pessoa ('Starter, Junior ou Senior'): ");
            String cargo = scan.nextLine();
            Pessoa pessoa = new Pessoa(nome, cargo);
            pessoas.add(pessoa);
        }
        gerenciadoDePessoas.identificarCargo(pessoas);


    }
}
