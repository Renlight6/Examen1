/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.examen.controller;

import Examen.examen.Service.IEventoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import Examen.examen.entity.Evento;

@Controller
@Slf4j


  



public class EventoController {

    @Autowired
    private IEventoService eventoService;

    @GetMapping("/evento")
    public String index(Model model) {
        List<Evento> listaEventos = eventoService.getAllEvent();
        model.addAttribute("titulo", "Evento");
        model.addAttribute("eventos", listaEventos);
        return "eventos";
    }

    @GetMapping("/eventosN")
    public String crearEvento(Model model) {
        model.addAttribute("evento", new Evento());
        return "crear";
    }

    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento) {
        eventoService.saveEvento(evento);
        return "redirect:/evento";
    }

    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento) {
        eventoService.delete(idEvento);
        return "redirect:/evento";
    }
}


