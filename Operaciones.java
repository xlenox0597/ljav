public class Operaciones{
  public static void main(String args[]){

    int operacion = 3;
    int numeroUno = 30;
    int numeroDos = 12;
    int resultado = 0;

    if(operacion == 1 ){
      resultado = numeroUno + numeroDos;
      System.out.println("La suma es: " + resultado);
    }
    else if (operacion == 2){
      resultado = numeroUno - numeroDos;
      System.out.println("La resta es: " + resultado);
    }
    else if(operacion == 3){
      resultado = numeroUno * numeroDos;
      System.out.println("La multiplicacion es: " + resultado);
    }
    else if(operacion == 4){
      resultado = numeroUno / numeroDos;
      System.out.println("La division es: " + resultado);
    }
    else{
      System.out.println("El resultado no coincide. ");
    }
  }
}