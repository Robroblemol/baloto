public class main {
 public static void main(String[] args) {
   int numJugad = 5, i = 1;
   jugador Jugadores []= new jugador[numJugad];
   menu Menu = new menu ();
   sorteo Sortear = new sorteo();
   //Menu.getName();
   //Jugadores[0].setName("#");
   //System.out.println("el nombre del primer jugador es "+Jugadores[0].getName());

   while(i <= Jugadores.length){
     Jugadores[i]=new jugador(Menu.getName(),Menu.getBalotas());
    // Jugadores[i].setBalotas();
     if(Menu.validarDato(Jugadores[i].getBalotas()))
     i++;
     else
     System.out.println("No se valen numeros repetidos");
   }

  }
 }
