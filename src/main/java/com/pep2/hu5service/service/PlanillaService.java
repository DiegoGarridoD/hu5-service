package com.pep2.hu5service.service;

import com.pep2.hu5service.entity.SueldoEntity;
import com.pep2.hu5service.model.Sueldo;
import com.pep2.hu5service.repository.SueldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class PlanillaService {
    @Autowired
    SueldoRepository sueldoRepository;

    @Autowired
    RestTemplate restTemplate;

    public Sueldo[] obtenerSueldosDesdeHU4(){
        Sueldo[] sueldos = restTemplate.getForObject("http://hu4-service/hu4/sueldos",Sueldo[].class);
        return sueldos;
    }

    public void ingresarSueldos(Sueldo[] sueldos)
    {
        int i = 0;
        while(i < sueldos.length)
        {
            SueldoEntity sueldoAux = new SueldoEntity();
            sueldoAux.setRut_empleado(sueldos[i].getRut_empleado());
            sueldoAux.setNombre_empleado(sueldos[i].getNombre_empleado());
            sueldoAux.setCategoria(sueldos[i].getCategoria());
            sueldoAux.setAnios_servicio(sueldos[i].getAnios_servicio());
            sueldoAux.setSueldo_fijo(sueldos[i].getSueldo_fijo());
            sueldoAux.setBonificacion(sueldos[i].getBonificacion());
            sueldoAux.setPago_horasextras(sueldos[i].getPago_horasextras());
            sueldoAux.setDescuentos(sueldos[i].getDescuentos());
            sueldoAux.setSueldo_bruto(sueldos[i].getSueldo_bruto());
            sueldoAux.setDescuento_prevision(sueldos[i].getDescuento_prevision());
            sueldoAux.setDescuento_salud(sueldos[i].getDescuento_salud());
            sueldoAux.setSueldo_final(sueldos[i].getSueldo_final());
            sueldoRepository.save(sueldoAux);
            i = i + 1;
        }
    }

    public ArrayList<SueldoEntity> obtenerSueldos()
    {
        sueldoRepository.deleteAll();
        Sueldo[] sueldos = obtenerSueldosDesdeHU4();
        ingresarSueldos(sueldos);
        return (ArrayList<SueldoEntity>) sueldoRepository.findAll();
    }

}
