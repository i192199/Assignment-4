package application;

public class Party {
	String name;
	int votes;
	
	public Party(String n) {
		name=n;
		votes=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	public void addVote() {
		votes++;
	}
}
