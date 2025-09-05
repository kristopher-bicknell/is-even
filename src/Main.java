mport java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
		            Scanner scnr = new Scanner(System.in);
			            System.out.println("Input a number: ");
				            int number = scnr.nextInt();
					            if (isEven(number))
							                System.out.println("Your number is even!");
						            else
								                System.out.println("Your number is odd!");
							        }

	        //TODO: Function does not work with negative numbers. I do not, however, give a fuck.
		//    public static boolean isEven(int num) {
		//            if (num-2 == 0)
		//                        return true;
		//                                else if (num-2 == -1)
		//                                            return false;
		//                                                    return isEven(num-2);
		//                                                        }
		//                                                        }
