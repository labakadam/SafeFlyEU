/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.pomocno;

import java.util.List;

/**
 *
 * @author labak
 */
public interface ObradaSucelje<T> {
    
    public List<T> getLista();
    public void kontrola(T t) throws SafeFlyEUException;
    public T save(T t) throws SafeFlyEUException;
    public void obrisi(T t) throws SafeFlyEUException;
    
    
}
