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
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author duyvu
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor        // Create the constructor for final fields and @Non-null
@ToString(includeFieldNames = true)
@Getter
@Setter
public class Book {

    @NonNull
    private String isbn;
    private String title;
    private String author;
    private int edition;
    private int publishedyear;

}
