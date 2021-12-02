package application;

import java.util.*;

public class EVM {
	Vector<Party> parties;

	public EVM() {
		parties = new Vector<Party>(10);
	}

	public boolean addParty(String partyName) {
		Party P = new Party(partyName);
		for (int i = 0; i < parties.size(); i++) {
			if (parties.get(i).getName().equalsIgnoreCase(partyName)) {
				System.out.println("Party already exists");
				return false;
			}
		}
		parties.add(P);
		return true;
	}

	public boolean vote(String partyName) {
		for (int i = 0; i < parties.size(); i++) {
			if (parties.get(i).getName().equalsIgnoreCase(partyName)) {
//				System.out.println("Party already exists");
				parties.get(i).addVote();
				return true;
			}
		}
		return false; // party not found
	}

	public void displayResults() {
		for (int i = 0; i < parties.size(); i++) {
			System.out.println("Party Name" + parties.get(i).getName());
			System.out.println("Votes" + parties.get(i).getVotes());
		}
	}

	public int totalVotes() {
		int votes = 0;
		for (int i = 0; i < parties.size(); i++) {
			votes += parties.get(i).getVotes();
		}
		return votes;
	}

}