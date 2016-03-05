import java.lang.Math;
public class sorteo {
  public int [] start (int [] array){
    boolean frepetido = false;
    int i = 0, alet = 0;
    while(i < array.length){
      alet = (int) (Math.random()*45+0);//para generar numero entero aletorio de 45 a 0
      //System.out.println("numero generado "+alet);
        for(int j = 0; j <= i;j++){
          if(array[j] == alet)
          frepetido=true;
          }
        if(frepetido == false){
          array[i]=alet;
          i++;
          }
        else frepetido = false;
    }
    return array;
  }
  public int aciertos(int [] arrayj, int [] arrSorteo){
    int aciertos = 0;
      for(int i = 0; i<arrSorteo.length; i++){
        for(int j = 0; j<arrSorteo.length; j++){
          if(arrayj [i] == arrSorteo [j]){
            aciertos++;
              //System.out.println("arrayj "+arrayj[i]);// para pruebas
          }
        }
      }
    return aciertos;
  }
  public String mostrarGanadores(int acierto){
    String resultado;
    switch (acierto){
      case 1:
        resultado = " Solo un acierto!!";
          break;
      case 2:
        resultado = " acerto dos cifras no hay premio";
          break;
      case 3:
        resultado = " acerto tres cifras";
          break;
      case 4:
        resultado = " acerto cuatro cifras";
          break;
      case 5:
        resultado = " acerto cinco cifras";
          break;
      case 6:
        resultado = " es ganador del premio mayor";
          break;
      default:
        resultado = " no tuvo ningun acierto";
          break;
    }
    return resultado;
  }
}
