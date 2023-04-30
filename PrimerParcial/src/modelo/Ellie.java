package modelo;

public class Ellie extends Player
{
    //------------------------------------------------------------------------ ATRIBUTOS
    public final double nivelDeAtaque = 10;//el ataque es fijo dependiendo del personaje
    private double gradoDeHumor;
    private int cantChistesMalos;

    //------------------------------------------------------------------------ METODOS
    public Ellie(String nombre, String skin, int x , int y, double gradoDeHumor, int cantChistesMalos)
    {
        super(nombre, skin,x,y);
        this.gradoDeHumor = gradoDeHumor;
        this.cantChistesMalos = cantChistesMalos;
    }

    @Override
    public String toString() {
        return "Ellie: " +
                "\nNombre: ...................... " + getNombre() +
                "\nSkin: ........................ " + getSkin() +
                "\nNivelDeAtaque: ............... " + nivelDeAtaque +
                "\nGradoDeHumor: ................ " + gradoDeHumor +
                "\nCantidad de Chistes Malos: ... " + cantChistesMalos +
                "\n";
    }

    public double getNivelDeAtaque()
    {
        return nivelDeAtaque;
    }

    public double getGradoDeHumor()
    {
        return gradoDeHumor;
    }

    public int getCantChistesMalos()
    {
        return cantChistesMalos;
    }

    public String contarChisteMalo()
    {
        String cuentaChiste = "";

        if(cantChistesMalos != 0)
        {
            cantChistesMalos--;
            cuentaChiste = getNombre() + " conto un chiste malo";
        }
        else
            cuentaChiste = getNombre() + " se quedo sin chistes";

        return cuentaChiste;
    }

    public String atacar(Object aAtacar)
    {
        String ataque = "";

        //primero ver si es un zombie
        if(aAtacar instanceof Zombie)
        {
            ataque = personajeAtacaAPersonaje(aAtacar, nivelDeAtaque);
        }
        else
        {
            ataque = getNombre() + " no ataco, ya que solo ataca a zombies";
        }

        return ataque;
    }
}
