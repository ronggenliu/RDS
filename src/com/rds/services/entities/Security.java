package com.rds.services.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "securites")
public class Security implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7930322341342868877L;

	private String id;
	private String effectivedt;
	private String firstpmtdt;
	private String maturitydt;
	private String description;
	private String coupon;
	private String payfreq;
	private String resetfreq;
	private String currsettle;
	private String fpmltype;
	private String compsectypecode;

	public Security() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Security(String cusip, String effectivedt, String firstpmtdt, String maturitydt, String description,
			String coupon, String payfreq, String resetfreq, String currsettle, String fpmltype,
			String compsectypecode) {
		super();
		this.id = cusip;
		this.effectivedt = effectivedt;
		this.firstpmtdt = firstpmtdt;
		this.maturitydt = maturitydt;
		this.description = description;
		this.coupon = coupon;
		this.payfreq = payfreq;
		this.resetfreq = resetfreq;
		this.currsettle = currsettle;
		this.fpmltype = fpmltype;
		this.compsectypecode = compsectypecode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compsectypecode == null) ? 0 : compsectypecode.hashCode());
		result = prime * result + ((coupon == null) ? 0 : coupon.hashCode());
		result = prime * result + ((currsettle == null) ? 0 : currsettle.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((effectivedt == null) ? 0 : effectivedt.hashCode());
		result = prime * result + ((firstpmtdt == null) ? 0 : firstpmtdt.hashCode());
		result = prime * result + ((fpmltype == null) ? 0 : fpmltype.hashCode());
		result = prime * result + ((maturitydt == null) ? 0 : maturitydt.hashCode());
		result = prime * result + ((payfreq == null) ? 0 : payfreq.hashCode());
		result = prime * result + ((resetfreq == null) ? 0 : resetfreq.hashCode());
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
		Security other = (Security) obj;
		if (compsectypecode == null) {
			if (other.compsectypecode != null)
				return false;
		} else if (!compsectypecode.equals(other.compsectypecode))
			return false;
		if (coupon == null) {
			if (other.coupon != null)
				return false;
		} else if (!coupon.equals(other.coupon))
			return false;
		if (currsettle == null) {
			if (other.currsettle != null)
				return false;
		} else if (!currsettle.equals(other.currsettle))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (effectivedt == null) {
			if (other.effectivedt != null)
				return false;
		} else if (!effectivedt.equals(other.effectivedt))
			return false;
		if (firstpmtdt == null) {
			if (other.firstpmtdt != null)
				return false;
		} else if (!firstpmtdt.equals(other.firstpmtdt))
			return false;
		if (fpmltype == null) {
			if (other.fpmltype != null)
				return false;
		} else if (!fpmltype.equals(other.fpmltype))
			return false;
		if (maturitydt == null) {
			if (other.maturitydt != null)
				return false;
		} else if (!maturitydt.equals(other.maturitydt))
			return false;
		if (payfreq == null) {
			if (other.payfreq != null)
				return false;
		} else if (!payfreq.equals(other.payfreq))
			return false;
		if (resetfreq == null) {
			if (other.resetfreq != null)
				return false;
		} else if (!resetfreq.equals(other.resetfreq))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEffectivedt() {
		return effectivedt;
	}

	public void setEffectivedt(String effectivedt) {
		this.effectivedt = effectivedt;
	}

	public String getFirstpmtdt() {
		return firstpmtdt;
	}

	public void setFirstpmtdt(String firstpmtdt) {
		this.firstpmtdt = firstpmtdt;
	}

	public String getMaturitydt() {
		return maturitydt;
	}

	public void setMaturitydt(String maturitydt) {
		this.maturitydt = maturitydt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public String getPayfreq() {
		return payfreq;
	}

	public void setPayfreq(String payfreq) {
		this.payfreq = payfreq;
	}

	public String getResetfreq() {
		return resetfreq;
	}

	public void setResetfreq(String resetfreq) {
		this.resetfreq = resetfreq;
	}

	public String getCurrsettle() {
		return currsettle;
	}

	public void setCurrsettle(String currsettle) {
		this.currsettle = currsettle;
	}

	public String getFpmltype() {
		return fpmltype;
	}

	public void setFpmltype(String fpmltype) {
		this.fpmltype = fpmltype;
	}

	public String getCompsectypecode() {
		return compsectypecode;
	}

	public void setCompsectypecode(String compsectypecode) {
		this.compsectypecode = compsectypecode;
	}

}
