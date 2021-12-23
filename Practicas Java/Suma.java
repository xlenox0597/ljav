public class Promedio{
  public static void main(String args[]){

    int matematica = 6;
    int biologia = 7;
    int quimica = 3;
    int promedio = 0;

    promedio = (matematica + biologia + quimica) / 3;

    if (promedio >= 6){
      System.out.println("Aprobó con: " + promedio);
    }
    else{
      System.out.println("Reprobó con: " + promedio);
    }
  }
}