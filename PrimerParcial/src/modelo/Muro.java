package modelo;

public class Muro extends Objeto
{
    //------------------------------------------------------------------------ ATRIBUTOS
    private double resistencia;

    //------------------------------------------------------------------------ METODOS
    public Muro(double ancho, double alto, double resistencia)
    {
        super(ancho, alto);
        this.resistencia = resistencia;
    }

    public double getResistencia()
    {
        return resistencia;
    }

    public String toString()
    {
        return "El muro es de " + getAncho() + " x " + getAlto() +
                " y tiene una resistencia de " + resistencia + "kg\n";
    }
}
