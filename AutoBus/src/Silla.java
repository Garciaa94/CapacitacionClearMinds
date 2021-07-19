
/**
 * @author Adrian Garcia
 * @mail peter.garcia@pucese.edu.ec
 * @date  13 jul. 2021
 */
public class Silla {
    
    
    private Usuario usuario;
    private boolean isOcupado;
    private int puesto;
    
    public Silla(){
        this.isOcupado = false;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isIsOcupado() {
        return isOcupado;
    }

    public void setIsOcupado(boolean isOcupado) {
        this.isOcupado = isOcupado;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }
    
    
    
}
