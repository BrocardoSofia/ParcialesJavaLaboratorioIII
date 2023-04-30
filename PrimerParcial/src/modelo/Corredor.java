package modelo;

public class Corredor extends Zombie
{
    //------------------------------------------------------------------------ ATRIBUTOS
    public final double nivelDeAtaque = 15;//el ataque es fijo dependiendo del personaje
    public double velocidad;

    //------------------------------------------------------------------------ METODOS
    public Corredor(String nombre, String skin, int x , int y, double velocidad)
    {
        super(nombre, skin,x,y);
        this.velocidad = velocidad;
    }

    public String morder(Player personaje)
    {
        return morderAPlayer(personaje, nivelDeAtaque);
    }

    public String atacar(Object aAtacar)
    {
        return atacarAPlayer(aAtacar, nivelDeAtaque);
    }

    public String correr()
    {
        return getNombre() + " corre a " + velocidad + "km/h";
    }
}
