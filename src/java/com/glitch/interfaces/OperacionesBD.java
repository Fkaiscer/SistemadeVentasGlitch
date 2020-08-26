
package com.glitch.interfaces;

import java.util.ArrayList;


public interface OperacionesBD <T>{
     public abstract Boolean insert(T t);
    public abstract Boolean update(T t);
    public abstract Boolean delete(Object id);
    public abstract T selectById(Object id);
    public abstract ArrayList<T> selectAll();
    public abstract ArrayList<T> selectByName();
    public abstract void closeConnection();
    
    
}
