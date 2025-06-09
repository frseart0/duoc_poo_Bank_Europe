package modelo.cliente;

import modelo.interfaces.InfoCliente;

public class Cliente implements InfoCliente{
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String comuna;
    private int telefono;
    private int numeroCuenta;
    
    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna,  int telefono, int numeroCuenta) {
        this.rut=rut;
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.domicilio=domicilio;
        this.comuna=comuna;
        this.telefono=telefono;
        this.numeroCuenta=numeroCuenta;
    }

    @Override
    public void mostrarInformacionCliente(){
        System.out.println("Rut: "+rut);
        System.out.println("Nombre Completo: "+nombre + " " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("Domicilio: "+domicilio);
        System.out.println("Comuna: "+comuna);
        System.out.println("Telefono: "+telefono);
        System.out.println("Numero Cuenta: "+numeroCuenta);
    }
}
