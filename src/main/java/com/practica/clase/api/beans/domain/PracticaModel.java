package com.practica.clase.api.beans.domain;


import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PracticaModel {

	@NotNull
	private Integer id;	
	
	@NotNull
	private String name;
	
	private String gender;
}
