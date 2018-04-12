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
import com.agenda.grupocuatro.model.Direcciones;
import com.agenda.grupocuatro.model.Empleado;
import com.agenda.grupocuatro.model.Personas;
import com.agenda.grupocuatro.model.Telefonos;
import com.agenda.grupocuatro.model.UsuarioAdmin;
import com.agenda.grupocuatro.services.CategoriasService;
import com.agenda.grupocuatro.services.ContactService;
import com.agenda.grupocuatro.services.DepartamentoService;
import com.agenda.grupocuatro.services.EmpleadoService;
import com.agenda.grupocuatro.services.PersonasService;
import com.agenda.grupocuatro.services.TelefonosService;
import com.agenda.grupocuatro.services.UsuarioAdminService;
import com.agenda.grupocuatro.services.DireccionesService;

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
	@Autowired
	private TelefonosService telefonosService;
	@Autowired
	private DireccionesService direccionesService;	
	@Autowired
	private PersonasService personasService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView principal() {
		ModelAndView model = new ModelAndView("index");
	
		/*empleados*/
		 
		  List<Empleado> listaEmpleaditos = empleadoService.listaEmpleados();
		
		  	model.addObject("listaEmpleaditos", listaEmpleaditos);
			
		/*departamento*/
		 List<Departamento> listaDepartamentitos = departamentoService.listaDepartamentos();
			
		 	model.addObject("listaDepartamentitos", listaDepartamentitos);
			
		
		/*categoria*/
		List<Categorias> listaCategories = categoriaService.listaCaterogias();
			
			model.addObject("listaCategories", listaCategories);
			
		
		return model;		
	}
	
	
	
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
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logoutAdmin(HttpServletRequest request) {				
		HttpSession session = request.getSession();		
		session.setAttribute("admin", null );					
		return new ModelAndView("redirect:/");				
	}
	
	
	/*Inicio empleados*/
	@RequestMapping(value = "/listEmpleados", method = RequestMethod.GET)
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
	
