package com.practica.clase.api.beans.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "users")
public class PracticaEntity {

	@Id
	@Column(name ="id")
	private Integer id;	
	@Column(name ="name")
	private String name;
	@Column(name ="gender")
	private String gender;
	
}
