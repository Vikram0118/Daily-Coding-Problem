// i actually never did a problem like this before 
// dont t=know ehat exactly i need to do 
// mey be people can solve this using tree or graph 
// let me just try

class Day27Easy {
    public static void main(String[] args) {
        String s = "([]][])";
        int length = s.length();
        boolean flag = false;

        for(int i=0; i<length; i++){
            char temp1 = s.charAt(i);
            char temp2 = ' '; 
            if(temp1 == '}' || temp1 ==  ']' || temp1 == ')'){
                continue;
            } else {
                  

                switch( temp1){
                    case '(' :
                        temp2 = ')';
                        break;
                    case '[' :
                        temp2 = ')';
                        break;
                    case '{' :
                        temp2 = '}';
                        break;
                    default : 
                        break;
                }
            }
            flag = false;
            for(int j=+1; j<length; j++){
                if(s.charAt(j) == temp2){
                    flag  = true;
                }
            }        
            if(flag  == false){
                System.out.println("THE GIVEN STRING IS NOT PERFECT");
                return;
            }
        }
        System.out.println("THE GIVEN STRING IS PERFECT");

        // the above code hold good fo this case when s = ([][]) but fails for ([][[]) ([]][]) 
        // whuich simple tells me that i need to have track of the unvisited nodes
    }
}