/*Inicio Telefonos*/
	
	@RequestMapping(value = "/newTelefono", method = RequestMethod.GET)
	public ModelAndView newTelefonos() {
		ModelAndView model = new ModelAndView("telefonosform");
		model.addObject("telefonos", new Telefonos());
		return model;		
	}
	
	@RequestMapping(value = "/editTelefono", method = RequestMethod.GET)
	public ModelAndView editTelefonos(HttpServletRequest request) {
		int telefonosId = Integer.parseInt(request.getParameter("id"));
		Telefonos telefonos = telefonosService.get(telefonosId);
		ModelAndView model = new ModelAndView("telefonosform");
		model.addObject("telefonos", telefonos);
		return model;		
	}
	
	@RequestMapping(value = "/deleteTelefono", method = RequestMethod.GET)
	public ModelAndView deleteTelefonos(HttpServletRequest request) {
		int telefonosId = Integer.parseInt(request.getParameter("id"));
		telefonosService.baja(telefonosId);
		return new ModelAndView("redirect:/listTelefonos");		
	}
	
	@RequestMapping(value="/listTelefonos", method=RequestMethod.GET)
	public ModelAndView listarTelefonos(){
		List<Telefonos> listaTelefonos = telefonosService.listaTelefonos();
		ModelAndView model = new ModelAndView("listadotelefonos");
		model.addObject("listaTelefonos",listaTelefonos);
		return model;
	}
	
	@RequestMapping(value = "/saveTelefono", method = RequestMethod.POST)
	public ModelAndView saveTelefonos(@ModelAttribute Telefonos telefonos) {
		telefonosService.altaOupdate(telefonos);
		return new ModelAndView("redirect:/listTelefonos");
	}
	
	/*Fin Telefonos*/
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView irALogin() {		
				
		ModelAndView model = new ModelAndView("login");
		
		return model;		
	}
	
	/*Inicio Categoria*/
	
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
	/*Fin categoria*/
	

	
	
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
	
	
	/*Inicio Personas*/

	
	@RequestMapping(value = "/newPersona", method = RequestMethod.GET)
	public ModelAndView newPersona() {
		ModelAndView model = new ModelAndView("personaform");
		model.addObject("persona", new Personas());
		
		//List<Empleado> listaEmpleaditos = empleadoService.listaEmpleadosSinPersona();
		List<Empleado> listaEmpleaditos = empleadoService.listaEmpleados();
		if(listaEmpleaditos.isEmpty()){
			try {
				throw new Exception("LISTA VACIA LUL");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			model.addObject("listaEmpleaditos",listaEmpleaditos);
		}
		return model;		
	}
	
	@RequestMapping(value = "/editPersona", method = RequestMethod.GET)
	public ModelAndView editPersona(HttpServletRequest request) {
		int personaId = Integer.parseInt(request.getParameter("id"));
		Personas persona = personasService.get(personaId);
		ModelAndView model = new ModelAndView("personaform");
		model.addObject("persona", persona);
		
		List<Empleado> listaEmpleaditos = empleadoService.listaEmpleados();
		if(listaEmpleaditos.isEmpty()){
			try {
				throw new Exception("LISTA VACIA LUL");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			model.addObject("listaEmpleaditos",listaEmpleaditos);
		}

		return model;		
	}
	
	@RequestMapping(value = "/verPersona", method = RequestMethod.GET)
	public ModelAndView verPersona(HttpServletRequest request) {
		int personaId = Integer.parseInt(request.getParameter("id"));
		Personas persona = personasService.get(personaId);
		ModelAndView model = new ModelAndView("personaendetalle");
		model.addObject("persona", persona);
		return model;		
	}
	
	@RequestMapping(value = "/deletePersona", method = RequestMethod.GET)
	public ModelAndView deletePersona(HttpServletRequest request) {
		int personaId = Integer.parseInt(request.getParameter("id"));
		personasService.baja(personaId);
		return new ModelAndView("redirect:/listPersonas");		
	}
	
	@RequestMapping(value="/listPersonas", method=RequestMethod.GET)
	public ModelAndView listarPersona(){
		List<Personas> listaPersonas = personasService.listaPersonas();
		ModelAndView model = new ModelAndView("listadopersonas");
		model.addObject("listaPersonas", listaPersonas);
		return model;
	}
	
	@RequestMapping(value = "/savePersona", method = RequestMethod.POST)
	public ModelAndView savePersona(@ModelAttribute Personas persona) {
		personasService.altaOupdate(persona);
		return new ModelAndView("redirect:/listPersonas");
	}
	/*Fin Personas*/
	
	/*Inicio Direcciones*/
	@RequestMapping(value = "/newDireccion", method = RequestMethod.GET)
	public ModelAndView newDireccion() {
		ModelAndView model = new ModelAndView("direccionform");
		model.addObject("direccion", new Direcciones());
		List<Personas> listaPersonitas = personasService.listaPersonas();
		model.addObject("listaPersonitas", listaPersonitas);
		return model;		
	}
	
	@RequestMapping(value = "/editDireccion", method = RequestMethod.GET)
	public ModelAndView editDireccion(HttpServletRequest request) {
		int direccionId = Integer.parseInt(request.getParameter("id"));
		Direcciones direccion = direccionesService.get(direccionId);
		ModelAndView model = new ModelAndView("direccionform");
		model.addObject("direccion", direccion);
		return model;		
	}
	
	@RequestMapping(value = "/deleteDireccion", method = RequestMethod.GET)
	public ModelAndView deleteDireccion(HttpServletRequest request) {
		int direccionId = Integer.parseInt(request.getParameter("id"));
		direccionesService.baja(direccionId);
		return new ModelAndView("redirect:/listDirecciones");		
	}
	
	@RequestMapping(value="/listDirecciones", method=RequestMethod.GET)
	public ModelAndView listarDireccion(){
		List<Direcciones> listaDirecciones = direccionesService.listaDirecciones();
		ModelAndView model = new ModelAndView("listadodirecciones");
		model.addObject("listaDirecciones", listaDirecciones);
		return model;
	}
	
	@RequestMapping(value = "/saveDireccion", method = RequestMethod.POST)
	public ModelAndView saveDirecciones(@ModelAttribute Direcciones direccion) {
		direccionesService.altaOupdate(direccion);
		return new ModelAndView("redirect:/listDirecciones");
	}
	
	
	
	/*Fin Direcciones*/
	
	
	/*Inicio listados de las búsquedas*/
	
	@RequestMapping(value = "/listEmpleadosBusqueda", method = RequestMethod.GET)
	public ModelAndView listaEmpleadosBusqueda(HttpServletRequest request) {		
		
		List<Empleado> empleados = empleadoService.listaEmpleados(request.getParameter("idempleado"));
		
		ModelAndView model = new ModelAndView("listado");
		model.addObject("listaEmpleados", empleados);
		return model;		
	}
	
	@RequestMapping(value = "/listDepartamentosBusqueda", method = RequestMethod.GET)
	public ModelAndView listaDepartamentosBusqueda(HttpServletRequest request) {		
		
		List<Departamento> empleados = departamentoService.listaDepartamentos(request.getParameter("iddepartamento"));
		
		ModelAndView model = new ModelAndView("listadodepartamentos");
		model.addObject("listaDepartamentos", empleados);
		return model;		
	}
	
	
	@RequestMapping(value = "/verPersonaPorCodEmpleado", method = RequestMethod.GET)
	public ModelAndView verPersonaPorCodEmpleado(HttpServletRequest request) {		
		
		Personas persona = personasService.usuarioPorCodEmpleado(request.getParameter("idempleado"));
		
		ModelAndView model = new ModelAndView("personaendetalle");
		model.addObject("persona", persona);
		return model;		
	}
	
	
	@RequestMapping(value = "/verPersonaPorDepartamento", method = RequestMethod.GET)
	public ModelAndView verPersonaPorDepartamento(HttpServletRequest request) {		
		
		List<Personas> listaPersonas = personasService.usuarioPorDepartamento(request.getParameter("iddepartamento"));
		
		ModelAndView model = new ModelAndView("listadopersonas");
		model.addObject("listaPersonas", listaPersonas);
		model.addObject("elDepartamento",request.getParameter("iddepartamento") );
		return model;		
	}
}
