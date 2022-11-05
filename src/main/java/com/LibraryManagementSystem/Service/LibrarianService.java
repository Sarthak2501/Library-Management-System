package com.LibraryManagementSystem.Service;

import com.LibraryManagementSystem.Entity.Book;

import java.util.UUID;

public interface LibrarianService {

    void issueBookToMember(String memberName , String bookName);

    public Book registerNewBookInLib(Book book);
}
