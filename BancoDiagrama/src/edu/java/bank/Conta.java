package edu.java.bank;
import java.util.ArrayList;
import java.util.Date;

public class Conta {
	private Double saldo;
	private String numero;
	private String senha;
	
	private ArrayList<Transacao> historico = new ArrayList<>();
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<Transacao> getHistorico() {
		return historico;
	}
	public void setHistorico(ArrayList<Transacao> historico) {
		this.historico = historico;
	}
	
	public boolean efetuarSaque (double valor) {
		return true;
	}
	
	public boolean efetuarDeposito (double valor) {
		return true;
	}
	
	public boolean efetuarPagamento (double valor, String boleto) {
		return true;
	}
	
	public Transacao extrato(Date inicio, Date finall) { 
		return extrato(finall, finall);
	}
}
