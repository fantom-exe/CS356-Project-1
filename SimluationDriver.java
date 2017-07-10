/*
1) create a question type and configure the answers;
2) configure the question for iVote Service;
3) randomly generate a number students and the answers;
4) submit all the students’ answers to iVote Service;
5) call the iVote Service output function to display the result.

 */

public class SimluationDriver {
	
	public static void main(String[] args) {
		// Initialize requirements
		IVoteService voteService = new IVoteService();
		
		// Question types
		TrueFalse trueFalse = new TrueFalse("The Earth is flat.");
//		MultipleChoice multipleChoice = new MultipleChoice("Which letters are vowels? (A, B, C, D, E)");
		
		// Initialize students
		Student s1 = new Student("Joe");
		Student s2 = new Student("Bob");
		Student s3 = new Student("Dan");
		Student s4 = new Student("Tom");
		Student s5 = new Student("Jon");
		Student s6 = new Student("Tim");
		Student s7 = new Student("Ted");
		Student s8 = new Student("Rob");
		
		// Submit TrueFalse answers
		voteService.submitAnsTrueFalse(false, s1);
		voteService.submitAnsTrueFalse(false, s2);
		voteService.submitAnsTrueFalse(true, s3);
		voteService.submitAnsTrueFalse(false, s4);
		voteService.submitAnsTrueFalse(false, s5);
		voteService.submitAnsTrueFalse(false, s6);
		voteService.submitAnsTrueFalse(true, s7);
		voteService.submitAnsTrueFalse(false, s8);
		
		// Submit MultipleChoice answers
//		voteService.submitAnsMultChoice('A', s1);
//		voteService.submitAnsMultChoice('C', s2);
//		voteService.submitAnsMultChoice('A', s3);
//		voteService.submitAnsMultChoice('E', s4);
//		voteService.submitAnsMultChoice('D', s5);
//		voteService.submitAnsMultChoice('B', s6);
//		voteService.submitAnsMultChoice('E', s7);
//		voteService.submitAnsMultChoice('E', s8);
		
		// Print results
		System.out.println(trueFalse.getQuestion());
		voteService.printTrueFalseResults();
		System.out.print("\n\n");
//		System.out.println(multipleChoice.getQuestion());
//		voteService.printMultChoiceResults();
	}
	
}
