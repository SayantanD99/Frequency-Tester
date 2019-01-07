import java.util.*;

class FrequencyTest
{
  public static int frequency(String s, String w)
  {
    int c=0,i;
    String words[]=s.split(" ");
    for (i=0;i<words.length;i++)
    {
      if(w.equalsIgnoreCase(words[i]))
		++c;
    }
    return c;
  }
  public static void main(String a[])
  {
    String str,word;
	int ch;
	Scanner sc = new Scanner(System.in);
	do
	{
		System.out.println("1. Check ");
		System.out.println("2. Exit");
		System.out.println("Enter Your Choice : ");
		ch=sc.nextInt();
		sc.nextLine();
		if(ch==1)
		{
		System.out.println("Enter Sentence : (** Kindly give a space before and after '.' for accurate results) ");
		str=sc.nextLine();
		System.out.println("Enter the word whoose frequency you wanna check - ");
		word=sc.nextLine();
		System.out.println("Count = "+frequency(str,word));
		System.out.println();
		}
		else if(ch==2)
		{
			System.out.println("Exiting...");
			System.exit(0);
		}
		else
		{
		System.out.println("Invalid Choice !! Re-enter ");
		continue;
		}
	}while(true);
}
  }