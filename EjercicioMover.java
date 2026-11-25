public class EjercicioMover{

    public static void main(String[] args){
        String palabra = "Hola";
        String resultado = Mover(palabra);
        System.out.println(resultado);
    }

    public static String Mover(String palabra){
        String caracteres = palabra.substring(0, palabra.length()-2);
        String Sin_Final = palabra.substring( palabra.length()-2, palabra.length());
        String resultado = Sin_Final + caracteres;
        return resultado;
    }

}