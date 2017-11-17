import java.util.Scanner;

public class GameManager {
	static Scanner move = new Scanner(System.in);

	
	private int[][] swampMapArray = new int[10][10];


	private int spawnLocation = 1;
	private int treasureLocation = 99;
	
	private int x = 10;//map size
	private int y = 10;
	
	private int playerY = 0; //player
	private int playerX = 0;

	private int tx = 9;//treasure
	private int ty = 9;
	
	
	public GameManager( int px, int py, int tx, int ty) {
		super();
		
		this.playerY = px;
		this.playerX = py;
		this.tx = tx;
		this.ty = ty;
	
		swampMapArray[px][py] = spawnLocation;// player location
		swampMapArray[tx][ty] = treasureLocation; // treasure
			
		System.out.println("Enter movement to move player:");

		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {

				System.out.print(swampMapArray[i][j] + " ");

			}
			System.out.println(""); // prints map
		}
		
		
		
	}

		
			void Dial() {
				
				DialMap dM = new DialMap();
				dM.describeLocation();
			}
			
				void treasureFound() {
		
				System.out.println("congratulations");
		
			}
		
		
		void MovePlayer(GameManager g) {
			
			boolean foundTreasure = true;
			
			do{
			if (move.hasNext("n")) {

				System.out.println("Move player:");
				move.nextLine();
				moveNorth(g);
			}
			if (move.hasNext("s")) {
				System.out.println("Move player:");
				move.nextLine();
				moveSouth(g);
			}
			if (move.hasNext("e")) {
				System.out.println("Move player:");
				move.nextLine();
				moveEast(g);
			}
			if (move.hasNext("w")) {
				System.out.println("Move player:");
				move.nextLine();
				moveWest(g);
			}
			
			if (playerY == ty && playerX == tx) {
							
				treasureFound();
				foundTreasure=false;
				
			}
			}while(foundTreasure);
			
		}
		
				void moveNorth(GameManager g) {
					
					playerY-= 1;//up
					g = new GameManager(playerY,playerX,9,9);
					
					}

				void moveSouth(GameManager g) {
					playerY+= 1;//down
					g = new GameManager(playerY,playerX,9,9);
				}
			
				void moveWest(GameManager g) {
					playerX-= 1;//left
					g = new GameManager(playerY,playerX,9,9);
				}
				
				void moveEast(GameManager g) {
					playerX+= 1;//right
					g = new GameManager(playerY,playerX,9,9);
				}
				
	}
