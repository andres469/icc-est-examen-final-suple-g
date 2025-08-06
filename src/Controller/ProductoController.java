package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

import org.junit.experimental.categories.Categories;

import Modelo.Producto;

public class ProductoController {

  public TreeSet<Producto> ordenarProducto(List<Producto> lista){
    return new TreeSet<>(lista);
  }
  public Map<String, List<Producto>> clasificarPorUnicidad(Set<Producto> Productos){
    Map<String, List<Producto>> clasificacion= new LinkedHashMap<>();
    List<String> categorias=Arrays.asList("A","B","C","D","E");
    for (Producto producto : Productos) {
      double porcentaje=producto, porcentajeCaracteresUnicos;
      String categoria;
      if (porcentaje>=90) {
        categoria="A";
      }else if (porcentaje>=70) {
        categoria="B";
      }else if (porcentaje>=50) {
        categoria="C";
      }else if (porcentaje>=30) {
        categoria="D";
      }else  {
        categoria="E";
      }
    }
    
}

public List<Producto> obtenerDestacados(List<Producto> lista){
 List<Producto> destacado= new ArrayList<>();

 for (Producto producto : lista) {
  if (producto.getcatidadPreciosRepetidos()>0) {
    destacado.add(producto);

  }
  
 }
 for (int i = 0; i < array.length; i++) {
  
 }

}
  
}
