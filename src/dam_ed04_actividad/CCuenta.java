package dam_ed04_actividad;

public class CCuenta {

    protected String nombre;
    protected String cuenta;
    protected double saldo;
    protected double tipoInterés;


    public CCuenta() {
    
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {    
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom) {    
        setNombre(nom);
    }

    public String obtenerNombre() {    
        return getNombre();
    }


    public double estado() {    
        return saldo;
    }


    public void ingresar(double cantidad) throws Exception {    
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(saldo+cantidad);
    }

    public void retirar(double cantidad) throws Exception {    
        if (cantidad <=0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()<cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(saldo-cantidad);
    }


    public String obtenerCuenta() {    
        return cuenta;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre=nombre;
    }


    public double getTipoInterés() {
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés=tipoInterés;
    }

    
    public void setCuenta(String cuenta) {
        this.cuenta=cuenta;
    }

    
    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }

}
