package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 *
 * A0pplication which will prompt the user to enter the name of their favorite Movie. Add the Movie to an array
 * list.  Use a loop to continue adding movies to the array until the user presses q or Q.
 * Once the user presses Q then print the list of movies before exiting the program.
 * BONUS: Print out the list of movies sorted in alphabetical order.
 * BONUS x2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        ArrayList<String> stringList = new ArrayList<String>();

        String answer = "y";
        //add a new movie
        //create a movie from our object
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Do you want to enter a movie?");
            answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                Movie movie = new Movie();
                System.out.print("Enter the title: ");
                movie.setTitle(keyboard.nextLine());
                movieList.add(movie);
                stringList.add(movie.getTitle());
            }
        }
        //sort the list
        Collections.sort(stringList);
        //print all the movies in the array list
        System.out.println("All the movies:");

        //enhanced for loop allows you to simplify code by with a for-loops
        //that visit each element of an array/collection easily (without using indexes)
        //Example: https://blogs.oracle.com/corejavatechtips/using-enhanced-for-loops-with-your-classes
        for(Movie movie:movieList)
        {
            System.out.print(movie.getTitle());
            System.out.print(" ");
        }
        System.out.println();
        //Sorting the movies in alphabetical order
        System.out.println("Sorted list of the movies");
        for(String string:stringList) {
            System.out.print(""+string +" ");
        }
        System.out.println();
        Collections.shuffle(stringList);
        if(stringList.size() != 0)
            System.out.println("Why don't you see this movie: " +stringList.get(1));

    }
}

