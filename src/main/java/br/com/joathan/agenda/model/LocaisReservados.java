package br.com.joathan.agenda.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
public class LocaisReservados implements Serializable {
/*
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//@OneToMany // mudei aqui
	//private List<Local> local; // assim ele cria array de locias no REST
	@OneToOne
	private Local local;
	//@OneToMany // mudei aqui
	//private List<Reserva> reserva; // assim ele cria array de locias no REST
	@OneToOne
	private Reserva reserva;
	@Temporal(TemporalType.DATE)
	private Calendar dt_inicio;
	@Temporal(TemporalType.DATE)
	private Calendar dt_fim;
	
	private float valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Local getLocais() {
		return local;
	}

	public void setLocais(Local locais) {
		this.local = locais;
	}

	public Reserva getReservas() {
		return reserva;
	}

	public void setReservas(Reserva reservas) {
		this.reserva = reservas;
	}

	public Calendar  getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(Calendar  dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public Calendar  getDt_fim() {
		return dt_fim;
	}

	public void setDt_fim(Calendar  dt_fim) {
		this.dt_fim = dt_fim;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocaisReservados other = (LocaisReservados) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
*/
}
