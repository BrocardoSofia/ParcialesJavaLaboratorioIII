package modelo;

import interfaz.ICamuflarse;

public class Gordinflon extends Zombie implements ICamuflarse
{
    //------------------------------------------------------------------------ ATRIBUTOS
    public final double nivelDeAtaque = 30;//el ataque es fijo dependiendo del personaje
    public double peso;
    public String dondeSeCamufla;

    //------------------------------------------------------------------------ METODOS
    public Gordinflon(String nombre, String skin, int x , int y, double peso, String dondeSeCamufla)
    {
        super(nombre, skin,x,y);
        this.peso = peso;
        this.dondeSeCamufla = dondeSeCamufla;
    }

    public String caeSobreJugador(Player jugador)
    {
        jugador.morir();

        return getNombre() + " con " + peso + "kg,"
                + " ha caido sobre " + jugador.getNombre()
                + " y lo mato ";
    }

    public String morder(Player personaje)
    {
        return morderAPlayer(personaje, nivelDeAtaque);
    }

    public String atacar(Object aAtacar)
    {
        return atacarAPlayer(aAtacar, nivelDeAtaque);
    }

    public String camuflarse()
    {
        return getNombre() + " se camuflo en " + dondeSeCamufla;
    }
}
