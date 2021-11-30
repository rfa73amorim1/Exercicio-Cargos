package Exercicio.Cargos;

import java.util.List;

public class GerenciadoDePessoas {

    public void identificarCargo(List<Pessoa> pessoas){
        int juniores = 0;
        int starters = 0;
        int seniors = 0;
        for (Pessoa item: pessoas) {
            if (item.getCargo().equals(Cargo.JUNIOR)){
                juniores++;
            }else if (item.getCargo().equals(Cargo.STARTER)){
                starters++;
            }else {
                seniors++;
            }
        }
        System.out.println("Total de Cargos: ");
        System.out.println(("Junior: " + juniores));
        System.out.println(("Starter: " + starters));
        System.out.println(("Senior: " + seniors));

    }
}
