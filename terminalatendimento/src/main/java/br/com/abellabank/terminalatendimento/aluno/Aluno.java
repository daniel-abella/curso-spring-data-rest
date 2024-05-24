package br.com.abellabank.terminalatendimento.aluno;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Aluno {

	@Id @GeneratedValue
	private int matricula;
	
	private String nome;
	private String curso;
}
