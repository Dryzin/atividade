
package javassortaula;

import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private LocalDate dataNascimento;
    
    public Pessoa(String nome, LocalDate dataNasc){
        this.nome = nome;
        this.dataNascimento = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString(){
        return this.nome + " :" 
                + this.dataNascimento;
    }
    
    @Override
    public int compareTo(Pessoa outraPessoa){
        int comparaNome = this.nome.compareTo(outraPessoa.getNome());
        if (comparaNome==0)
            return this.dataNascimento.compareTo(outraPessoa.getDataNascimento());
        return comparaNome;
    }// trocaria nome por idade
    
}
