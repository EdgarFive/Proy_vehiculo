package umg.progra2;

import conductores.Conductor;
import conductores.ConductorDeMoto;
import conductores.CondutorDeCoche;
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

        System.out.println("\n===================== Area de Trabajo de la clase agregada =====================\n");

        Conductor con_c = new CondutorDeCoche("Alex", "A59104667", 5);
        Conductor con_m = new ConductorDeMoto("Manuel", "B59104667", true);

        System.out.println("=====================\n");
        con_c.mostrarinformacion();
        System.out.println("\n=====================");

        System.out.println("=====================\n");
        con_m.mostrarinformacion();
        System.out.println("\n=====================");

    }
}