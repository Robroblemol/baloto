import java.util.Scanner;
public class menu {
     Scanner Input = new Scanner(System.in);
  public String getName(){
    String name = "";
    System.out.println("Digite nombre de participante");
    name=Input.next();
    return name;
  }
    int [] array = new int [6];
    public int [] getBalotas(){
    int i = 0;
    while(i <= 6){
        System.out.println("Seleccione numero de balota");
        array [i]=Input.nextInt();
        if(array[i]>=0&&array[i]<=45)
        i++;
        else
        System.out.println("digite un numero entre 0 y 45");
    }
    return array;
  }
  public boolean validarDato(int []array){
    int datoAnt = 0;
    int count = 0;
    for (int i=1; i <= array.length; i++){
      datoAnt = array[i-1];
      if(datoAnt==array[i])
      count++;
    }
    if(count != 0)
    return true;
    else
    return false;
  }
}
