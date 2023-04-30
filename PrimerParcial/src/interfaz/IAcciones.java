package interfaz;

public interface IAcciones
{
    String atacar(Object aAtacar);//devuelve cuanto ataco
    boolean defenderse();
    String morir();
    String cargarVida(double vida);
}
