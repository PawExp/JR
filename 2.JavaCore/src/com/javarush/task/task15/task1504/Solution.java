package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public Book() {

        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;
            if (this instanceof MarkTwainBook) {
                return markTwainOutput;
            }else if (this instanceof AgathaChristieBook){
                return agathaChristieOutput;
            }else {
                String output = "output";
                //Add your code here

                return output;
            }
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
    public static class MarkTwainBook extends Book{
        String author = "Mark Twain";
        public String title;


        public MarkTwainBook(String title) {
            this.title = title;
            super.author = this.author;
        }


        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
    public static class AgathaChristieBook extends Book{
        String author = "Agatha Christie";
        public String title;
        public AgathaChristieBook(String title) {
            this.title = title;
            super.author = this.author;

        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }


}
