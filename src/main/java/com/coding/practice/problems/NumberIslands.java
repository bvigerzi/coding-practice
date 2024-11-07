package com.coding.practice.problems;

class NumberIslands {

    public int numIslands(char[][] grid) {
        int yMax = grid.length - 1;
        int xMax = grid[0].length - 1;
        int totalNumberIslands = 0;
        for(int y = 0; y <= yMax; y++) {
            for(int x = 0; x <= xMax; x++) {
                if(isLand(grid, x, y)) {
                    totalNumberIslands++;
                }
            }
        }
        return totalNumberIslands;
    }

    private boolean isLand(char[][] grid, int x, int y) {
        int yMax = grid.length - 1;
        int xMax = grid[0].length - 1;
        if(isNodeWater(grid, x, y)) {
            return false;
        }

        if(x == 0 && y == 0 && yMax == 0 && xMax == 0) {
            return !isNodeWater(grid, x, y);
        }

        grid[y][x] = '0'; // we have visited this node, so mark it as 0

        // if all surrounding nodes are water, return true
        if(x == 0 && y == 0) {
            if(checkDownIsWater(grid, x, y) && checkRightIsWater(grid, x, y)) {
                return true;
            }
        } else if(x == 0 && y == yMax) {
            if(checkUpIsWater(grid, x, y) && checkRightIsWater(grid, x, y)) {
                return true;
            }
        } else if(x == xMax && y == 0) {
            if(checkDownIsWater(grid, x, y) && checkLeftIsWater(grid, x, y)) {
                return true;
            }
        } else if(x == xMax && y == yMax) {
            if(checkUpIsWater(grid, x, y) && checkLeftIsWater(grid, x, y)) {
                return true;
            }
        } else if(x == 0) {
            if(checkUpIsWater(grid, x, y) && checkDownIsWater(grid, x, y) && checkRightIsWater(grid, x, y)) {
                return true;
            }
        } else if (x == xMax) {
            if(checkUpIsWater(grid, x, y) && checkDownIsWater(grid, x, y) && checkLeftIsWater(grid, x, y)) {
                return true;
            }
        } else if(y == 0) {
            if(checkDownIsWater(grid, x, y) && checkLeftIsWater(grid, x, y) && checkRightIsWater(grid, x, y)) {
                return true;
            }
        } else if (y == yMax) {
            if(checkUpIsWater(grid, x, y) && checkLeftIsWater(grid, x, y) && checkRightIsWater(grid, x,y)) {
                return true;
            }
        } else if(checkUpIsWater(grid, x, y) && checkDownIsWater(grid, x, y) && checkLeftIsWater(grid, x, y) && checkRightIsWater(grid, x, y)) {
            return true;
        }

        if(x == 0 && y == 0) {
            return checkDownIsLand(grid, x, y) || checkRightIsLand(grid, x, y);
        } else if(x == 0 && y == yMax) {
            return checkUpIsLand(grid, x, y) || checkRightIsLand(grid, x, y);
        } else if(x == xMax && y == 0) {
            return checkDownIsLand(grid, x, y) || checkLeftIsLand(grid, x, y);
        } else if(x == xMax && y == yMax) {
            return checkUpIsLand(grid, x, y) || checkLeftIsLand(grid, x, y);
        } else if(x == 0) {
            return checkUpIsLand(grid, x, y) || checkDownIsLand(grid, x, y) || checkRightIsLand(grid, x, y);
        } else if (x == xMax) {
            return checkUpIsLand(grid, x, y) || checkDownIsLand(grid, x, y) || checkLeftIsLand(grid, x, y);
        } else if(y == 0) {
            return checkDownIsLand(grid, x, y) || checkLeftIsLand(grid, x, y) || checkRightIsLand(grid, x, y);
        } else if (y == yMax) {
            return checkUpIsLand(grid, x, y) || checkLeftIsLand(grid, x, y) || checkRightIsLand(grid, x,y);
        }
        return checkUpIsLand(grid, x, y) || checkDownIsLand(grid, x, y) || checkLeftIsLand(grid, x, y) || checkRightIsLand(grid, x, y);
    }

    private boolean isNodeWater(char[][] grid, int x, int y) {
        return grid[y][x] == '0';
    }

    private boolean checkUpIsWater(char[][] grid, int x, int y) {
        return isNodeWater(grid, x, y-1);
    }

    private boolean checkDownIsWater(char[][] grid, int x, int y) {
        return isNodeWater(grid, x, y+1);
    }

    private boolean checkLeftIsWater(char[][] grid, int x, int y) {
        return isNodeWater(grid, x-1, y);
    }

    private boolean checkRightIsWater(char[][] grid, int x, int y) {
        return isNodeWater(grid, x+1, y);
    }

    private boolean checkUpIsLand(char[][] grid, int x, int y) {
        return isLand(grid, x, y-1);
    }

    private boolean checkDownIsLand(char[][] grid, int x, int y) {
        return isLand(grid, x, y+1);
    }

    private boolean checkLeftIsLand(char[][] grid, int x, int y) {
        return isLand(grid, x-1, y);
    }

    private boolean checkRightIsLand(char[][] grid, int x, int y) {
        return isLand(grid, x+1, y);
    }
}