package com.LibraryManagementSystem.Service;

import com.LibraryManagementSystem.Entity.Book;

import java.time.LocalDate;
import java.util.List;

public interface BookService {

    public Book getBookInfoByTitle(String bookName);

    public Book getBookInfoByAuthorName(String authorName);

    //public Book getBookInfoByPublicationDate(LocalDate PublishedDate);


}
