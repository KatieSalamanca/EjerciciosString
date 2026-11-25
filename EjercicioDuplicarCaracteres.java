public class EjercicioDuplicarCaracteres{

    public static void main(String[] args){
        String palabra = "Hola";
        String duplicado = "";
        String resultado = Duplicar(palabra,duplicado);
        System.out.println(resultado);
    }

    public static String Duplicar(String palabra, String duplicado){
        for (int i = 0; i < palabra.length(); i++){
            duplicado += "" + palabra.charAt(i) + palabra.charAt(i);
        }
        return duplicado;
    }

}