package ec.practica.springboot.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "clave")
	private String clave;

	@Column(name = "estado")
	private String estado;

	@Column(name = "price")
	private BigDecimal price;

	@CreationTimestamp
	private Date createdAt;

	@CreationTimestamp
	private Date updatedAt;

	@OneToOne
	@MapsId
	@JoinColumn(name = "identificacion")

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Cuenta> cuenta;

	private Persona persona;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Cuenta> getCuenta() {
		return cuenta;
	}

	public void setCuenta(List<Cuenta> cuenta) {
		this.cuenta = cuenta;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
