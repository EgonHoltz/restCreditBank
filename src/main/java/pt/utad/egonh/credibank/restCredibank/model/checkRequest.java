package pt.utad.egonh.credibank.restCredibank.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class checkRequest {
	@JsonProperty("checkId")
	private String checkId;
	@JsonProperty("amount")
	private BigDecimal amount;
	public checkRequest() {
		super();
	}
	public checkRequest(String checkId, BigDecimal amount) {
		super();
		this.checkId = checkId;
		this.amount = amount;
	}
	public String getCheckId() {
		return checkId;
	}
	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "checkRequest [checkId=" + checkId + ", amount=" + amount + "]";
	}
	
}
