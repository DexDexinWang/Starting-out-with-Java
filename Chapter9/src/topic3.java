/*Polymorphism*/
public class topic3 {
	public String print()
	{
		return "1. Polymorphism, it means that ability to take many forms. \n"
				+ "E.g. GradeActivity exam = new FinalExcam(50,7) WORK!\n"
				+ "FinalExam is a subclass of the GradeActivity. FinalExam is a kind of GradeActivity. Hence, it works."
				+ "E.g. exam.getPointsEach() ERROR! WON`T WORK. Because exam is GradeActivity variable. It does not know getPointEach() which is defined in FinalExam class.\n"
				+ "2. Polymorphsim has potenital problem exists with overriding or overloadding \n"
				+ "E.g. \n GradedActivity exam = new PassFailActivity(60)  \\\\It is polymorphsim.\n"
				+ "exam.setScore(70);\n"
				+ "System.out.println(exam.getGrade()) \\\\ subclass override getGrade() with superclass\n"
				+ "3. JAVA performs dynamic binding or late binding when a variable contains a polymorphic reference\n"
				+ "4. This means that the JVM determines at runtime which method to call, depending on the type of object that the variable reference.\n"
				+ "Hence, The last statement in this code will run getGrade() from PassFileActivity.\n"
				+ "5. instanceof, this operator in JAVA named instanceof that you can use to determine whether an object is an instance of a particular class.\n"
				+ "E.g. \n GradeActivity activity =new GradedActivity();\n"
				+ "if(activity instanceof GradedActivity)		The reuslt is true. \n"
				+ "E.g. \n GradeActivity activity =new FinalExam(20,2);\n"
				+ "if(activity instanceof GradedActivity)		The reuslt is true. \n";
	}
}
