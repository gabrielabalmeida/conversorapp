package br.edu.ibta.aluno.conversor2;

public class Unidade {
    public int ID;
    public String texto;

    public Unidade(int ID, String texto) {
        this.ID = ID;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }

}
