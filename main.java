public class main {
 public static void main(String[] args) {
   int numJugad = 4, i = 1, acierto = 0;;
   int [] arrSorteo = new int [6];
   jugador Jugadores []= new jugador[numJugad];
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
       System.out.print(" "+arrSorteo[j]);
     }
    }
    System.out.println("");
    for(int k = 1;k < Jugadores.length; k++){
      acierto=Sortear.aciertos(Jugadores [k].getBalotas(),arrSorteo);
      switch (acierto){
        case 3:
          System.out.println(Jugadores[k].getName()+" acerto tres cifras");
        break;
        case 4:
          System.out.println(Jugadores[k].getName()+" acerto cuatro cifras");
        break;
        case 5:
          System.out.println(Jugadores[k].getName()+" acerto cinco cifras");
        break;
        case 6:
          System.out.println(Jugadores[k].getName()+" es ganador del premio mayor");
        break;
        default:
          System.out.println(Jugadores[k].getName()+" no tuvo ningun acierto");
      }
    }
  }
 }
