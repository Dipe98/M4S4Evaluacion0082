public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private boolean encendido;

    public Auto(String marca, String modelo, String color, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        encendido = false;

    }
    //Getters
    public boolean isEncendido() {
        return encendido;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //METODOS
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El auto ha sido encendido.");
        } else {
            System.out.println("El auto ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El auto ha sido apagado.");
        } else {
            System.out.println("El auto ya está apagado.");
        }
    }

    public void acelerar() {
        if (encendido) {
            System.out.println("El auto está acelerando.");
        } else {
            System.out.println("No se puede acelerar. El auto está apagado.");
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", encendido=" + encendido +
                '}';
    }
}
