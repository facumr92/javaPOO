
import java.util.*;
// Clase celular
class celular {
    // Atributos (características)

    String marca;
    String modelo;
    int anio;
    int camara;

    // Constructor (para crear un celular con  todos sus datos)
    public celular(String marca, String modelo, int anio, int camara) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.camara= camara;
    }

    // Método llamar
    public void llamar() {

     /*    if(bateria<=5){

            System.out.println("No tienes suficiente bateria!");
        }else*/ 
        System.out.println(" llamando por celular desde mi..."+ modelo);
    }



    // Método para mostrar información del celular
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", modelo: " + modelo + "año: " + anio+ "tiene de camara: "+ camara+"mpx");
    }

    public void enviarMsj(){
        System.out.println("Enviando mensaje desde tu: "+ modelo );
    }



    public static celular crearCelu(){


        Scanner dato= new Scanner(System.in);


        System.out.println("Que marca es su celular?");
        String marca= dato.nextLine();

        System.out.println("Modelo?");
        String modelo= dato.nextLine();

        System.out.println("Año?");
        int anio= dato.nextInt();

        System.out.println("Cuanto de camara?(mpx):");
        int camara= dato.nextInt();

        return new celular(marca, modelo, anio, camara);

      
    }

    public static void main(String[] args) {

        // Crear un objeto de la clase Celular 




        // celular micCelular = new celular("Apple", "Iphone X", 2020, 3);


        celular  micCelular =  celular.crearCelu();

        // Llamar a métodos del objeto
        
        micCelular.mostrarInfo();
        micCelular.llamar();
        micCelular.enviarMsj();
}
}
