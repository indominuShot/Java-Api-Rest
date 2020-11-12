package Models;

public class Telefones {
  private int id;
  private String nome;
  private String numero;
  private String tipoTelefone;

  public int get_id(){
    return id;
  }

  public void set_id(int id){
    this.id = id;
  }

  public String get_nome(){
    return nome;
  }

  public void set_nome(String nome){
    this.nome = nome;
  }

  public String get_numero(){
    return numero;
  }

  public void set_numero(String numero){
    this.numero = numero;
  }

  public String get_tipoTelefone(){
    return tipoTelefone;
  }

  public void set_tipoTelefone(String tipoTelefone){
    this.tipoTelefone = tipoTelefone;
  }
}
