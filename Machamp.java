public class Machamp extends personajes {
    private  String Nombre="Machamp";
public  String getNombre() {
        return Nombre;
    }

    public  void setNombre(String nombre) {
        Nombre = nombre;
    }

private  int PS=90;
public  int getPS() {
    return PS;
}

public  void setPS(int pS) {
    PS = pS;
}

private  int Ataque=130;
public  int getAtaque() {
    return Ataque;
}

public  void setAtaque(int ataque) {
    Ataque = ataque;
}

private  int Defensa=80;
public  int getDefensa() {
    return Defensa;
}

public  void setDefensa(int defensa) {
    Defensa = defensa;
}

private  int Velocidad=55;

public  int getVelocidad() {
    return Velocidad;
}

public  void setVelocidad(int velocidad) {
    Velocidad = velocidad;
}

public static void Estadisticas(){
    System.out.println("La estadisticas de Machamp son:");
    System.out.println("Ps: 90 " + " Ataque: 130");
    System.out.println("Defensa: 80 " + "  Velocidad: 55");
    System.out.println("");
    

}
}