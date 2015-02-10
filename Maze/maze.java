public class maze{
    public char[][] mazesolve(char[][]maze){
	int x; //xlocation of Start
	int y; //ylocation of Start
	char[][] copy; //copy of maze
	copy = new char[maze.length][maze[0].length];
	for(int i=0;i<maze.length;i++){
	    for(int z=0;z<maze[i].length;z++){
		copy[i][z] = maze[i][z];
		if(maze[i][z] == 'S'){
		    int x = z;
		    int y = i;
		}
	    }
	}
	return mazehelp(copy, x, y);
    }

}
