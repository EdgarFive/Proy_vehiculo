package vehiculos;

public class Coche extends Vehiculo {

    private int numeropuertas;

    public Coche(String marca, String modelo, int ano, int numeropuertas) {
        super(marca, modelo, ano);
        this.numeropuertas = numeropuertas;
    }

    //======================================


    @Override
    public void mostrardetalles(){
        super.mostrardetalles();
        System.out.println("Número de puertas: "+ numeropuertas);
    }

}
