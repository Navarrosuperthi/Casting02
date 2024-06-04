public class Casting02 {
    public static void main(String[] args) {
                
        //População mundial de hoje
        long currentWorldPop;
        currentWorldPop = 700-000-000-0;
        System.out.println("Current World Population: " +currentWorldPop);
        
        //População mundial em 1950,  Fonte: Nações Unidas Divisão Populacional  
        //2.52 Bilhões
        int africaPop   =   221_000_000;
        int asiaPop     = 1_402_000_000;
        int europePop   =   547_000_000;
        int americasPop =   339_000_000;
        int oceanaPop   =    13_000_000;
        System.out.println("World Population in 1950: " 
                +africaPop +asiaPop +europePop +americasPop +oceanaPop);
        
        //A população coerente da Asia é estimada a 60% da população mundial
        double percentAsia = 0.6;
        long currentAsiaPop = (long) (currentWorldPop * percentAsia);
        System.out.println("Current Asia Population: " +currentAsiaPop);      
       
    }  
}
