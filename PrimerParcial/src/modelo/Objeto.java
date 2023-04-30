package modelo;

public abstract class Objeto
{
    //------------------------------------------------------------------------ ATRIBUTOS
    private double ancho;
    private double alto;

    //------------------------------------------------------------------------ METODOS
    public Objeto(double ancho, double alto)
    {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho()
    {
        return ancho;
    }

    public double getAlto()
    {
        return alto;
    }

    public abstract String toString();
}
