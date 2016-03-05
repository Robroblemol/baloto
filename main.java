  public class main {
 public static void main(String[] args) {
   int numJugad = 6, i = 1, acierto = 0;;
   int [] arrSorteo = new int [6];
   int [] arrSorteoP ={1,2,3,4,5,6};//array para pruebas de ganador
   jugador [] Jugadores = new jugador[numJugad];
   menu Menu = new menu ();
   sorteo Sortear = new sorteo();

   while(i < Jugadores.length){
     Jugadores[i]=new jugador(Menu.getName(i),Menu.getBalotas(),i);
     if(Menu.validarDato(Jugadores[i].getBalotas()))
     System.out.println("No se valen numeros repetidos");
     else
     i++;
   }
   if(Menu.iniciarSorteo()){
     System.out.println("Los número ganadores son ");
     arrSorteo=Sortear.start(arrSorteo);
     for (int j=0; j <arrSorteo.length; j++){
       System.out.print(" "+arrSorteoP[j]);
     }
    }
    System.out.println("");
    String resultado;
    for(int k = 1;k < Jugadores.length; k++){
      acierto=Sortear.aciertos(Jugadores [k].getBalotas(),arrSorteoP);
      resultado=Sortear.mostrarGanadores(acierto);
     System.out.println(Jugadores[k].getName()+resultado);
    }
  }
 }
