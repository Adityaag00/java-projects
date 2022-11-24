package projectcomplexpattern;


public class ProjectComplexPattern {

    
    public static void main(String[] args) {
        
        System.out.println("***********");
        
        ProjectComplexPattern pcp = new ProjectComplexPattern();
        pcp.func(11, 10, 5);
        pcp.func(11, 4, 4);
        
        System.out.println("***********");
    }
    
    void func(int num,int num_of_star, int times) {
        int i=0,num_space=0,k=0;
        boolean check=false;
        
        if(num_of_star == 10)
            check=true;
        if(num_of_star == 4)
            check=false;

        for(i=0;i<times;i++) {
            num_space=num-num_of_star;
            
            for(int j=0;j<num_of_star/2+num_space;j++) {
                if(k<(num_of_star/2))
                    System.out.print("*");
                if(k>=(num_of_star/2))
                    System.out.print(" ");
                k++;
            }
            k=0;
            for(int t=0; t<(num_of_star/2);t++)
                System.out.print("*");
            System.out.println("");
            
            if(check)
                num_of_star-=2;
            if(!check)
                num_of_star+=2;
            
        }
    }
    
}
