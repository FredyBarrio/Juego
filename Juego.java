import java.util.Scanner;
public class Juego {
    
    public static void main(String[] args) {
        
        personajes jugador1=null;
        personajes jugador2=null;
     Scanner leer=new Scanner(System.in);
     int resp,opc;
     do{
     System.out.println("Juego de pelea, bienvenido jugador 1");
    System.out.println("1. Ver Pokemones");
    System.out.println("2. Seleccionar");
        resp=leer.nextInt();
    switch(resp){
        case 1:
        Charizad.Estadisticas();
        Gyarados.Estadisticas();
        Beedrill.Estadisticas();
        Machamp.Estadisticas();
        break;
        case 2:
        System.out.println("Escoja Pokemon");
        System.out.println("1. Charizad");
        System.out.println("2. Gyarados");
        System.out.println("3. Beedrill");
        System.out.println("4. Machamp");

        opc=leer.nextInt();
        if(opc==1){
           
        jugador1=new Charizad();
        jugador1.Nombre="Charizad";
         jugador1.PS=118;
        jugador1.Ataque=104;
        jugador1.Defensa=80;
        jugador1.Velocidad=100;
        }else if(opc==2){
            jugador1=new Gyarados();
            jugador1.Nombre="Gyarados";
            jugador1.PS=98; 
            jugador1.Ataque=125; 
            jugador1.Defensa=79;
            jugador1.Velocidad=81;
        }else if(opc==3){
           jugador1=new Beedrill();
           jugador1.Nombre="Beedrill";
            jugador1.PS=75; 
                jugador1.Ataque=120; 
                jugador1.Defensa=55;
                jugador1.Velocidad=115;
        }else if(opc==4){
            jugador1=new Machamp();
            jugador1.Nombre="Machamp";
            jugador1.PS=90; 
            jugador1.Ataque=130; 
            jugador1.Defensa=80;
            jugador1.Velocidad=55;
        }
       
        break;
        
        default:
        System.out.println("opcion incorrecta");
        break;
    }
    }while(resp!=2);
     
    leer.next();
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    do{
        System.out.println("Juego de pelea, bienvenido jugador 2");
       System.out.println("1. Ver Pokemone");
       System.out.println("2. Seleccionar");
       
           resp=leer.nextInt();
       switch(resp){
           case 1:
           Charizad.Estadisticas();
           Gyarados.Estadisticas();
           Beedrill.Estadisticas();
           Machamp.Estadisticas();
           break;
           case 2:
           System.out.println("Escoja Pokemon");
           System.out.println("1. Charizad");
           System.out.println("2. Gyarados");
           System.out.println("3. Beedrill");
          System.out.println("4. Machamp");
           opc=leer.nextInt();
           opc=leer.nextInt();
           if(opc==1){
            jugador2=new Charizad();
            jugador2.Nombre="Charizad";
            jugador2.PS=118; 
            jugador2.Ataque=104; 
            jugador2.Defensa=80;
            jugador2.Velocidad=100;
           }else if(opc==2){
            
            jugador2=new Gyarados();
            jugador2.Nombre="Gyarados";
            jugador2.PS=98; 
           jugador2.Ataque=125; 
           jugador2.Defensa=79;
           jugador2.Velocidad=81;
           }else if(opc==3){
                jugador2=new Beedrill();
                jugador2.Nombre="Beedrill";
                jugador2.PS=75; 
                jugador2.Ataque=125; 
                jugador2.Defensa=55;
                jugador2.Velocidad=115;
           }else if(opc==4){
               jugador2=new Machamp();
               jugador2.Nombre="Machamp";
               jugador2.PS=90; 
               jugador2.Ataque=130; 
               jugador2.Defensa=80;
               jugador2.Velocidad=55;
           }
           
           break;
           
           default:
           System.out.println("opcion incorrecta");
       }
       }while(resp!=2);
       
       if (jugador1.Velocidad>jugador2.Velocidad) {
      do{
        System.out.println("presione enter");
        leer.nextLine();
       atacar2(jugador2, jugador1);
       System.out.println("");
       
       
        
       }while (jugador1.PS>=0 && jugador2.PS>=0); {
        if(jugador1.PS<=0){
        System.out.println("Pokemon de Jugador 1 se debilito ");
        System.out.println("Jugador 2 Gana la Batalla ");
        }else{
        System.out.println("Pokemon de Jugador 2 se debilito ");
        System.out.println("Jugador 1 Gana la Batalla ");
        }
    }
       }else if (jugador2.Velocidad>jugador1.Velocidad){
        do{
        System.out.println("presione enter");
        leer.nextLine();
       atacar(jugador1,jugador2);
       System.out.println("");
      
        
        
       }while (jugador1.PS>=0 && jugador2.PS>=0); {
        if(jugador1.PS<=0){
        System.out.println("Pokemon de Jugador 1 se debilito ");
        System.out.println("Jugador 2 Gana la Batalla ");
        }else{
        System.out.println("Pokemon de Jugador 2 se debilito ");
        System.out.println("Jugador 1 Gana la Batalla ");
       
    }
    }
    }

    }
    static void atacar(personajes jugador1, personajes jugador2){
        int Daño = jugador2.Ataque-jugador1.Defensa;
        jugador1.PS=jugador1.PS-Daño;
            System.out.println (jugador2.Nombre+" del jugador 2 ataca "+jugador2.Ataque);
			System.out.println (jugador1.Nombre+" del jugador 1 recibio "+Daño+" de daño"); 
			System.out.println ("resto de ps de "+jugador1.Nombre+" son " +jugador1.PS ); 
            System.out.println("");
            int Daño2 = jugador1.Ataque-jugador2.Defensa;
        jugador2.PS=jugador2.PS-Daño2;
            System.out.println (jugador1.Nombre+" del jugador 1 ataca "+jugador1.Ataque);
            System.out.println (jugador2.Nombre+ " del Jugador 2 recibio "+Daño2+" de daño"); 
            System.out.println ("resto de ps de "+jugador2.Nombre+" Son " +jugador2.PS );          
            System.out.println("");
    }   
    static void atacar2(personajes jugador2, personajes jugador1){
        
        int Daño2 = jugador1.Ataque-jugador2.Defensa;
        jugador2.PS=jugador2.PS-Daño2;
        System.out.println (jugador1.Nombre+" del jugador 1 ataca "+jugador1.Ataque);
        System.out.println (jugador2.Nombre+ " del Jugador 2 recibio "+Daño2+" de daño"); 
        System.out.println ("resto de ps de "+jugador2.Nombre+" son " +jugador2.PS );          
        System.out.println("");
        
        int Daño = jugador2.Ataque-jugador1.Defensa;
        jugador1.PS=jugador1.PS-Daño;
        System.out.println (jugador2.Nombre+" del jugador 2 ataca "+jugador2.Ataque);
        System.out.println (jugador1.Nombre+" del jugador 1 recibio "+Daño+" de daño"); 
        System.out.println ("resto de ps de "+jugador1.Nombre+ " son " +jugador1.PS ); 
        System.out.println("");
}
}
        
