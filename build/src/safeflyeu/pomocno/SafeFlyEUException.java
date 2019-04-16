/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.pomocno;

/**
 *
 * @author labak
 */
public class SafeFlyEUException extends Exception {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public SafeFlyEUException(String poruka) {
        super(poruka);
    }

}
