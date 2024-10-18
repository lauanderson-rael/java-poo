package pacote01;

public abstract class Animal {
    String nome;

    public Animal( String nome){
        this.nome = nome;
    }
    // metodo abstrato fazerSom() --> deve ser implementado nas subclasses
    public abstract void fazerSom();

    public void dormir(){
        System.out.println(nome + " Está dormindo...");
    }
}
