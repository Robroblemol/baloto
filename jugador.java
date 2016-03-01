public class jugador {
  private int [] arrBalotas = new int [6];
  private  String name = "";
  public jugador (String name, int [] arrBalotas){
    this.name=name;
    this.arrBalotas=arrBalotas;
  }
  public void setBalotas(int [] array){
    arrBalotas = array;
  }
  public void setName(String name){
  this.name = name;
  }
  public  String getName (){
    return name;
  }
  public int [] getBalotas(){
    return arrBalotas;
  }
}
