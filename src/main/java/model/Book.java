/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 *
 * @author duyvu
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true)
@Getter
public class Book {

    private String isbn = null;
    private String title = null;
    private String author;
    private int edition;
    private int publishedyear;

}
