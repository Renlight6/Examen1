/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen.examen.Service;


import Examen.examen.Repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Examen.examen.entity.Evento;
@Service
public class EventoService implements IEventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public List<Evento> getAllEvent() {
        return (List<Evento>) eventoRepository.findAll();
    }

    @Override
    public void saveEvento(Evento evento) {
        eventoRepository.save(evento);
    }

    @Override
    public Evento getEventById(long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        eventoRepository.deleteById(id);
    }

}
