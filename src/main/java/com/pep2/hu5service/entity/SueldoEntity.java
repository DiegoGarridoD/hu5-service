package com.pep2.hu5service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "hu5_planilla")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SueldoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

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
