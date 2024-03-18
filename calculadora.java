import java.util.Scanner;

public class calculadora{

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int eleccion;
            float num1, num2;
            boolean salida = true;
        
        do {

            System.out.println("Bienvenido a su calculadora! Desea: 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir, 5. Salir");
            eleccion = scanner.nextInt();

            System.out.println("Ingrese el primer numero: ");
            num1 = scanner.nextFloat();
            System.out.println("Ingrese el segundo numero: ");
            num2 = scanner.nextFloat();
            
            switch (eleccion) {
                case 1:
                    System.out.println(+ suma(num1, num2));
                    
                    break;

                case 2:
                    System.out.println(+ resta(num1, num2));
                    break;

                case 3:
                    System.out.println(+ multiplicacion(num1, num2));
                    break;

                case 4:
                    System.out.println(+ division(num1, num2));
                    break;

                case 5:
                    salida = false;
                    
                    break;
            
                default:
                    break;
            }
            
        } while (salida);
    }

    public static float suma (float one, float two){
        return one + two;
    }

    public static float resta (float one, float two){
        return one - two;
    }

        public static float multiplicacion (float one, float two){
        return one * two;
    }

    public static float division (float one, float two){
        return one / two;
    }
    
}
    

