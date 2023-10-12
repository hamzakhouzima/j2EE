package com.optima.demo12;
import jakarta.persistence.*;



@Entity
@Table(name = "departement")
public class Departement {
    //Département : Attributs : id, nom, description, chef de département, etc.


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @Column(name = "departement_boss")
    private String maintenance_date;


}
