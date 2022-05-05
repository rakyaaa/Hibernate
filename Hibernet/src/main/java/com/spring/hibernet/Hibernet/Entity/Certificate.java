package com.spring.hibernet.Hibernet.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String certificateName;
	private String duration;
	private String status;
	
	public Certificate() {
		// TODO Auto-generated constructor stub
	}

	public Certificate(String certificateName, String duration, String status) {
		super();
		this.certificateName = certificateName;
		this.duration = duration;
		this.status = status;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Certificate [certificateName=" + certificateName + ", duration=" + duration + ", status=" + status
				+ "]";
	}
	

}
