package modelo;

import interfaz.IAcciones;

import java.util.ArrayList;

public abstract class Personaje implements IAcciones
{
    //------------------------------------------------------------------------ ATRIBUTOS
    private String nombre;
    private String skin;
    private double nivelDeVida;
    private ArrayList<String> armas;
    private Posicion posicion;

    //------------------------------------------------------------------------ METODOS
    public Personaje(String nombre, String skin, int x, int y)
    {
        this.nombre = nombre;
        this.skin = skin;
        armas = new ArrayList<>();//inicializo el arrayList
        nivelDeVida = 100;//siempre cuando se crea el personaje arranca con 100% de vida
        posicion = new Posicion(x,y);
    }

    public void agregarArma(String arma)
    {
        armas.add(arma);
    }

    public String getArmas()
    {
        String rta = "";

        for(String arma : armas)
            rta += arma;

        return rta;
    }

    public double getNivelDeVida()
    {
        return nivelDeVida;
    }

    public String getSkin()
    {
        return skin;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String morir()
    {
        nivelDeVida = 0;
        return "El personaje " + nombre + " ha muerto";
    }

    public void setNivelDeVida(double nivelDeVida)
    {
        if(this.nivelDeVida != 0) //si el personaje no esta muerto
        {
            if(nivelDeVida > 100)
                nivelDeVida = 100;//maximo nivel de vida
            else if(nivelDeVida < 0)
                morir();//minimo nivel de vida
            else
                this.nivelDeVida = nivelDeVida;
        }
    }

    public String cargarVida(double vida)
    {
        setNivelDeVida(vida);

        return "Se ha cargado la vida, vida actual: " + nivelDeVida;
    }

    public boolean defenderse()
    {
        //tiro un random por si se pudo defender o no
        double defensa = Math.random() * (0 - 2) + 2;
        boolean rta = false;

        if (defensa > 1)
            rta = true;

        return rta;
    }


    protected String personajeAtacaAPersonaje(Object aAtacar, double nivelDeAtaque)
    {
        String ataque = "";

        //primero ver si es un zombie
        if(aAtacar instanceof Personaje)
        {
            Personaje personaje = (Personaje) aAtacar;//casteo al zombie
            double vidaPersonaje = personaje.getNivelDeVida();

            //luego, antes de quitarle vida, veo si se pudo defender
            if(personaje.defenderse())
            {
                ataque = getNombre() + " no ataco, ya que " + personaje.getNombre() + " se defendio";
            }
            else
            {
                personaje.setNivelDeVida(vidaPersonaje - nivelDeAtaque);
                ataque = getNombre() + " ataco y dejo a " + personaje.getNombre()
                        + " a " + personaje.getNivelDeVida() + " de vida";
            }
        }
        else
        {
            ataque = getNombre() + " no ataco, ya solo ataca a personajes";
        }

        return ataque;
    }
}
