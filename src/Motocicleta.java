public class Motocicleta extends Vehiculo{
    private String cilindrada;

    public Motocicleta(String marca, String modelo, String ano, double precioBase, String cilindrada) {
        super(marca, modelo, ano, precioBase);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", precioBase=" + precioBase +
                "cilindrada='" + cilindrada + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Tipo de vehiculo: Motocicleta");
        System.out.println("-----------------------------");
        System.out.println("Cilindrada: " + cilindrada);
        super.mostrarInfo();
        super.calcularPrecioFinal();
    }
}
