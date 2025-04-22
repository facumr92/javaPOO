
// Clase celular
class celular {
    // Atributos (características)

    String marca;
    String modelo;
    int anio;

    // Constructor (para crear un celular con  todos sus datos)
    public celular(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Método llamar
    public void llamar() {
        System.out.println(" llamando por celular desde mi..."+ modelo);
    }

    // Método para mostrar información del celular
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", modelo: " + modelo + "año:" + anio);
    }

    public void enviarMsj(){
        System.out.println("Enviando mensaje desde tu: "+ modelo );
    }



    public static void main(String[] args) {

        // Crear un objeto de la clase Celular 

        celular micCelular = new celular("Apple", "Iphone X", 2020);

        // Llamar a métodos del objeto
        
        micCelular.mostrarInfo();
        micCelular.llamar();
        micCelular.enviarMsj();
}
}
