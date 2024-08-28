public class Main {
    public final static int N = 10;
    public static void main(String[] args) {
        char [][] field = new char[N][N];
        int [][] cactusCoordinate = new int[N][N];
        for (int y = 0; y < N; y++){
            for (int x = 0; x < N; x++){
                field[x][y] = '-';
            }
        }
        //Add object on field
        {
            field[0][0] = 'Щ';
            //field[8][3] = 'Ч';
            addCactus(field, 3, 0);//addCactus(field,);
            addCactus(field, 4, 0);
            addCactus(field, 4, 1);
            addCactus(field, 7, 1);
            addCactus(field, 6, 1);
            addCactus(field, 3, 2);
            addCactus(field, 5, 2);
            addCactus(field, 9, 2);
            addCactus(field, 1, 3);
            addCactus(field, 6, 4);
            addCactus(field, 2, 5);
            addCactus(field, 5, 5);
            addCactus(field, 3, 6);
            addCactus(field, 5, 5);
            addCactus(field, 6, 6);
            addCactus(field, 7, 6);
            addCactus(field, 8, 6);
            addCactus(field, 3, 0);
            addCactus(field, 4, 0);
            addCactus(field, 4, 1);
            addCactus(field, 7, 1);
            addCactus(field, 6, 1);
            addCactus(field, 3, 2);
            addCactus(field, 5, 2);
            addCactus(field, 9, 2);
            addCactus(field, 1, 3);
            addCactus(field, 6, 4);
            addCactus(field, 2, 5);
            addCactus(field, 5, 5);
            addCactus(field, 3, 6);
            addCactus(field, 5, 5);
            addCactus(field, 6, 6);
            addCactus(field, 7, 6);
            addCactus(field, 8, 6);
            addCactus(field, 7, 7);
            addCactus(field, 7, 8);
            addCactus(field, 6, 9);
            addCactus(field, 5, 9);
        }
        findPath(field, 8, 3);

    }
    public static void findPath (char [][] field, int xStart, int yStart){
        char memory[][] = new  char[N][N];
        int x = xStart;
        int y = yStart;
        while (x != 0 || y !=0){
            char direction = where_from(field, x, y, memory);
            if (direction == 'N'){
                System.out.println("There is no path");
                return;
            } else if (direction == 'U'){
                field[x][y] = 'x';
                y--;
            } else if (direction == 'L'){
                field[x][y] = 'x';
                x--;
            }
        }
        printField(field);
    }
    public static char where_from (char [][] field, int x, int y, char[][] memory) {
        if (memory[x][y] != 0){
            return memory[x][y];
        }
        if (x > 0){
            int leftX = x - 1;
            int leftY = y;
            if (leftX == 0 && leftY == 0){
                memory[x][y] = 'L';
                return 'L';
            }
            if (field[leftX][leftY] != '*'){
                if (where_from(field, leftX, leftY, memory) != 'N'){
                    memory[x][y] = 'L';
                    return 'L';
                }
            }
        }
        if (y > 0){
            int upX = x;
            int upY = y - 1;
            if (upX == 0 && upY == 0){
                memory[x][y] = 'U';
                return 'U';
            }
            if (field[upX][upY] != '*'){
                if (where_from(field, upX, upY, memory) != 'N'){
                    memory[x][y] = 'U';
                    return 'U';
                }
            }
        }
        memory[x][y] = 'N';
        return 'N';
    }
    public static void addCactus (char [][] field, int x, int y){
        field[x][y] = '*';
    }
    public static void printField (char[][] field){
        for (int y = 0; y < N; y++){
            for (int x = 0; x < N; x++){
                System.out.print(field[x][y] + "  ");
            }
            System.out.println();
        }
    }
}
