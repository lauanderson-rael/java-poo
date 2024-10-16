public class ProdutoCriar {
    public static void main(String[] args) {
        /* Construtor Padrao */
        Produto p0 = new Produto();

        /* Construtor de 1 paramentro*/
        Produto p1 = new Produto("Lapis");
        p1.marca = "Stell";
        p1.valor = 1.50f;

        /* Construtor de 2 parametros */
        Produto p2 = new Produto("Caneta", "Castel");
        p2.valor = 1.90f;

        /* Construtor de 3 parametros */
        Produto p3 = new Produto("Livro", "Livraria X", 19.99f);

        System.out.println("- nome: "+ p1.nome + " - marca: "+ p1.marca + " - valor: " + p1.valor);
        System.out.println("- nome: "+ p2.nome + " - marca: "+ p2.marca + " - valor: " + p2.valor);
        System.out.println("- nome: "+ p3.nome + " - marca: "+ p3.marca + " - valor: " + p3.valor);
    }
}




