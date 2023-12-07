/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author duyvu
 */
public interface DAOInterface<T> {

    public int insertStatement(T t);

    public int insertPreparedStatement(T t);

    public int delete(T t);

    public int update(T t);

    public ArrayList<T> selectAll();

    public T selectByCondition(String condition);
}
