public class TestarCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Gol";
        c1.ano = 2005;
        c1.marca = "volkswagem";
        c1.vel = 70;

        c1.buzinar();
        c1.acelerar(15);
        System.out.println("Velocidade atual: " + c1.vel + "km/h");

        c1.freiar(40);
        System.out.println("Velocidade atual: " + c1.vel + "km/h");
    }
}
