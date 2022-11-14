package com.pep2.hu5service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sueldo {
    private String rut_empleado;
    private String nombre_empleado;
    private String categoria;
    private Integer anios_servicio;
    private Integer sueldo_fijo;
    private Integer bonificacion;
    private Integer pago_horasextras;
    private Integer descuentos;
    private Integer sueldo_bruto;
    private Integer descuento_prevision;
    private Integer descuento_salud;
    private Integer sueldo_final;
}
