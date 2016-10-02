/*Introduction to Arrays*/
public class topic1 {
	public String print()
	{
		return "1. An array can hold multiple values of the same data type simultaneously.\n"
				+ "2. By default, Java initializes array element with 0.\n"
				+ "3. Java performs array bounds checking, which means that it does not allow a statement to use a subscript outside the range of valid subscripts for an array.\n"
				+ "E.g. int[] number and int number[] are the same.\n"
				+ "4. Individual array elements are processed like any other type of variable.\n"
				+ "5. The enhanced for loop is designed to iterate once for every element in an array. Each time the loop iterates, it copies an array element to a variable.\n"
				+ "Formate: for(dataType elementVariable : array) {statement;}\n"
				+ "E.g:     for(int val: numbers){System.out.println(val)}.  int[] number ={3,6,9,}\n"
				+ "6. Because an array is an object, there is a distinction between an array and the variable that references it.\n"
				+ "7. An array can be passed as an argument to a method. To pass an array, you pass the value in the variable that references the array.\n"
				+ "8. In addition to accepting arrays as arguments, methods may also return arrays.\n"
				+ "9. An array of String objects may be created, but if the array is uninitilized, each String in the array must be created individually.\n"
				+ "10. You may created arrays of objects that are instances of classes that you have written.\n";
	}
}
