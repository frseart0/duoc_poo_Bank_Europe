package modelo.cuenta;

public abstract class CuentaBancaria{
    
    protected static int numeroCuenta;
    protected int saldo;
    
    public CuentaBancaria(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }
    
    public int getNumeroCuenta() {return numeroCuenta;}
    public int getSaldo() {return saldo;}
    
    public abstract void calcularInteres();
}