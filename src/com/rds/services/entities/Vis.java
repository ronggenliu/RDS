package com.rds.services.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="viss")
public class Vis implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5234717877572409220L;

	private String id;
	private String startDate;
	private String fixingDate;
	private String endDate;
	private String paySw;
	private String rate;
	private String spread;

	public Vis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vis(String id, String startDate, String fixingDate, String endDate, String paySw, String rate,
			String spread) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.fixingDate = fixingDate;
		this.endDate = endDate;
		this.paySw = paySw;
		this.rate = rate;
		this.spread = spread;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((fixingDate == null) ? 0 : fixingDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((paySw == null) ? 0 : paySw.hashCode());
		result = prime * result + ((rate == null) ? 0 : rate.hashCode());
		result = prime * result + ((spread == null) ? 0 : spread.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		Vis other = (Vis) obj;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (fixingDate == null) {
			if (other.fixingDate != null)
				return false;
		} else if (!fixingDate.equals(other.fixingDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (paySw == null) {
			if (other.paySw != null)
				return false;
		} else if (!paySw.equals(other.paySw))
			return false;
		if (rate == null) {
			if (other.rate != null)
				return false;
		} else if (!rate.equals(other.rate))
			return false;
		if (spread == null) {
			if (other.spread != null)
				return false;
		} else if (!spread.equals(other.spread))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getFixingDate() {
		return fixingDate;
	}

	public void setFixingDate(String fixingDate) {
		this.fixingDate = fixingDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPaySw() {
		return paySw;
	}

	public void setPaySw(String paySw) {
		this.paySw = paySw;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getSpread() {
		return spread;
	}

	public void setSpread(String spread) {
		this.spread = spread;
	}

}
