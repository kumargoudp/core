package entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the LOGIN database table.
 * 
 */
@Entity
@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l")
public class Login   {
	private static final long serialVersionUID = 1L;

	@Id()
	//@SequenceGenerator(name="LOGIN_LOGINID_GENERATOR", sequenceName="LOGIN_SEQ ",initialValue=1,allocationSize=1)
	@GeneratedValue
	@Column(name="LOGIN_ID")
	private long loginId;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_LOGIN_ATTEMPT")
	private Date lastLoginAttempt;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_SUCCESSFUL_LOGIN")
	private Date lastSuccessfulLogin;

	@Column(name="NO_OF_ATTEMPTS")
	private BigDecimal noOfAttempts;

	private String password;

	public long getLoginId() {
		return loginId;
	}

	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	public Date getLastLoginAttempt() {
		return lastLoginAttempt;
	}

	public void setLastLoginAttempt(Date lastLoginAttempt) {
		this.lastLoginAttempt = lastLoginAttempt;
	}

	public Date getLastSuccessfulLogin() {
		return lastSuccessfulLogin;
	}

	public void setLastSuccessfulLogin(Date lastSuccessfulLogin) {
		this.lastSuccessfulLogin = lastSuccessfulLogin;
	}

	public BigDecimal getNoOfAttempts() {
		return noOfAttempts;
	}

	public void setNoOfAttempts(BigDecimal noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getPasswordExpDt() {
		return passwordExpDt;
	}

	public void setPasswordExpDt(Date passwordExpDt) {
		this.passwordExpDt = passwordExpDt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="PASSWORD_EXP_DT")
	private Date passwordExpDt;

	private String username;

	
	
}