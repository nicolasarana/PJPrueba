package com.example.application;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity

@Table (name = "Edificios")


public class Edificio {
    
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
    @OneToMany(mappedBy = "persona")
    List<Dependencia> Dependencia;

    public Edificio () {

    }
}
