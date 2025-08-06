package Modelo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.platform.engine.reporting.ReportEntry;

public class Producto implements Comparable<Producto> {
  private String nombre;
  private String codigo;
  private List<Double> precios;
  @Override
  public int compareTo(Producto o) {
   int comparable =this.nombre.compareTo(o.nombre);
   if (comparable!=0) return comparable; 
   return this.codigo.compareTo(o.codigo); 
   
  }
  public Producto(String nombre, String codigo, List<Double> precios) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.precios = precios;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public List<Double> getPrecios() {
    return precios;
  }
  public void setPrecios(List<Double> precios) {
    this.precios = precios;
  }

  public int porcentajeCaracteresUnicos(){
  String normales = nombre.toLowerCase().replaceAll(" ", " ");
    Set<Character> unicos=new HashSet<>();
    for (char c : normales.toCharArray()) {
      unicos.add(c);
    }
    return(int) ((unicos.size()*100)/normales.length());

  }



  public int getcatidadPreciosRepetidos(){
    Map<Double, Integer> conteo= new HashMap<>();
    for (Double precios : precios) {
      conteo.put(precios, conteo.getOrDefault(precios, 0)+1);

    }
    int Repetidos=0;
    for (int count : conteo.values()) {
      if (count>1) Repetidos++; 
      
      
    }
    return Repetidos;  

  }

  





  

  
  
}
