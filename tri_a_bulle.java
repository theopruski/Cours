public class tri_a_bulle {   
        public static void main(String[] args) {
                int Tab[] = {99, 45, 68, 18, 34, 26, 50, 8, 55, 10};
                
                System.out.print("Avant le tri : ");
                for (int n:Tab)
                System.out.print(n+" ");
                   Tab = tri_a_bulles(Tab);
                System.out.print("\nAprès le tri : ");
                for (int n:Tab)
                System.out.print(n+" ");
        }
          
        static int[] tri_a_bulles(int Tab[])
        {
                int temp;
                for(int i = Tab.length-1 ; i>=1 ; i--)
                {
                        for(int j = 0 ; j<i ; j++)
                        if(Tab[j] > Tab[j+1])
                        {
                                temp = Tab[j+1];
                                Tab[j+1]=Tab[j];
                                Tab[j]=temp;         
                        }
                }
                return Tab;
        }
}
