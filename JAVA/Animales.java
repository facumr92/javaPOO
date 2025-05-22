public class Animales {

    protected String nombre;
    protected int edad;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }


    public static class Perro extends Animales {
        private String raza;

        public Perro(String nombre, int edad, String raza) {
            super(nombre, edad);
            this.raza = raza;
        }

        @Override
        public void hacerSonido() {
            System.out.println("El perro ladra: ¡Guau!");
        }

        public void mostrarRaza() {
            System.out.println("Raza: " + raza);
        }
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro("Firulais", 5, "Salchicha");
        miPerro.mostrarInfo();
        miPerro.hacerSonido();
        miPerro.mostrarRaza();
    }
}
