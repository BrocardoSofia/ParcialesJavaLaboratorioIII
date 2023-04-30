package modelo;

public class Plataforma extends Objeto
{
    //------------------------------------------------------------------------ ATRIBUTOS
    private String material;
    private String soporte;

    //------------------------------------------------------------------------ METODOSç
    public Plataforma(double ancho, double alto, String material, String soporte) {
        super(ancho, alto);
        this.material = material;
        this.soporte = soporte;
    }

    public String toString()
    {
        return "La plataforma es de " + getAncho() + " x " + getAlto() +
                ", es de " + material + " y esta soportado por " + soporte + "\n";
    }

    public String getMaterial()
    {
        return material;
    }

    public String getSoporte()
    {
        return soporte;
    }

}
