
        for(int i = 1 ; i<2*n ; i++){

            int col = i>n ? 2*n-i: i ;

            for(int s = 1 ; s <= n-col ; s++){
                System.out.print(" ");
            }

            for( int j = 1 ; j<= col ; j++ ){
            System.out.print("* "); 
            }

            System.out.println();
        }