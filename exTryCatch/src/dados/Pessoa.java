package dados;

public class Pessoa {
    private String nome;
    private EstadoCivil estadoCivil;

    public Pessoa(String nome, EstadoCivil estadoCivil){
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }

    public String getNome(){
        return this.nome;
    }

    public EstadoCivil getEstadoCivil(){
        return this.estadoCivil;
    }

}
