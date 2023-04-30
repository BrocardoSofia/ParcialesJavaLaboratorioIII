package modelo;

public class Chasqueador extends Zombie
{
    //------------------------------------------------------------------------ ATRIBUTOS
    public final double nivelDeAtaque = 25;//el ataque es fijo dependiendo del personaje
    public String ruido;

    //------------------------------------------------------------------------ METODOS
    public Chasqueador(String nombre, String skin, int x , int y, String ruido)
    {
        super(nombre, skin,x,y);
        this.ruido = ruido;
    }

    public String hacerRuidito()
    {
        return ruido + " " + ruido + " " + ruido;
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
