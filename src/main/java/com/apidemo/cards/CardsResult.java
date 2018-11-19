package com.apidemo.cards;
import java.util.List;

public class CardsResult {

	private Boolean success;
	private List<Card> cards;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

}