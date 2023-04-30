package modelo;

public class Joel extends Player
{
    //------------------------------------------------------------------------ ATRIBUTOS
    public final double nivelDeAtaque = 15;//el ataque es fijo dependiendo del personaje
    private double nivelMalaOnda;
    private double nivelTestarudo;

    //------------------------------------------------------------------------ METODOS
    public Joel(String nombre, String skin, int x, int y, double nivelMalaOnda, double nivelTestarudo)
    {
        super(nombre, skin,x,y);
        this.nivelMalaOnda = nivelMalaOnda;
        this.nivelTestarudo = nivelTestarudo;
    }

    public String toString() {
        return "Joel: " +
                "\nNombre: ...................... " + getNombre() +
                "\nSkin: ........................ " + getSkin() +
                "\nNivelDeAtaque: ............... " + nivelDeAtaque +
                "\nNivel de Mala Onda: .......... " + nivelMalaOnda +
                "\nNivel de Testarudo: .......... " + nivelTestarudo +
                "\n";
    }

    public double getNivelMalaOnda()
    {
        return nivelMalaOnda;
    }

    public double getNivelDeAtaque()
    {
        return nivelDeAtaque;
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
