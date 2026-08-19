public class ValidadorDeSenha{
    public static boolean temTamanhoMinimo(String senha){
        return senha.length() >= 8;
    }
    public static boolean temNumero(String senha) {//definir como boolean para ter a opção de verificar
        for (int i = 0; i < senha.length(); i++) {//procura pela extensão da var 'senha'
            if (Character.isDigit(senha.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean temLetraMaiuscula(String senha) {
        for (int i = 0; i < senha.length(); i++){
            if (Character.isUpperCase(senha.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean temCharEspecial(String senha) {
        for (int i = 0; i < senha.length(); i++){
            char caractere = senha.charAt(i);
            if(!Character.isLetterOrDigit(caractere)){// aqui fiz diferente dos outros pois ele está buscando diferenciar, não verificar somente se tem
                return true;
            }
        }
        return false;
    }
    public static String avaliarForca(String senha){
        int pontos = 0;
        if (temTamanhoMinimo(senha)) {
            pontos++;
        }

        if (temNumero(senha)) {
            pontos++;
        }

        if (temLetraMaiuscula(senha)) {
            pontos++;
        }

        if (temCharEspecial(senha)) {
            pontos++;
        }

        if (pontos <= 1) {
            return "Senha fraca";
        } else if (pontos == 2 || pontos == 3) {
            return "Senha média";
        } else {
            return "Senha forte";
        }
    }
}