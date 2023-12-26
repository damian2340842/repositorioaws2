package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repository.IUsuarioRepository;


@RestController
@RequestMapping("/api/persona")
public class UsuarioRestController {
	@Autowired
	private IUsuarioRepository usuariorepo;
	
	//Listar todos los usuarios
	@GetMapping
	List<Usuario> getAll(){
		return usuariorepo.findAll();
	}
	
	//Guarda un usuario
	@PostMapping
	Usuario create(@RequestBody Usuario usuario) {
		return usuariorepo.save(usuario);
	}
}
