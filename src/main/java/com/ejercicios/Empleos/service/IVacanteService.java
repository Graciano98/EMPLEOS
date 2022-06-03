package com.ejercicios.Empleos.service;

import java.util.List;

import com.ejercicios.Empleos.model.Vacante;

public interface IVacanteService {
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);

}
