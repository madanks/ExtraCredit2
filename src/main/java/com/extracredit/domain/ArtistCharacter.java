package com.extracredit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ArtistCharacter {
	@Id
	@GeneratedValue
	private int charid;

	private String characterName;

	private String characterDescription;

	public ArtistCharacter() {

	}

	public ArtistCharacter(String name, String description) {
		characterName = name;
		characterDescription = description;
	}

	@ManyToOne
	@JoinColumn(name = "artist")
	private Artist artist;

	public int getCharid() {
		return charid;
	}

	public String getCharacterName() {
		return characterName;
	}

	public String getCharacterDescription() {
		return characterDescription;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setCharid(int charid) {
		this.charid = charid;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public void setCharacterDescription(String characterDescription) {
		this.characterDescription = characterDescription;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

}
