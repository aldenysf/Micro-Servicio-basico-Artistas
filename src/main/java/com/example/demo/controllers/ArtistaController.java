package com.example.demo.controllers;

import com.example.demo.model.Artista;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ArtistaController {

    private List<Artista> artistas;

    @PostConstruct
    public void init(){
        artistas = new ArrayList<>();
        artistas.add(new Artista("AC/CD",1973,"Australia","Rock","acdc","ac/dc","acdc")
        );
        artistas.add(new Artista("Willie the Kid",1985 ,"USA","Rap","thewilliethekid","Willie the Kid","thewilliethekid")
        );
        artistas.add(new Artista("Nirvana",1987 ,"USA","Rock","Nirvana","Nirvana","Nirvana")
        );
        artistas.add(new Artista("Bad Bunny",1994  ,"Puerto Rico","Rap","badbunnypr","Bad Bunny","badbunnypr")
        );
    }

    //Busqueda de Artistas recorriendo una lista
    @GetMapping(value = "artistas",produces =MediaType.APPLICATION_JSON_VALUE)
    public List<Artista> getArtistas(){return artistas;}

    //Buscar un objeto Artista definido en la instancia de retorno
    @GetMapping(value = "artista",produces = MediaType.APPLICATION_JSON_VALUE)
    public Artista getArtista(){
        return new Artista("AC/CD",1973,"Australia","Rock","acdc","ac/dc","acdc");
    }

    @GetMapping(value = "artistas/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Artista> buscarArtistas(@PathVariable("name") String nombre){
    List<Artista> aux= new ArrayList<>();
    for(Artista a: artistas){
        if (a.getNombre().contains(nombre)){
            aux.add(a);
        }
    }
        return aux;
    }
}
