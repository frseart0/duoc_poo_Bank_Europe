package modelo.cuenta;

class CuentaCorriente extends CuentaBancaria{
    
    private int saldoCorriente;
    private double interesCorriente = 0.01;
    
    public CuentaCorriente(int numeroCuenta) {
        super(numeroCuenta);
        this.saldoCorriente = 0;
    }

    @Override
    public void calcularInteres() {

    }
    
}