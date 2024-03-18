class Review {
    public static void main(String[] args) {
        System.out.println("\nCard width : "+Card.width);
        System.out.println("Card height : "+Card.height);
        
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.num = 9;
        
        Card c2 = new Card();
        c2.kind = "Diamond";
        c2.num = 3;

        System.out.println("\nc1 kind : "+c1.kind+", num : "+c1.num+", size : ("+c1.width+", "+c1.height+")");
        System.out.println("c2 kind : "+c2.kind+", num : "+c2.num+", size : ("+c2.width+", "+c2.height+")");
        
        System.out.println("\n### c1의 size (50,80)으로 변경\n");
        c1.width = 50;
        c1.height =80;
        
        System.out.println("------------------ 변경 후 -----------------");
        System.out.println("c1 kind : "+c1.kind+", num : "+c1.num+", size : ("+c1.width+", "+c1.height+")");
        System.out.println("c2 kind : "+c2.kind+", num : "+c2.num+", size : ("+c2.width+", "+c2.height+")");
    
    }
    
}

class Card{
    String kind;
    int num;

    public static int width=100;
    public static int height=250;
}