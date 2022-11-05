package com.LibraryManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID bookId;
    private String bookName;
    private String authorName;
    private LocalDate PublishedDate;
    private Long rackNumber;
    private String Description;

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublishedDate() {
        return PublishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        PublishedDate = publishedDate;
    }

    public Long getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(Long rackNumber) {
        this.rackNumber = rackNumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
