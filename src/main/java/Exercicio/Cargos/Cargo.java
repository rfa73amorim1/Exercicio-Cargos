package Exercicio.Cargos;

public enum Cargo {
    STARTER ("Starter"),
    JUNIOR ("Junior"),
    SENIOR ("Senior");

    private final String cargo;

    private Cargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
