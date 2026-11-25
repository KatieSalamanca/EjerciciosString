public class EjercicioQuitarExtremos{

    public static void main(String[] args){
        String palabra = "Hola";
        String resultado = QuitarExtremos(palabra);
        System.out.println(resultado);
    }

    public static String QuitarExtremos(String palabra){
        return palabra.substring(1,palabra.length()-1);
    }

}