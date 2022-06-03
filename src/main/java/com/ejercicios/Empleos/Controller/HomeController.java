package com.ejercicios.Empleos.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ejercicios.Empleos.model.Vacante;
import com.ejercicios.Empleos.service.IVacanteService;

@SuppressWarnings("unused")
@Controller
public class HomeController {
	
	@Autowired
	private IVacanteService serviceVacantes;
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
//		List<Vacante> lista = getVacantes();
		List<Vacante> lista = serviceVacantes.buscarTodas();
		model.addAttribute("vacantes", lista);
		return "tabla";
	}
	
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante();
		vacante.setNombre("Ingeniero de comunicaciones");
		vacante.setDescripcion("Se solicita ingeniero para soporte a Internet");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);
		model.addAttribute("vacante",vacante);
		return "detalle";
	}

	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de sistemas");
		lista.add("Auxiliar de Contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");
		
		model.addAttribute("empleos", lista);
		
		return "listado";
		
	}
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		//agregandon datos al modelo del atributo: 'mensaje' con cadena
//		model.addAttribute("mensaje", "Bienvenido a Empleos App, Estimado Graciano");
//		model.addAttribute("fecha", new Date());
		
//		String nombre = "Auxiliar de Contabilidad";
//		Date fechaPub = new Date();
//		double salario = 9000.0;
//		boolean vigente = true;
//		
//		model.addAttribute("nombre", nombre);
//		model.addAttribute("fecha", fechaPub);
//		model.addAttribute("salario", salario);
//		model.addAttribute("vigente", vigente);
		
		List<Vacante> lista = serviceVacantes.buscarTodas();
		model.addAttribute("vacantes", lista);
		
		return "home";
	}
	
	//Medoto que regresa una lista de objetos de tipo "Vacante"
	//@return
	
//	@SuppressWarnings("unused")
//	private List<Vacante> getVacantes() {
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		List<Vacante> lista = new LinkedList<Vacante>();
//		try {
//			//creamos la 1° oferta de trabajo:
//			Vacante vacante1 = new Vacante();
//			vacante1.setId(1);
//			vacante1.setNombre("Ing. Civil");
//			vacante1.setDescripcion("Solicitamos ingeniero civil para diseño de puente peatonal.");
//			vacante1.setFecha(sdf.parse("29-05-2022"));
//			vacante1.setSalario(8500.00);
//			vacante1.setDestacado(1);
//			vacante1.setImagen("empresa1.png");
//			
//			//creamos la 2° oferta de trabajo:
//			Vacante vacante2 = new Vacante();
//			vacante2.setId(2);
//			vacante2.setNombre("Contador Publico");
//			vacante2.setDescripcion("Empresa importante solicita contador con 5 años de experiencia.");
//			vacante2.setFecha(sdf.parse("22-05-2022"));
//			vacante2.setSalario(12000.00);
//			vacante2.setDestacado(1);
//			vacante2.setImagen("empresa5.png");
//			
//			//creamos la 3° oferta de trabajo:
//			Vacante vacante3 = new Vacante();
//			vacante3.setId(3);
//			vacante3.setNombre("Ing. Eléctrico");
//			vacante3.setDescripcion("Empresa internacional solicita ingeniero mecanico o a fin para mantenimiento de la instalacion electrica.");
//			vacante3.setFecha(sdf.parse("24-05-2022"));
//			vacante3.setSalario(12600.00);
//			vacante3.setDestacado(1);
//			vacante3.setImagen("empresa8.png");
//			
//			//creamos la 4° oferta de trabajo:
//			Vacante vacante4 = new Vacante();
//			vacante4.setId(4);
//			vacante4.setNombre("Diseñador Gráfico");
//			vacante4.setDescripcion("Solicitamos diseñador gráfico titulado para diseñar publicidad de la empresa.");
//			vacante4.setFecha(sdf.parse("25-05-2022"));
//			vacante4.setSalario(7500.00);
//			vacante4.setDestacado(0);
//			vacante4.setImagen("empresa7.png");
//			
//			//se agregan 4 objetos de tipo Vacante a la lista...
//			lista.add(vacante1);
//			lista.add(vacante2);
//			lista.add(vacante3);
//			lista.add(vacante4);
//		
//		} catch (ParseException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		return lista;
//	}

}
