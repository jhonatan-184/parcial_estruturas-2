
 
import java.util.Scanner;
import java.util.Stack;


public class metodos {
    public Stack<ObjOpe>ResgistrarOpera(Stack<ObjOpe> o, Scanner sc) {
        boolean cont = true;
        while (cont) {
            ObjOpe r = new ObjOpe();
            System.out.println("ingrese el numero para la operacion");
            int numero = Integer.parseInt(sc.nextLine());
            r.setNumeroOperacion(numero);
            System.out.println("ingrese el tipo de operación");
            r.setTipo(sc.nextLine());
            System.out.println("ingrese el valor de la operacion");
            int valor = Integer.parseInt(sc.nextLine());
            r.setValor(valor);
            System.out.println("ingrese la fecha de la operacion");
            r.setFecha(sc.nextLine());

            o.push(r);
            System.out.println("desea continuar registrando operaciones 1) si 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                cont = false;
            }

        }
        return o;
    }

    public Stack<ObjOpe> EliminarUltimaOpe(Stack<ObjOpe> o, Scanner sc) {
        if (!o.isEmpty()) {
            ObjOpe r = o.pop();
            System.out.println("los datos a eliminar de la ultima operacion son: ");
            System.out.println("El numero de la operacion que fue eliminado es: " + r.getNumeroOperacion());
            System.out.println("El tipo de operacion eliminada es: " + r.getTipo());
            System.out.println("El valora eliminar es: " + r.getValor());
            System.out.println("la fecha de esta operacion es: " + r.getFecha());

        } else {
            System.out.println("No hay datos para eliminar");
        }

        return o;
    }

    public Stack<ObjOpe> ConsultarUltima(Stack<ObjOpe> o, Scanner sc) {
        if (!o.isEmpty()) {
            ObjOpe r = o.peek();
            System.out.println("El numero de la operacion es: " + r.getNumeroOperacion());
            System.out.println("El tipo de la operacion es: " + r.getTipo());
            System.out.println("El valor es: " + r.getValor());
            System.out.println("La fecha de la operacion es: " + r.getFecha());
        } else {
            System.out.println("No hay datos");
            return o;
        }

        return o;

    }

    public Stack<ObjOpe> Mostraroperaciones(Stack<ObjOpe> o, Scanner sc) {
        Stack<ObjOpe> aux = new Stack<>();
        while (!o.isEmpty()) {
            ObjOpe r = o.pop();

            System.out.println("El numero de la operacion es: " + r.getNumeroOperacion());
            System.out.println("El tipo es: " + r.getTipo());
            System.out.println("El valor es: " + r.getValor());
            System.out.println("La fecha de la operacion es: " + r.getFecha());

            aux.push(r);
        }
        System.out.println("----------------------------------------\n");

        while (!aux.isEmpty()) {
            o.push(aux.pop());
        }
        return o;
    }

}
