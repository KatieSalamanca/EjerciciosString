public class EjercicioBuscarCode{

    public static void main(String[] args){
        int contador = 0;
        String palabra = "codeco&e";
        int resultado = buscar(contador, palabra);
        System.out.println(resultado);
    }

    public static int buscar(int contador, String palabra){
        for (int i = 0; i < palabra.length()-3; i++){
            if (palabra.charAt(i) == 'c' && palabra.charAt(i+1) == 'o' && palabra.charAt(i+3) == 'e' ){
                contador++;
            }
        }
        return contador;
    }
}