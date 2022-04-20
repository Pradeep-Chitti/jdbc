package com.xworkz.gamesApp.DTO;

public class GamesDTO {
	
	private int gameId;
	private String gameName;
	private int noOfPlayers;
    private String gameType;
    
    public GamesDTO() {
    	
    }
    
    public GamesDTO(int gameId,String gameName,int noOfPlyaers,String gameType) {
    	
    	super();
    	this.gameId=gameId;
    	this.gameName=gameName;
    	this.noOfPlayers=noOfPlyaers;
    	this.gameType=gameType;
    }
    public int getGameId() {
    	return gameId;
    }
    public void setGameId() {
    	this.gameId=gameId;
    }

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
    
}
