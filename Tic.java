import java.util.*;
public class Tic
{
	public static void main(String[] args)
	{
		List<String> grid = new ArrayList<String>();
		grid = buildarr();
		System.out.println(buildgrid(grid));
		Scanner in = new Scanner(System.in);
		int no_moves = 0;
		String moves;
		//
		//
		//
		while(no_moves<9)
		{
			System.out.print("Player one make a move:\t");
			moves = in.next();
			if(moves.equals("100"))
			{
				break;
			}
			for(int i = 0; i < grid.size(); i++)
			{
    			if(moves.equals(Integer.toString(i)))
    			{
    				grid.set(i,"X");
    			}
			}
			System.out.println(buildgrid(grid));
			no_moves+=1;
			if(checkgridx(grid).equals("Yes"))
			{
				System.out.println("Player One wins!");
				break;
			}

			System.out.print("Player two make a move:\t");
			moves = in.next();
			if(moves.equals("100"))
			{
				break;
			}
			for(int i = 0; i < grid.size(); i++)
			{
    			if(moves.equals(Integer.toString(i)))
    			{
    				grid.set(i,"O");
    			}
			}
			System.out.println(buildgrid(grid));
			no_moves+=1;
			if(checkgrido(grid).equals("Yes"))
			{
				System.out.println("Player Two wins!");
				break;
			}
		}	

	}

	public static String buildgrid(List<String> grid)
	{
		String output = "";
		for(int i = 0;i<grid.size();i++)
		{
			if(i % 3 == 0 && i != 0)
			{
				output+="\n"+"------"+"\n";
			}
			output+=""+grid.get(i)+"|";
		}
		return output;
	}

	public static ArrayList<String> buildarr()
	{
		ArrayList<String> x = new ArrayList<String>();
		for(int i = 0;i<9;i++)
		{
			x.add(Integer.toString(i));
		}
		return x;
	}

	public static String checkgridx(List<String> grid)
	{
		int count_x = 0;
		int count_o = 0;
		for(int i = 0;i<grid.size();i++)
		{
			if(i==0 || i==3 || i==6)
			{
				if(grid.get(i).equals("X")&&grid.get(i+1).equals("X")&&grid.get(i+2).equals("X"))
				{
					return "Yes";
				}
		    }
		    if(i>=0 && i < 3)
		    {
		    	if(grid.get(i).equals("X")&&grid.get(i+3).equals("X")&&grid.get(i+6).equals("X"))
				{
					return "Yes";
				}
		    }
		    if(i==0)
		    {
		    	if(grid.get(i).equals("X")&&grid.get(i+4).equals("X")&&grid.get(i+8).equals("X"))
				{
					return "Yes";
				}
		    }
		    if(i==2)
		    {
		    	if(grid.get(i).equals("X")&&grid.get(i+2).equals("X")&&grid.get(i+4).equals("X"))
				{
					return "Yes";
				}
		    }
		}
		return "No";
	}
	public static String checkgrido(List<String> grid)
	{
		int count_x = 0;
		int count_o = 0;
		for(int i = 0;i<grid.size();i++)
		{
			if(i==0 || i==3 || i==6)
			{
				if(grid.get(i).equals("O")&&grid.get(i+1).equals("O")&&grid.get(i+2).equals("O"))
				{
					return "Yes";
				}
		    }
		    if(i>=0 && i < 3)
		    {
		    	if(grid.get(i).equals("O")&&grid.get(i+3).equals("O")&&grid.get(i+6).equals("O"))
				{
					return "Yes";
				}
		    }
		    if(i==0)
		    {
		    	if(grid.get(i).equals("O")&&grid.get(i+4).equals("O")&&grid.get(i+8).equals("O"))
				{
					return "Yes";
				}
		    }
		    if(i==2)
		    {
		    	if(grid.get(i).equals("O")&&grid.get(i+2).equals("O")&&grid.get(i+4).equals("O"))
				{
					return "Yes";
				}
		    }
		}
		return "No";
	}
}