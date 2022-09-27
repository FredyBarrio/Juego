public class Gyarados extends personajes {
    private  String Nombre="Gyarados";
   public  String getNombre() {
        return Nombre;
    }

    public  void setNombre(String nombre) {
        Nombre = nombre;
    }

private  int PS=98; 
   public  int getPS() {
    return PS;
}

public  void setPS(int pS) {
    PS = pS;
}

private int Ataque=125; 
   public  int getAtaque() {
    return Ataque;
}

public  void setAtaque(int ataque) {
    Ataque = ataque;
}

private  int Defensa=79;
   public  int getDefensa() {
    return Defensa;
}

public  void setDefensa(int defensa) {
    Defensa = defensa;
}

private  int Velocidad=81;

    public  int getVelocidad() {
    return Velocidad;
}

public  void setVelocidad(int velocidad) {
    Velocidad = velocidad;
}

    public static void Estadisticas(){
        System.out.println("La estadisticas de Gyarados son:");
        System.out.println("Ps: 98 "+ "  Ataque: 125");
        System.out.println("Defensa: 79 "+ "  Velocidad: 81");
        System.out.println("");
       } 
    
}
