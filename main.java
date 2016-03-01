public class main {
 public static void main(String[] args) {
   int numJugad = 7, i = 1;
   int [] arrSorteo = new int [6];
   jugador Jugadores []= new jugador[numJugad];
   menu Menu = new menu ();
   sorteo Sortear = new sorteo();

   /*while(i < Jugadores.length){
     Jugadores[i]=new jugador(Menu.getName(i),Menu.getBalotas(),i);
     if(Menu.validarDato(Jugadores[i].getBalotas()))
     System.out.println("No se valen numeros repetidos");
     else
     i++;
   }*/
   System.out.println("los número ganadores son ");
   arrSorteo=Sortear.start(arrSorteo);
   for (int j=0; j <arrSorteo.length; j++){
     System.out.print(" "+arrSorteo[j]);
   }

  }
 }
