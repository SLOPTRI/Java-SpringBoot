package com.example.Ejercicio1_Productos_API_REST.controller;

import com.example.Ejercicio1_Productos_API_REST.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*
*
*  @RequestBody captura el cuerpo de una peticion HTTP y lo convierte en un objeto Java
*  @PathVariable captura una parte (dato-variable) de la URL (en este caso un ID)
*
* */

@RestController
public class ProductoController {

    private List<Producto> listaProductos = new ArrayList<>();
    private int idCounter = 0;

    public ProductoController(){
        // Anadimos algunos productos de ejemplos
        listaProductos.add(new Producto("PortatilOscar",1080,idCounter++));
        listaProductos.add(new Producto("OrdenadorJavi",900,idCounter++));
        listaProductos.add(new Producto("AuricularesEsther",80,idCounter++));
    }

    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){
        return listaProductos;
    }

    @PostMapping("/producto")
    public Producto crearProdcuto(@RequestBody Producto producto){
        producto.setId(idCounter++);
        listaProductos.add(producto);
        return  producto;
    }

    @PutMapping("/producto/{id}")
    public Producto actualizarProducto(@RequestBody Producto productoUpdate, @PathVariable int id){
        for(Producto producto : listaProductos){
            if(producto.getId() == id){
                producto.setNombre(productoUpdate.getNombre());
                producto.setPrecio(productoUpdate.getPrecio());
                return producto;
            }
        }
        return null;
    }

    @DeleteMapping("/producto{id}")
    public void eliminarProducto(@PathVariable int id){
        listaProductos.removeIf(producto -> producto.getId() == id);
    }
}
