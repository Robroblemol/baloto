public class jugador {
  int [] arrBalotas = new int [6];
  String name = "";
  public void setBalotas(int [] array){
    arrBalotas = array;
  }
  public void setName(String name){
  name = name;
  }
  public  String getName (){
    return name;
  }
  public int [] getBalotas(){
    return arrBalotas;
  }
}
