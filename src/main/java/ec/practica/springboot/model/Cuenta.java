package ec.practica.springboot.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "cuenta")
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCuenta;

    @Column(name = "numeroCuenta")
    private String numeroCuenta;

    @Column(name = "tipoCuenta")
    private String tipoCuenta;

    @Column(name = "saldoCuenta")
    private BigDecimal saldoCuenta;

    @Column(name = "estadoCuenta")
    private String estadoCuenta;

    @ManyToOne
    @JoinColumn(name = "id")
    private Cliente cliente;

    public long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public BigDecimal getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(BigDecimal saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}