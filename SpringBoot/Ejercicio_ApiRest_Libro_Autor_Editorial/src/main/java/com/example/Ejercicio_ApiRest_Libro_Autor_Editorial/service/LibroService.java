package com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.service;

import com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.model.Libro;
import com.example.Ejercicio_ApiRest_Libro_Autor_Editorial.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements LibroServiceInterface{

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> obtenerLibros(){
        return libroRepository.findAll();
    }

    @Override
    public void crearLibro(int id, String nombre, int year){
        libroRepository.save(new Libro(id,nombre,year));
    }

    @Override
    public void actualizarLibro(int id, String nombre, int year){
        Optional<Libro> exist = libroRepository.findById(id);
        Libro update = exist.get();

        if(exist.isPresent()){
            update.setId(id);
            update.setNombre(nombre);
            update.setYear(year);
            libroRepository.save(update);
        } else{
            System.out.println("Libro no encontrado");
        }
    }

    @Override
    public void borrarLibro(int id){
        libroRepository.deleteById(id);
    }

    /*
    *   public void indicarAutorEditorial(int idLibro,int idAutor, int idEditorial){
            Optional<Libro> exist = libroRepository.findById(idLibro);
            Libro update = exist.get();

            if(exist.isPresent()){
                update.setId(idLibro);
                // update.setAutor(libroRepository.find);
                libroRepository.save(update);
            } else{
                System.out.println("Libro no encontrado");
            }
        }
    * */

}
