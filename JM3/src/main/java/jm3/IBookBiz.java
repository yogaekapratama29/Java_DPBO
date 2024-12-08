/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm3;

/**
 *
 * @author macairm1
 */
public interface IBookBiz {
    void printAllBooks();
    void searchNovelByAuthor(String author);
    void searchNovelByPrice(int minPrice, int maxPrice);
    void printHeader();
    void printTail();
}
