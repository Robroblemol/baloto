public class main {
 public static void main(String[] args) {
   int numJugad = 7, i = 1;
   jugador Jugadores []= new jugador[numJugad];
   menu Menu = new menu ();
   sorteo Sortear = new sorteo();
  
   while(i < Jugadores.length){
     Jugadores[i]=new jugador(Menu.getName(),Menu.getBalotas(),i);
     if(Menu.validarDato(Jugadores[i].getBalotas()))
     System.out.println("No se valen numeros repetidos");
     else
     i++;
   }

  }
 }
