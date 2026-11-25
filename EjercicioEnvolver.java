public class EjercicioEnvolver{


    public static void main(String[] args){
        String caracteres = "<<>>";
        String palabra = "Hola";
        String resultado = envolverPalabra(caracteres, palabra);
        System.out.println(resultado);
    }

    public static String envolverPalabra(String caracteres,  String palabra){
        String frontal = caracteres.substring(0,2);
        String detras = caracteres.substring(2,4);
        String resultado = frontal + palabra + detras;
        return resultado;
    }

}