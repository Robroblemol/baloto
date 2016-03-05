import java.util.Scanner;
public class menu {
     Scanner Input = new Scanner(System.in);
  public String getName(int id){
    String name = "";
    System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<");
    System.out.print(" Digite nombre de participante "+id+" ");
    name=Input.next();
    return name;
  }
    public int [] getBalotas(){
    int [] array = new int [6];  //no olvidar meter todos los parametros
                                 //dentro de la funcion sino son publicos
    int i = 0;
    while(i < 6){
        System.out.println("Seleccione numero de balota "+(i+1));
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
    for (int i=1; i < array.length; i++){
      datoAnt = array[i-1];
      if(datoAnt==array[i])
      count++;
    }
    if(count != 0)
    return true;
    else
    return false;
  }
  public boolean iniciarSorteo(){
    int tecla = 0;
     Scanner waitForKeypress = new Scanner(System.in);
     System.out.print("Presiona la tecla Enter para iniciar sorteo");
     waitForKeypress.nextLine();
    return true;
  }
}
