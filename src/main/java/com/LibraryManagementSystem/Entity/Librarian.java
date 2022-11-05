package com.LibraryManagementSystem.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;


@Data
@Entity
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID librarianId;

    private String librarianName;

}
