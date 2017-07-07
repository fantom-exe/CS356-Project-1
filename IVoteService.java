package com.company;

import java.util.ArrayList;

class IVoteService {
	
	private ArrayList<Student> studentsVoted = new ArrayList<>();
	
	// Counters
	private int[] multChoiceAnsCounter = {0, 0, 0, 0, 0};
	private int[] trueFalseCounter = {0, 0};
	
	// Set answers
	public void submitAnsMultChoice(char answer, Student student) {
		student.setMultChoiceAns(answer);
		
		studentsVoted.add(student);
	}
	
	public void submitAnsTrueFalse(boolean answer, Student student) {
		student.setTrueFalseAns(answer);
		
		studentsVoted.add(student);
	}
	
	// results
	public void printMultChoiceResults() {
		
		for(int i = 0; i < studentsVoted.size(); i++) {
			switch (studentsVoted.get(i).getMultChoiceAns()) {
				case 'A':
					multChoiceAnsCounter[0]++;
					break;
				case 'B':
					multChoiceAnsCounter[1]++;
					break;
				case 'C':
					multChoiceAnsCounter[2]++;
					break;
				case 'D':
					multChoiceAnsCounter[3]++;
					break;
				case 'E':
					multChoiceAnsCounter[4]++;
					break;
			}
		}
		
		System.out.print("\n" + " A: " + multChoiceAnsCounter[0]);
		System.out.print(" B: " + multChoiceAnsCounter[1]);
		System.out.print(" C: " + multChoiceAnsCounter[2]);
		System.out.print(" D: " + multChoiceAnsCounter[3]);
		System.out.print(" E: " + multChoiceAnsCounter[4]);
		
	}
	
	public void printTrueFalseResults() {
		
		for(int i = 0; i < studentsVoted.size(); i++) {
			
			if(studentsVoted.get(i).getTrueFalseAns())
				trueFalseCounter[0] += 1;
			else
				trueFalseCounter[1] += 1;
			
		}
		
		System.out.println("True: " + trueFalseCounter[0]);
		System.out.println("False: " + trueFalseCounter[1]);
	}
	
}
