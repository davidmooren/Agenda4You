package com.agenda.grupocuatro.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.jboss.logging.Logger.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agenda.grupocuatro.model.Categorias;
import com.agenda.grupocuatro.model.Contact;
import com.agenda.grupocuatro.model.Departamento;
import com.agenda.grupocuatro.model.Empleado;
import com.agenda.grupocuatro.model.UsuarioAdmin;
import com.agenda.grupocuatro.services.CategoriasService;
import com.agenda.grupocuatro.services.ContactService;
import com.agenda.grupocuatro.services.DepartamentoService;
import com.agenda.grupocuatro.services.EmpleadoService;
import com.agenda.grupocuatro.services.UsuarioAdminService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AppController {
	
	@Autowired
	private ContactService contactService;
	@Autowired
	private UsuarioAdminService adminService;
	@Autowired
	private EmpleadoService empleadoService;	
	@Autowired
	private CategoriasService categoriaService;
	@Autowired
	private DepartamentoService departamentoService;

	/*@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		ModelAndView model = new ModelAndView("login");
		return model;
		
	}*/
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newUser() {
		ModelAndView model = new ModelAndView("userform");
		model.addObject("contact", new Contact());
		return model;		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int contactId = Integer.parseInt(request.getParameter("id"));
		Contact contact = contactService.get(contactId);
		ModelAndView model = new ModelAndView("userform");
		model.addObject("contact", contact);
		return model;		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int userId = Integer.parseInt(request.getParameter("id"));
		contactService.delete(userId);
		return new ModelAndView("redirect:/");		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView listar(){
		List<Contact> listContacts = contactService.list();
		ModelAndView model = new ModelAndView("listado");
		model.addObject("contactList", listContacts);
		return model;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView search(HttpServletRequest request){
		List<Contact> listContacts = contactService.search(request.getParameter("selector"));
		ModelAndView model = new ModelAndView("listado");
		model.addObject("contactList", listContacts);
		return model;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Contact user) {
		contactService.saveOrUpdate(user);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/logear", method = RequestMethod.POST)
	public ModelAndView loginAdmin(HttpServletRequest request) {			
		
		UsuarioAdmin admin = adminService.login(request.getParameter("usuario"), request.getParameter("password"));
		
		HttpSession session = request.getSession();
		
		Logger loger = Logger.getLogger("Controlador - ");
		loger.log(Level.WARN, admin.getUsuario());
		session.setAttribute("admin", admin );					
		return new ModelAndView("redirect:/");				
	}
	
	
	/*Inicio empleados*/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView listaEmpleados(HttpServletRequest request) {		
		
		List<Empleado> empleados = empleadoService.listaEmpleados();
		
		ModelAndView model = new ModelAndView("listado");
		model.addObject("listaEmpleados", empleados);
		return model;		
	}
	@RequestMapping(value = "/newEmpleado", method = RequestMethod.GET)
	public ModelAndView newEmpleado() {
		ModelAndView model = new ModelAndView("empleadoform");
		model.addObject("empleado", new Empleado());
		return model;		
	}
	
	@RequestMapping(value = "/editEmpleado", method = RequestMethod.GET)
	public ModelAndView editEmpleado(HttpServletRequest request) {
		int empleadoId = Integer.parseInt(request.getParameter("id"));
		Empleado empleado = empleadoService.get(empleadoId);
		ModelAndView model = new ModelAndView("empleadoform");
		model.addObject("empleado", empleado);
		return model;		
	}
	
	@RequestMapping(value = "/deleteEmpleado", method = RequestMethod.GET)
	public ModelAndView deleteEmpleado(HttpServletRequest request) {
		int empleadoId = Integer.parseInt(request.getParameter("id"));
		categoriaService.baja(empleadoId);
		return new ModelAndView("redirect:/");		
	}
	
	
	@RequestMapping(value = "/saveEmpleado", method = RequestMethod.POST)
	public ModelAndView saveEmpleado(@ModelAttribute Empleado empleado) {
		empleadoService.altaOupdate(empleado);
		return new ModelAndView("redirect:/");
	}
	
	
	
	
	/*Fin empleados*/
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView irALogin() {		
				
		ModelAndView model = new ModelAndView("login");
		
		return model;		
	}
	
	
	
	@RequestMapping(value = "/newCategoria", method = RequestMethod.GET)
	public ModelAndView newCategoria() {
		ModelAndView model = new ModelAndView("categoriaform");
		model.addObject("categoria", new Categorias());
		return model;		
	}
	
	@RequestMapping(value = "/editCategoria", method = RequestMethod.GET)
	public ModelAndView editCategoria(HttpServletRequest request) {
		int categoriaId = Integer.parseInt(request.getParameter("id"));
		Categorias categoria = categoriaService.get(categoriaId);
		ModelAndView model = new ModelAndView("categoriaform");
		model.addObject("categoria", categoria);
		return model;		
	}
	
	@RequestMapping(value = "/deleteCategoria", method = RequestMethod.GET)
	public ModelAndView deleteCategoria(HttpServletRequest request) {
		int categoriaId = Integer.parseInt(request.getParameter("id"));
		categoriaService.baja(categoriaId);
		return new ModelAndView("redirect:/listCategorias");		
	}
	
	@RequestMapping(value="/listCategorias", method=RequestMethod.GET)
	public ModelAndView listarCategorias(){
		List<Categorias> listaCategorias = categoriaService.listaCaterogias();
		ModelAndView model = new ModelAndView("listadocategorias");
		model.addObject("listaCategorias", listaCategorias);
		return model;
	}
	
	@RequestMapping(value = "/saveCategoria", method = RequestMethod.POST)
	public ModelAndView saveCategoria(@ModelAttribute Categorias categoria) {
		categoriaService.altaOupdate(categoria);
		return new ModelAndView("redirect:/listCategorias");
	}
	
	
	
	@RequestMapping(value ="/newDepartamento", method=RequestMethod.GET)
	public ModelAndView newDepartamento(){
		ModelAndView model = new ModelAndView("departamentoform");
		model.addObject("departamento", new Departamento());
		return model;
	}
	
	@RequestMapping(value ="/editDepartamento", method=RequestMethod.GET)
	public ModelAndView editDepartamento(HttpServletRequest request){
		int departamentoId = Integer.parseInt(request.getParameter("id"));
		Departamento departamento = departamentoService.get(departamentoId);
		ModelAndView model = new ModelAndView("departamentoform");
		model.addObject("departamento", departamento);
		return model;
	}
	
	@RequestMapping(value ="/deleteDepartamento", method=RequestMethod.GET)
	public ModelAndView deleteDepartamento(HttpServletRequest request){
		int departamentoId = Integer.parseInt(request.getParameter("id"));
		categoriaService.baja(departamentoId);
		return new ModelAndView("redirect:/listadodepartamentos");
	}
	
	@RequestMapping(value="/listDepartamentos", method=RequestMethod.GET)
	public ModelAndView listarDepartamentos(){
		List<Departamento> listaDepartamentos = departamentoService.listaDepartamentos();
		ModelAndView model = new ModelAndView("listadodepartamentos");
		model.addObject("listaDepartamentos", listaDepartamentos);
		return model;
	}
	
	@RequestMapping(value = "/saveDepartamento", method = RequestMethod.POST)
	public ModelAndView saveDepartamento(@ModelAttribute Departamento departamento) {
		departamentoService.altaOupdate(departamento);
		return new ModelAndView("redirect:/listDepartamentos");
	}
	
}
