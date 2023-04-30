import modelo.*;

public class Main {
    public static void main(String[] args)
    {
        Ellie ellie = new Ellie("Ellie", "default", 2,2, 5, 2);
        Joel joel = new Joel("Joel", "default", 1,1, 10,5);
        Muro muro = new Muro(10 , 20 , 50);
        Plataforma plataforma = new Plataforma(60, 2, "ladrillo", "vigas");
        Corredor corredor = new Corredor("Pepe el corredor", "de Zombie con conjunto nike", 10,1, 20);
        Acechador acechador = new Acechador("Lucia la acechadora", "de Zombie con ojeras",20,1, 30);
        Chasqueador chasqueador = new Chasqueador("Casper el chasqueador", "de Zombie", 5,1,"ckrik");
        Gordinflon gordinflon = new Gordinflon("Gordinflon 1", "default",30,2, 200, "en el pasto");

        System.out.println(muro);
        System.out.println("\n----------------------\n");
        System.out.println(plataforma);
        System.out.println("\n----------------------\n");
        System.out.println(joel);
        System.out.println("\n----------------------\n");
        System.out.println(ellie);
        System.out.println("\n----------------------\n");
        System.out.println(ellie.contarChisteMalo());
        System.out.println(ellie.contarChisteMalo());
        System.out.println(ellie.contarChisteMalo());
        System.out.println("\n----------------------\n");
        System.out.println(corredor.morder(ellie));
        System.out.println("\n----------------------\n");
        System.out.println(joel.atacar(ellie));
        System.out.println("\n----------------------\n");
        System.out.println(joel.atacar(gordinflon));
        System.out.println("\n----------------------\n");
        System.out.println(joel.atacar(corredor));
        System.out.println("\n----------------------\n");
        System.out.println(gordinflon.atacar(corredor));
        System.out.println("\n----------------------\n");
        System.out.println(gordinflon.atacar(joel));
        System.out.println("\n----------------------\n");
        System.out.println(gordinflon.caeSobreJugador(ellie));
        System.out.println("\n----------------------\n");
        System.out.println(gordinflon.camuflarse());
        System.out.println("\n----------------------\n");
        System.out.println(corredor.morder(joel));
    }
}