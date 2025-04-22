
// Clase celular
class celular {
    // Atributos (características)

    String marca;
    String modelo;
    int anio;
    int bateria;

    // Constructor (para crear un celular con  todos sus datos)
    public celular(String marca, String modelo, int anio, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.bateria= bateria;
    }

    // Método llamar
    public void llamar() {

        if(bateria<=5){

            System.out.println("No tienes suficiente bateria!");
        }else
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

        celular micCelular = new celular("Apple", "Iphone X", 2020, 3);

        // Llamar a métodos del objeto
        
        micCelular.mostrarInfo();
        micCelular.llamar();
        micCelular.enviarMsj();
}
}
