package modelo;

public class Acechador extends Zombie
{
    //------------------------------------------------------------------------ ATRIBUTOS
    public final double nivelDeAtaque = 20;//el ataque es fijo dependiendo del personaje
    public double tiempoDeAcecho;

    //------------------------------------------------------------------------ METODOS
    public Acechador(String nombre, String skin, int x , int y, double tiempoDeAcecho)
    {
        super(nombre, skin,x,y);
        this.tiempoDeAcecho = tiempoDeAcecho;
    }

    public String acechar()
    {
        return getNombre() + " espera " + tiempoDeAcecho + " antes de atacar";
    }

    public String morder(Player personaje)
    {
        return morderAPlayer(personaje, nivelDeAtaque);
    }

    public String atacar(Object aAtacar)
    {
        return atacarAPlayer(aAtacar, nivelDeAtaque);
    }
}
