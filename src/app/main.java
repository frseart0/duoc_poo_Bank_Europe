package app;

import modelo.cliente.Cliente;
import modelo.cuenta.CuentaBancaria;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        Cliente C1 = new Cliente(   "20123456-2",
                                    "Francisco",
                                    "Arellano",
                                    "Toledo",
                                    "Maipu",
                                    "Santiago",
                                    955443322,
                                    123456789);
        clientes.add(C1);

        C1.mostrarInformacionCliente();
    }
}