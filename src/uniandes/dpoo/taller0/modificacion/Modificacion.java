package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion 
{
public static void main(String[] args) throws FileNotFoundException, IOException
{
	System.out.println("Hola, Mundo!");	
	CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("data/atletas.csv");
	Map<String, Integer> paises = calc.paisConMasMedallistas();
	System.out.println("");
	System.out.println("");	
	
	for (String nombre : paises.keySet())
	{
		System.out.println(nombre + " es el país que cuenta con más medallistas, exactamente con "+ paises.get(nombre) + " medallistas");
	}
}
}