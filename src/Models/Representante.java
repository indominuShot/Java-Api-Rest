package Models;

import java.util.ArrayList;

public class Representante {
	private int id;
	private String nome;
	private String empresa;
	private ArrayList<Telefones> contatos;
	
	public int get_id() {
		return this.id;
	}
	
	public void set_id(int id) {
		this.id = id;
	}
	
	public String get_nome() {
		return nome;
	}
	
	public void set_nome(String nome) {
		this.nome = nome;
	}

	public String get_empresa() {
		return empresa;
	}
	
	public void set_empresa(String empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Telefones> get_contatos() {
		return contatos;
	}
	
	public void set_contatos(ArrayList<Telefones> contatos) {
		this.contatos = contatos;
	}
}
