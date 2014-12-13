public class FuncionesString {

    public void metodosCadena(String cadena) {
        //Longitud de una cadena (length mide el tamaño de la cadena)
        System.out.println(cadena.length());

        //Caracter en la ultima posicion
        System.out.println(cadena.charAt(cadena.length() - 1));

        //Contar cuantos caracteres 'o' hay      
        System.out.println(contarCaracteres(cadena, 'a')+contarCaracteres(cadena, 'A')); //hace el recorrido para mayusculas y minisculas
        System.out.println("letras minusculas \t"+contarCaracteres(cadena, 'a'));
        System.out.println("letras mayusculas................\t"+contarCaracteres(cadena, 'A'));
        System.out.println("Total de los valores\t"+(contarCaracteres(cadena, 'a')+contarCaracteres(cadena, 'A')));
        System.out.println("Total valores Mayusculas y MInusculas en una sola linea\t"+(contarCaracteresMayusculasoMinusculas(cadena, 'a')));
    }

    public int contarCaracteres(String cad, char car) {
        int can = 0;
        int cont = 0;
        while (cont < cad.length()) {           
            if (cad.charAt(cont) == car ) {
                can++;
            }
            cont++;
        }
         //can=(cad.charAt(cont)==car)?++can:can; // ciclo if     
        return can;
    }
    public int contarCaracteresMayusculasoMinusculas(String cad, char car) {
        int can = 0,cont = 0;   
        car=(car+" ").toUpperCase().charAt(0); // 'car+""' transforma un caracter a string //toUpperCase transforma a mayusculas
    
        while (cont < cad.length()) {           
            can = (cad.charAt(cont)==convertirCharMayuscula(car))?++can:can;
                can++;
           
            cont++;
        }
         //can=(cad.charAt(cont)==car)?++can:can; // ciclo if     
        return can;
    }
    
    public char convertirCharMayuscula(char c){
        return (c+"").toUpperCase().charAt(0);
    }
}
