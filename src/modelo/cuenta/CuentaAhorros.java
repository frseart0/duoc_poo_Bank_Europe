package modelo.cuenta;

class CuentaAhorros extends CuentaBancaria{
    
    private int saldoAhorro;
    private double interesAhorro = 0.06;
    
    public CuentaAhorros(int numeroCuenta) {
        super(numeroCuenta);
        this.saldoAhorro = 0;
    }

    @Override
    public void calcularInteres() {

    }
    
}