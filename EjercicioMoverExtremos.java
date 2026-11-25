public class EjercicioMoverExtremos{

    public static void main(String[] args){
        String palabra = "Chocolate";
        int num = 2;
        String resultado = Mover(palabra, num);
        System.out.println(resultado);
    }

    public static String Mover(String palabra, int num){

        if (num < palabra.length()/2){
            String Inicio = palabra.substring(0, num);
            String Final = palabra.substring(palabra.length()-num, palabra.length());
        
            String resultado = Inicio + Final;
            return resultado;
        }else{
            System.out.println("Ese numero es demasiado grande");
        }

    return "";
    }

}