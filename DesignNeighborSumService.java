//https://leetcode.com/problems/design-neighbor-sum-service/?envType=problem-list-v2&envId=design
class NeighborSum {

    int[][] grid;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
    }
    
    public int adjacentSum(int value) {
        int soma = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                //Como existem poucas possibilidades a lógica fica mais fácil de entender cobrindo todos os casos.  
                if(grid[i][j] == value){    

                    try{
                        soma = (grid[i][j + 1] + grid[i][j -1] + grid[i + 1][j] + grid[i - 1][j]);
                    }catch(Exception a){

                        try{
                            soma = (grid[i][j -1] + grid[i + 1][j] + grid[i - 1][j]);
                        }catch(Exception b){

                            try{
                                soma = (grid[i][j + 1] + grid[i + 1][j] + grid[i - 1][j]);
                            }catch(Exception c){

                                try{
                                    soma = (grid[i][j + 1] + grid[i][j -1] + grid[i + 1][j]);
                                }catch(Exception d){

                                    try{
                                        soma = (grid[i][j + 1] + grid[i][j -1] + grid[i - 1][j]);
                                    }catch(Exception e){

                                        try{
                                            soma = (grid[i][j + 1] + grid[i + 1][j]);
                                        }catch(Exception f){
                                            
                                            try{
                                                soma = (grid[i][j - 1] + grid[i + 1][j]);
                                            }catch(Exception g){

                                                try{
                                                    soma = (grid[i][j + 1] + grid[i - 1][j]);
                                                }catch(Exception h){

                                                    try{
                                                        soma = (grid[i][j - 1] + grid[i - 1][j]);
                                                    }catch(Exception k){

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return soma;
    }
    
    public int diagonalSum(int value) {
        int soma = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){

                if(grid[i][j] == value){    

                    try{
                        soma = (grid[i + 1][j + 1] + grid[i + 1][j - 1] + grid[i - 1][j + 1] + grid[i - 1][j - 1]);
                    }catch(Exception a){

                        try{
                            soma = (grid[i - 1][j - 1] + grid[i + 1][j - 1]);
                        }catch(Exception b){

                            try{
                                soma = (grid[i - 1][j + 1] + grid[i + 1][j + 1]);
                            }catch(Exception c){

                                try{
                                    soma = (grid[i - 1][j + 1] + grid[i - 1][j - 1]);
                                }catch(Exception d){

                                    try{
                                        soma = (grid[i + 1][j + 1] + grid[i + 1][j - 1]);
                                    }catch(Exception e){

                                        try{
                                            soma = (grid[i - 1][j + 1]);
                                        }catch(Exception f){
                                            
                                            try{
                                                soma = (grid[i + 1][j - 1]);
                                            }catch(Exception g){

                                                try{
                                                    soma = (grid[i + 1][j + 1]);
                                                }catch(Exception h){

                                                    try{
                                                        soma = (grid[i - 1][j - 1]);
                                                    }catch(Exception k){
                                                        
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return soma;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
