public class Main {
  String color;
  String marca;
  float ka;
  String feo;

 
  public static void main(String[] args) {
    Main persona1 = new Main();
    persona1.color = "negro";
    persona1.marca = "gris";
    persona1.ka = (float) 1.68;
    persona1.feo = "feo";
   
    System.out.println("el color de piel: " + persona1.color);
    System.out.println("color de cabello: " + persona1.marca);
    System.out.println("altura: " +persona1.ka);
    System.out.println("overall: "+persona1.feo );
     
  Main coche2 = new Main();
    coche2.color = "frotnit";
    coche2.marca = "disparos";
    coche2.ka = 15;
    coche2.feo = "no";
   
    System.out.println("\n nombre d juego: " + coche2.color);
    System.out.println("tipo d juego: " + coche2.marca);
    System.out.println("efepese por segundo: " +coche2.ka);
    System.out.println("activo?: " +coche2.feo);


  Main casa = new Main();

    casa.color = "blanco";
    casa.marca = "terraza";
    casa.ka = 45;
    casa.feo = "si";

    System.out.println("color de casa: "+casa.color);
    System.out.println("contenido extra: "+casa.marca);
    System.out.println("Metros cuadrados: "+casa.ka);
    System.out.println("tiene balcon?: "+casa.feo);

  Main vaca = new Main();

    vaca.color = "blanco";
    vaca.marca = "tiene manchas";
    vaca.ka = (float) 1.75;
    vaca.feo = "si";

    System.out.println("color de vaca: "+vaca.color);
    System.out.println("caracteristicas: "+vaca.marca);
    System.out.println("medida: "+vaca.ka);
    System.out.println("saludable?: "+vaca.feo);

  Main coche = new Main();

    casa.color = "blanco";
    casa.marca = "terraza";
    casa.ka = 45;
    casa.feo = "si";

    System.out.println("color de casa: "+casa.color);
    System.out.println("contenido extra: "+casa.marca);
    System.out.println("Metros cuadrados: "+casa.ka);
    System.out.println("tiene balcon?: "+casa.feo);


   
    System.out.println("Tio puto");
  }
}

