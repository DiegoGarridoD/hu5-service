package com.pep2.hu5service.controller;


import com.pep2.hu5service.entity.SueldoEntity;
import com.pep2.hu5service.model.Sueldo;
import com.pep2.hu5service.service.PlanillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hu5")
@CrossOrigin("http://localhost:3000")
public class SueldoController {
    @Autowired
    PlanillaService planillaService;

    @GetMapping("/sueldos")
    public ResponseEntity<List<SueldoEntity>> getAll() {
        List<SueldoEntity> sueldos = planillaService.obtenerSueldos();
        if(sueldos.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(sueldos);
    }

    @GetMapping("/sueldoshu4")
    public ResponseEntity<Sueldo[]> getAlls() {
        Sueldo[] sueldos = planillaService.obtenerSueldosDesdeHU4();
        if(sueldos.length == 0)
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(sueldos);
    }
}
