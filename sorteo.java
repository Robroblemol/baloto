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
}
