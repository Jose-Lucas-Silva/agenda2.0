package br.com.joathan.agenda.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private double valor;
	@Temporal(TemporalType.DATE)
	private Calendar dt_vencimento;

	private boolean status;
	// @OneToMany(cascade = CascadeType.ALL)
	// private List<Local> locais;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Local> locais = new ArrayList<Local>();
	// private Set<Local> locais;
	@OneToOne
	private Usuario usuario;
	@OneToOne
	private Funcionario funcionario;

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Reserva() {
	}

	public List<Local> getLocais() {
		return locais;
	}

	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getDt_vencimento() {
		return dt_vencimento;
	}

	public void setDt_vencimento(Calendar dt_vencimento) {
		this.dt_vencimento = dt_vencimento;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public double somaLocais(ArrayList<Local> l) {
		int sum = 0;

		for (Local local : l) {
			sum += local.getValor();
		}
		return sum;

	}
}
