import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TimeAndTimeAgain {

		public static void main(String[] args) {
			try(Scanner input = new Scanner(System.in))
			{
				int numTimeCases = input.nextInt();
				
				Pattern secondRegex = Pattern.compile(".*(\\d+)s.*");
				
				for(int i = 0; i < numTimeCases; i++)
					{
						int hour = 0;
						int minute = 0;
						int second = 0;
						
						String data = input.nextLine();
						
						Matcher matcher = secondRegex.matcher(data);
						if(matcher.matches())
							{
								second = Integer.parseInt(matcher.group(1));
								System.out.println();
							}
					}
			}
				
			// Format needed HH:MM:SS
			// Read in input
			// First number is the number of items
				
			// Loop through content
				
				
			// Print out the numbers in appropriate format
			}

		}

	
