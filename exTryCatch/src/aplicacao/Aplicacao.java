package aplicacao;

import dados.*;

public class Aplicacao {
    private Agenda agenda;

    public Aplicacao() {
        agenda = new Agenda();
    }

    public void executar() {
        // Cria algumas pessoas e adiciona na agenda
        Pessoa p = new Pessoa("Casado", EstadoCivil.CASADO);
        agenda.addPessoa(p);
        p = new Pessoa("Divorciado", EstadoCivil.DIVORCIADO);
        agenda.addPessoa(p);
        p = new Pessoa("Solteiro", EstadoCivil.SOLTEIRO);
        agenda.addPessoa(p);
        p = new Pessoa("Nulo", null);
        agenda.addPessoa(p);
        p = new Pessoa("Viuvo", EstadoCivil.VIUVO);
        agenda.addPessoa(p);

        // Mostra as pessoas da agenda
        agenda.reset();
        while (agenda.hasNext()) {
            Pessoa aux = (Pessoa) agenda.next();
            System.out.println("=========================");
            System.out.println("Nome da pessoa: " + aux.getNome());
            System.out.println("Estado civil da pessoa: " + aux.getEstadoCivil().getExtenso());
        }
    }
}
