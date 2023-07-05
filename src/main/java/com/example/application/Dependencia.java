package com.example.application;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;



@Entity
@Table(name ="dependencias")

public class Dependencia {

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String nombres;
    private String domicilios;

    public Integer getId() {
    return id;
}

    public void setId(Integer id) {
    this.id = id;
}
    
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String getDomicilios() {
        return domicilios;
    }
    public void setDomicilios(String domicilios) {
        this.domicilios = domicilios;
    }

     public Dependencia () {

     }
    @ManyToOne
    private Edificio edificio;
  
                        }
