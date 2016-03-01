import java.lang.Math;
public class sorteo {
  public int [] start (int [] array){
    int i = 0,alet = 0;
    while(i <= array.length){
      alet = (int) Math.random();
      if(alet <= 45 && alet >= 0){
        array[i]=alet;
        i++;
      }
    }
    return array;
  }
}
