package edu.upeu.resoluciones.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name ="DATA_MAIN")

public class DataMain implements Serializable {

private static final long serialVersionUID = 1L;	
@Id
@GeneratedValue(generator = "genId")
@GenericGenerator(name = "genId", strategy = "edu.upeu.resoluciones.util.GeneradorIDRandom")
@Column(name = "ID_DATA_MAIN")
private String id;
@Column (name = "NOMBRE")
private String nombre;
@Column(name = "AP_PATERNO")
private String paterno;
@Column(name ="AP_MATERNO")
private String materno;
@Column(name = "DNI")
private String dni;
@Column(name = "CAMPO1")
private String campo1;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getPaterno() {
	return paterno;
}
public void setPaterno(String paterno) {
	this.paterno = paterno;
}
public String getMaterno() {
	return materno;
}
public void setMaterno(String materno) {
	this.materno = materno;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getCampo1() {
	return campo1;
}
public void setCampo1(String campo1) {
	this.campo1 = campo1;
}
public String getCampo2() {
	return campo2;
}
public void setCampo2(String campo2) {
	this.campo2 = campo2;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Column(name = "CAMPO2")
private String campo2;



}
