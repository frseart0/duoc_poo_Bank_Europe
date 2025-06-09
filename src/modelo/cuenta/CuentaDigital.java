package modelo.cuenta;

class CuentaDigital extends CuentaBancaria{
    
    private int saldoDigital;
    private double interesDigital = 0.01;
    
    public CuentaDigital(int numeroCuenta) {
        super(numeroCuenta);
        this.saldoDigital = 0;
    }

    @Override
    public void calcularInteres() {

    }
    
}