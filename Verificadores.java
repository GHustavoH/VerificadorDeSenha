public class Verificadores{

    public String Senha;

    public Verificadores(String Senha){
        this.Senha = Senha;
    }

    public boolean VerificadorTamanho(){

        if(Senha.length() >= 8 && Senha.length() <= 30){
            return true;
        }
        return false;
    }

    public boolean VerificadorMaiuscula(){

        for (int i = 0;i < Senha.length();i++){
            if(Character.isUpperCase(Senha.charAt(i))) {
                return true;
            }
        }
        return false;

    }

    public boolean VerificadorMinuscula(){

        for (int i = 0;i < Senha.length();i++){
            if(Character.isLowerCase(Senha.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean VerificadorNumero(){
        for (int i = 0;i < Senha.length();i++){
            if(Character.isDigit(Senha.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean VerificadorNumeroEspecial(){
        for (int i = 0;i < Senha.length();i++){
            if(!Character.isLetterOrDigit(Senha.charAt(i))) {
                if(!Character.isWhitespace(Senha.charAt(i))){
                    return true;
                }

            }
        }
        return false;
    }


    public boolean VerificadorEspaco(){
        for (int i = 0;i < Senha.length();i++){
            if(Character.isWhitespace(Senha.charAt(i))) {
                return true;
            }
        }
        return false;
    }


























}