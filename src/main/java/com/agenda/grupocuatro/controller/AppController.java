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

import com.agenda.grupocuatro.model.Contact;
import com.agenda.grupocuatro.model.UsuarioAdmin;
import com.agenda.grupocuatro.services.ContactService;
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

	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		ModelAndView model = new ModelAndView("login");
		return model;
		
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newUser() {
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("contact", new Contact());
		return model;		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int contactId = Integer.parseInt(request.getParameter("id"));
		Contact contact = contactService.get(contactId);
		ModelAndView model = new ModelAndView("UserForm");
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
		ModelAndView model = new ModelAndView("Listado");
		model.addObject("contactList", listContacts);
		return model;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView search(HttpServletRequest request){
		List<Contact> listContacts = contactService.search(request.getParameter("selector"));
		ModelAndView model = new ModelAndView("Listado");
		model.addObject("contactList", listContacts);
		return model;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Contact user) {
		contactService.saveOrUpdate(user);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginAdmin(HttpServletRequest request) {	
		
		Logger miLog = Logger.getLogger(AppController.class);
		
		miLog.log(Level.WARN, "requestn es: "+request.getParameter("password"));		

		
		UsuarioAdmin admin = adminService.login(request.getParameter("usuario"), request.getParameter("password"));
		
		HttpSession session = request.getSession();
		
		session.setAttribute("admin", admin );
		
		miLog.log(Level.WARN, "El usuario admin es: "+admin.toString() );		
		
		return new ModelAndView("redirect:/");		
		
	}
	
}
