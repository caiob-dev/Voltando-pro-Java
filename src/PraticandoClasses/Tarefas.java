package PraticandoClasses;

public class Tarefas {
    //Crie um programa que:
    //Defina uma classe com os atributos descrição e concluída.
    //Implemente um método que mostre a descrição da tarefa e seu status.
    //Crie uma lista de tarefas e exiba todas as tarefas cadastradas. Dica: use ArrayList.
    //Exemplo de entrada:
    //
    //Tarefa t1 = new Tarefa();
    //t1.descricao = "Estudar Java";
    //t1.concluida = false;
    //
    //Tarefa t2 = new Tarefa();
    //t2.descricao = "Fazer exercícios";
    //t2.concluida = true;

    //Saída esperada:
    //Tarefa: Estudar Java - Status: Pendente
    //Tarefa: Fazer exercícios - Status: Concluída

    private String descricao;
    private boolean concluida;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void descricaoTarefaComStatus () {
        if (concluida) {
            System.out.println("Tarefa: " + getDescricao() +" - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + getDescricao() +" - Status: Pendente");
        }
    }

}
