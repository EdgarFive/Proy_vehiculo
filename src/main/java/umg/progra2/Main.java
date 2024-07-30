package umg.progra2;

import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo coch = new Coche("Toyota","Raw4",1998, 4 );
        Vehiculo mot = new Moto("Honda", "Bla bla", 2010, true);

        System.out.println("=====================\n");
        coch.mostrardetalles();
        System.out.println("\n=====================");

        System.out.println("=====================\n");
        mot.mostrardetalles();
        System.out.println("\n=====================");
    }
}