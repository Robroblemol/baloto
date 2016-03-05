public class jugador {
  private int [] array = new int [5];
  private String name = "";
  private int id = 0;
  public jugador (String name, int [] array,int id){
    this.name=name;
    this.array=array;
    this.id=id;
  }
  public void setBalotas(int [] array){
    this.array = array;
  }
  public void setName(String name){
  this.name = name;
  }
  public  String getName (){
    return name;
  }
  public int [] getBalotas(){
    return array;
  }
}
