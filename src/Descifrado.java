/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Jimeno Pablo
 * @version 3
 */
public class Descifrado {

    //mÃ©todo para descifrar el texto
    /**
     * 
     * @param texto introduce texto
     * @param posiciones a desplazar
     * @return mensaje descifrado
     */
    
    public static String descifradoCesar(String texto, int posiciones) {
        StringBuilder cifrado = new StringBuilder();
        posiciones = posiciones % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - posiciones) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - posiciones + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - posiciones));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - posiciones) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - posiciones + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - posiciones));
                }
            }
        }
        return cifrado.toString();
    }
    
}
