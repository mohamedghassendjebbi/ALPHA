/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import entity.localisation;
import java.util.List;

/**
 *
 * @author ghassen
 */
public interface Iservice <T>{
    void insert(T t);
    boolean update (T t);
    boolean delete(String id);
    List<T>displayAll();
    
}
