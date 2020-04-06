package br.com.ricardowanderley.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaxaController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message  ", "Taxa Aplicada");
		return "index";
	}

}
