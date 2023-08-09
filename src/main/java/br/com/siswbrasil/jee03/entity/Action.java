package br.com.siswbrasil.jee03.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "actions")
@NamedQuery(name = "Action.findAll", query = "SELECT e FROM Action e")
@NamedQuery(name = "Action.findAction", query = "SELECT e FROM Action e WHERE "
		+ "e.name = :name ")
public class Action implements Serializable {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "eventName")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Action() {
	}

	public Action(String name) {
		super();
		this.name = name;
	}

}
