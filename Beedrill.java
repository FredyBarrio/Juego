
public class Beedrill extends personajes {
  private  String Nombre="Beedrill";

public  String getNombre() {
    return Nombre;
  }

  public  void setNombre(String nombre) {
    Nombre = nombre;
  }

private  int PS=75;
public  int getPS() {
  return PS;
}

public  void setPS(int pS) {
  PS = pS;
}

private  int Ataque=120;
public  int getAtaque() {
  return Ataque;
}

public  void setAtaque(int ataque) {
  Ataque = ataque;
}

private  int Defensa=55;
public  int getDefensa() {
  return Defensa;
}

public  void setDefensa(int defensa) {
  Defensa = defensa;
}

private  int Velocidad=115;

public  int getVelocidad() {
  return Velocidad;
}

public  void setVelocidad(int velocidad) {
  Velocidad = velocidad;
}

public static void Estadisticas(){
    System.out.println("La estadisticas de beedrill son:");
    System.out.println("Ps: 75 " + " Ataque: 120");
    System.out.println("Defensa: 55 " + " Velocidad: 115");
    System.out.println("");



   }
 }



