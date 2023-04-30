package modelo;

public abstract class Zombie extends Personaje
{
    //------------------------------------------------------------------------ METODOS
    public Zombie(String nombre, String skin, int x , int y)
    {
        super(nombre, skin,x,y);
    }

    //morder
    public abstract String morder(Player personaje);

    protected String morderAPlayer(Player personaje, double nivelDeAtaque)
    {
        String morder = "";
        if(personaje instanceof Ellie)
        {
            //si muerde a una Ellie no la mata pero le hace daño
            personaje.setNivelDeVida(personaje.getNivelDeVida() - nivelDeAtaque);
            morder = getNombre() + " mordio a " + personaje.getNombre() +
                    ". No lo mato pero le hizo daño.\n" + getNombre() +
                    " dejo a " + personaje.getNombre() +" a " + personaje.getNivelDeVida() +
                    " de vida";
        }
        else
        {
            //si no es una ellie directamente muere por la mordida
            personaje.morir();
            morder = getNombre() + " mordio a " + personaje.getNombre() +
                    " .Lo mato y convirtio en zombie. 'F' en el chat";
        }

        return morder;
    }

    protected String atacarAPlayer(Object aAtacar, double nivelDeAtaque)
    {
        String ataque = "";

        //primero ver si es un zombie
        if(aAtacar instanceof Player)
        {
            ataque = personajeAtacaAPersonaje(aAtacar, nivelDeAtaque);
        }
        else
        {
            ataque = getNombre() + " no ataco, ya que solo ataca a jugadores";
        }

        return ataque;
    }

}
