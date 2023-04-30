package modelo;

public abstract class Player extends Personaje
{
    //------------------------------------------------------------------------ METODOS
    public Player(String nombre, String skin, int x, int y)
    {
        super(nombre, skin,x,y);
    }

    public String curarse(double cura)
    {
        setNivelDeVida(cura);

        return "El personaje se ha curado, vida actual: " + getNivelDeVida();
    }

    public String recargarArma()
    {
        return "El arma se ha recargado";
    }
}
