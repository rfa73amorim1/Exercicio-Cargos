package Exercicio.Cargos;

public class Pessoa {
    private String nome;
    private Cargo cargo;

    public Pessoa(String nome, String cargo) {
        this.nome = nome;
        if (cargo.equals("Junior")) {
            this.cargo = Cargo.JUNIOR;
        } else if (cargo.equals("Starter")) {
            this.cargo = Cargo.STARTER;
        } else {
            this.cargo = Cargo.SENIOR;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
