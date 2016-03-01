public class jugador {
  private int [] arrBalotas = new int [5];
  private  String name = "";
  private int id = 0;
  public jugador (String name, int [] arrBalotas,int id){
    this.name=name;
    this.arrBalotas=arrBalotas;
    this.id=id;
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
