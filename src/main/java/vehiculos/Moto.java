package vehiculos;

public class Moto extends Vehiculo {

    private boolean tienesidecar;

    public Moto(String marca, String modelo, int ano, boolean tienesidecar) {
        super(marca, modelo, ano);
        this.tienesidecar = tienesidecar;
    }

    @Override
    public void mostrardetalles(){
        super.mostrardetalles();
        System.out.println("Sidecar: " + tienesidecar);
    }

}






