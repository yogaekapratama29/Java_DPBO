/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author macairm1
 */
public class Movie {
    String Title;
    String Director;
    String Genre;
    
    public Movie (String Title,String Direction,String Genre){
    this.Title = Title;
    this.Director = Director;
    this.Genre = Genre;
    }
    
    @Override
    public String toString(){
        return "Judul = " + Title + "Director = " + Director + "Genre = " + Genre;
    }
}
