package pojo;

public class Score {
	
	private String  teamName;
	private Integer scorecard;
	
	public void getScore() {
		System.out.println("Scorecard");
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getScorecard() {
		return scorecard;
	}
	public void setScorecard(Integer scorecard) {
		this.scorecard = scorecard;
	}

}
