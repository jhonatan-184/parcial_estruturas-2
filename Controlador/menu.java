package Controlador;



import Modelo.ObjOpe;
import Vista.metodos;
import java.util.Scanner;
import java.util.Stack;
public class menu{
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<ObjOpe> o = new Stack<>();
    metodos m = new metodos(); 
    boolean cont = true;
    while (cont){
        System.out.println("Bienvenido al menu de operaciones");
            System.out.println("Seleccione una opcion");
         System.out.println("1- ingrese el numero de la operacion, el tipo, el valor y la fecha de la operacion");
            System.out.println("2- Retirar la ultima operacion registrada");
            System.out.println("3- Consultar la ultima operacion registrada");
            System.out.println("4- Mostrar todas las operaciones registradas");
            System.out.println("5- Salir");
            int opt = sc.nextInt();
        switch (opt){
            case 1:
                    m.ResgistrarOpera(o, sc);
                    break;
                case 2:
                    m.EliminarUltimaOpe(o, sc);
                    break;
                case 3:
                    m.ConsultarUltima(o, sc);
                    break;
                case 4:
                    m.Mostraroperaciones(o, sc);
                    break;
                case 5:
                    cont=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
        }

    }
   }

}
