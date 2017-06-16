/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Luan Junior
 */
public class Validation {
    /* Esse método é responsável por substituir a
       vírgula por ponto, caso o usuári digite errado. */ 
    public static String converterVirgulaPonto(String c){
        return c.replaceAll(",", ".");
    }
    
    //Coloca todas Strings em caixa baixa
    public static String converterTudoMin(String c){
        return c.toLowerCase();
    }
    
    //Coloca todas Strings em caixa alta
    public static String converterTudoMai(String c){
        return c.toUpperCase();
    }
    
    /* Método que verifica se o usuário digitou apenas
       letras maiúsculas ou minúsculas. 
       No mínimo 2 e no máximo 50 caracteres. */
    public static boolean verificarTexto(String c){
        return c.matches("^[a-zA-ZáÁéÉíÍóÓúÚçÇãÃõÕ ]{2,50}$");
    }
    public static boolean validarMsg(String c){
        return c.matches("^[a-zA-ZáÁéÉíÍóÓúÚçÇãÃõÕ0-9.-_?@!#$%¨&*()+= ]{2,240}$");
    }
    
    /* Método que verifica se o usuário digitou apenas
       número de 0 a 9 com no mínimo 1 e no máximo 6 dígitos. */
    public static boolean verificarNumeros(String c){
        return c.matches("^[0-9]{1,6}$");
    }
    /* Método que verifica se o email digitado pelo usuário 
    é valido ou não.  */
    public static boolean verificarEmailSilples(String c){
        return c.matches("\\w+@\\w+\\.\\w{2,3}");
    }
    /* Método que verifica se o email digitado pelo usuário 
    é valido ou não.  */
    public static boolean verificarEmail(String c){
        return c.matches("^[a-z0-9-_.]{3,20}@(hotmail.com|hotmail.com.br|outlook.com|outlook.com.br|gmail.com|yahoo.com|yahoo.com.br|terra.com|terra.com.br|bol.com|bol.com.br)$");
    }
    /* Método que verifica se a senha digitada pelo usuário 
    é valido ou não.  */
    public static boolean validarSenhaSimples(String c){
        return c.matches("^[a-zA-ZáÁéÉíÍóÓúÚçÇãÃõÕ0-9]{2,50}$");
    }
    /* Método que verifica se o nome digitado pelo usuário 
    é valido ou não.  */
    public static boolean validarNome(String c){
        return c.matches("^[a-zA-ZáÁéÉíÍóÓúÚçÇãÃõÕ]{2,50}$");
    }
    /* Método que verifica se o telefone digitado pelo usuário 
    é valido ou não.  */
    public static boolean validarTelefone(String c){
        return c.matches("^[0-9]{6,7}-[0-9]{4}$");
    }
    /* Método que verifica se a data digitada pelo usuário 
    é valido ou não.  */
    public static boolean validarData(String c){
        return c.matches("^(01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31){1}/(01|02|03|04|05|06|07|08|09|10|11|12){1}/(1998|1997|1996|1995|1994|1993|1992|1991|1990|1989|1988|1987|1986|1985|1984|1983|1982|1981|1980|1979|1978|1977|1976|1975|1974|1973|1972|1971|1970|1969|1968|1967|1966|1965|1964|1963|1962|1961|1960|1968|1967|1966|1965|1964|1963|1962|1961|1960|1959|1958|1957|1959|1958|1957|1956|1955|1954|1953|1952|1951|1950|1949|1948|1947|1946|1945|1944|1943|1942|1941|1940|1939|1938|1937|1936|1935|1934|1933|1932|1931|1930|1929|1928|1927|1926|1925|1924|1923|1922|1921|1920|1919|1918|1917|1916|1915|1914|1913|1912|1911|1910){1}$");
    }
    
     public static boolean validarCEP(String c){
        return c.matches("^[0-9]{5}-[0-9]{3}$");
    }
}
