package ModuloMuebles;

import java.io.Serializable;

public class Silla extends Mueble implements Serializable {

    public Silla(double precio) {
        super(precio);
    }

    @Override
    public void setNecesitaMantenimiento(boolean mantenimiento) {
        super.setNecesitaMantenimiento(mantenimiento);
    }

    @Override
    public boolean isNecesitaMantenimiento() {
        return super.isNecesitaMantenimiento();
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setEstado(boolean estado) {
        super.setEstado(estado);
    }

    @Override
    public boolean isEstado() {
        return super.isEstado();
    }

    @Override
    public boolean esTipo(String tipo) {
        return "Silla".equals(tipo);
    }

}
