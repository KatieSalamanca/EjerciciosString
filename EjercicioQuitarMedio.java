public class EjercicioQuitarMedio{

    public static void main(String[] args){
        String palabra = "Hola";
        String resultado = QuitarMedio(palabra);
        System.out.println(resultado);
    }

    public static String QuitarMedio(String palabra){

        String test = 1,2;
        String SinMedio = palabra.substring(test);
        String resultado = SinMedio;
        return resultado;
    }

}