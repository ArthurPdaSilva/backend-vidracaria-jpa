package br.edu.ifpb.mt.dac.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "CLIENTE")
@DiscriminatorValue("B")
public class Cliente extends Pessoa {
	
	private static final long serialVersionUID = 2225815404632585541L;

	public Cliente() {}
	
}
