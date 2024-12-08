package com.techeazy.backendproject.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class subject {

    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    private int id;
    private String name;

}
