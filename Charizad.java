public class Charizad extends personajes {
   String Nombre ="Charizad";
   public  String getNombre() {
      return Nombre;
   }

   public  void setNombre(String nombre) {
      Nombre = nombre;
   }

   private  int PS=118;
   public  int getPS() {
      return PS;
   }

   public  void setPS(int pS) {
      PS = pS;
   }

   private  int Ataque=104;
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

   private  int Velocidad=100;	
    
   public  int getVelocidad() {
      return Velocidad;
   }

   public  void setVelocidad(int velocidad) {
      Velocidad = velocidad;
   }


   public static void Estadisticas(){
    System.out.println("La estadisticas de Charizar son:");
    System.out.println("Ps: 118 "+ "  Ataque: 104 ");
    System.out.println("Defensa: 80 "+ "  Velocidad: 100");
    System.out.println("");
   } 
 
    
}
