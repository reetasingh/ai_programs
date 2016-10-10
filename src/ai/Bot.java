/* Hackerrank AI programs */
/* Bot Building */
/* Link : https://www.hackerrank.com/challenges/saveprincess */
//Princess Peach is trapped in one of the four corners of a square grid. You are in the center of the grid and can move one step at a time in any of the four directions. Can you rescue the princess? 
//Input format
//The first line contains an odd integer N (3 <= N < 100) denoting the size of the grid. This is followed by an NxN grid. Each cell is denoted by '-' (ascii value: 45). The bot position is denoted by 'm' and the princess position is denoted by 'p'.
//Grid is indexed using Matrix Convention
//Output format
//Print out the moves you will take to rescue the princess in one go. The moves must be separated by '\n', a newline. The valid moves are LEFT or RIGHT or UP or DOWN.

//Sample input 
//3
//---
//-m-
//p--

//Sample output 
//DOWN
//LEFT





package ai;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bot {
	static void displayPathtoPrincess(int n, String [] grid){
		String [][] mat;
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
		int im=0;
		int jm=0;
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(mat[i][j].equals("p"))
				{
					ip=i;
					jp=j;
				}
				if(mat[i][j].equals("m"))
				{
					im=i;
					jm=j;
				}
			}
		}
		calculateDistance(ip,jp,im,jm,n);

	}
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		//System.out.println(m);
		String grid[] = new String[m];
		for(int i = 0; i < m; i++) {
			grid[i] = in.next();
		}
		displayPathtoPrincess(m,grid);
	}

	static private void calculateDistance(int ip,int jp,int im,int jm,int n)
	{
		if (ip==im)
		{
			if (jp > jm)
			{
				int total_steps = Math.abs(jp-jm);
				int o = 0;
				while (o < total_steps)
				{
					System.out.println("RIGHT");
					o++;

				}
			}
			if (jp < jm)
			{
				int total_steps = Math.abs(jp-jm);
				int o = 0;
				while (o < total_steps)
				{
					System.out.println("LEFT");
					o++;
				}
			}
		}
		else
		{
			if (ip > im)
			{
				int total_steps = Math.abs(ip-im);
				int o = 0;
				while (o < total_steps)
				{
					System.out.println("DOWN");
					o++;
				}
			}
			else if (ip < im)
			{
				int total_steps = Math.abs(ip-im);
				int o = 0;
				while (o < total_steps)
				{
					System.out.println("UP");
					o++;
				}
			}

			if (jp > jm)
			{
				int total_steps = Math.abs(jp-jm);
				int o = 0;
				while (o < total_steps)
				{
					System.out.println("RIGHT");
					o++;
				}
			}
			else if (jp < jm)
			{
				int total_steps = Math.abs(jp-jm);
				int o = 0;
				while (o < total_steps)
				{
					System.out.println("LEFT");
					o++;
				}
			}
		}
	}

}