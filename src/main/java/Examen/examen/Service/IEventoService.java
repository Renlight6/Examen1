/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Examen.examen.Service;
import Examen.examen.entity.Evento;

import java.util.List;
import org.springframework.stereotype.Repository;


 @Repository
public interface IEventoService {
    
    public List<Evento> getAllEvent();

    public void saveEvento(Evento evento);

    public Evento getEventById(long id);

    public void delete(long id);

    
}

