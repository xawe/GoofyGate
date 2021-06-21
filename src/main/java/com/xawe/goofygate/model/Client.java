package com.xawe.goofygate.model;

import java.util.Date;

public class Client {
	
	private String id;
	private Date lastRequest;
	private Integer hotCount;
	private Boolean isInCooldown;
	private Integer cooldownCount;
	private Date cooldownUntil;
	
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getLastRequest() {
		return lastRequest;
	}
	public void setLastRequest(Date lastRequest) {
		this.lastRequest = lastRequest;
	}
	public Integer getHotCount() {
		return hotCount;
	}
	public void setHotCount(Integer hotCount) {
		this.hotCount = hotCount;
	}
	public Boolean getIsInCooldown() {
		return isInCooldown;
	}
	public void setIsInCooldown(Boolean isInCooldown) {
		this.isInCooldown = isInCooldown;
	}
	public Integer getCooldownCount() {
		return cooldownCount;
	}
	public void setCooldownCount(Integer cooldownCount) {
		this.cooldownCount = cooldownCount;
	}
	public Date getCooldownUntil() {
		return cooldownUntil;
	}
	public void setCooldownUntil(Date cooldownUntil) {
		this.cooldownUntil = cooldownUntil;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cooldownCount == null) ? 0 : cooldownCount.hashCode());
		result = prime * result + ((cooldownUntil == null) ? 0 : cooldownUntil.hashCode());
		result = prime * result + ((hotCount == null) ? 0 : hotCount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isInCooldown == null) ? 0 : isInCooldown.hashCode());
		result = prime * result + ((lastRequest == null) ? 0 : lastRequest.hashCode());
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
		Client other = (Client) obj;
		if (cooldownCount == null) {
			if (other.cooldownCount != null)
				return false;
		} else if (!cooldownCount.equals(other.cooldownCount))
			return false;
		if (cooldownUntil == null) {
			if (other.cooldownUntil != null)
				return false;
		} else if (!cooldownUntil.equals(other.cooldownUntil))
			return false;
		if (hotCount == null) {
			if (other.hotCount != null)
				return false;
		} else if (!hotCount.equals(other.hotCount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isInCooldown == null) {
			if (other.isInCooldown != null)
				return false;
		} else if (!isInCooldown.equals(other.isInCooldown))
			return false;
		if (lastRequest == null) {
			if (other.lastRequest != null)
				return false;
		} else if (!lastRequest.equals(other.lastRequest))
			return false;
		return true;
	}

}
