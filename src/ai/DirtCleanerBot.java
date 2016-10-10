package ai;

import java.util.Scanner;

public class DirtCleanerBot {

	private String mat[][];
	private String grid[];
	private int botXPosition= 0;
	private int botYPosition =0;
	public static void main(String[] args) 
	{
		DirtCleanerBot bot = new DirtCleanerBot();
		bot.readInput();
		bot.cleanDirt();

	}
	private void readInput()
	{
		int n=5;

		Scanner in = new Scanner(System.in);

		grid= new String[n];
		for(int i = 0; i < n; i++) {
			grid[i] = in.next();
		}

		buildTheMatrix(n);
	}
	private void  buildTheMatrix(int n)
	{
		mat= new String[n][n];
		for (int i=0;i<n;i++)
		{	    
			String split[] = grid[i].split("");
			for (int j=0;j<n;j++)
			{
				mat[i][j] = split[j];
			}
		}
		int ip=0;
		int jp=0;
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(mat[i][j].equals("b"))
				{
					botXPosition=i;
					botYPosition=j;
				}
			}
		}
	}
	
	private void cleanDirt()
	{
		System.out.println(botXPosition + "-" + botYPosition);
	}
}
