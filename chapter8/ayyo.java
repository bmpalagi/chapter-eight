public class ayyo
{
    public ayyo()
    {
    }
    
    public int collect(int monataryGoal)
    {
        System.out.println(monataryGoal);
        
        if (monataryGoal == 1)
            return 0;
        
            
            
        return (1 + collect(monataryGoal/10) +
                1 + collect(monataryGoal/10) +
                1 + collect(monataryGoal/10) +
                1 + collect(monataryGoal/10) +
                1 + collect(monataryGoal/10) +
                1 + collect(monataryGoal/10) +
                1 + collect(monataryGoal/10) +
                1 + collect(monataryGoal/10) +
                1 + collect(monataryGoal/10) +
                1 + collect(monataryGoal/10)
                );
    }
    
    
}
    /*
    
    
    public void billChoice(int price)
    {
        hundreds(price);
    }
    
    public String hundreds(int price)
    {
        int x = (price/100);
        
        for (int i = 0; i<=x; i++)
        {
            System.out.println(i + " hundreds" + twenties(price - (100*i)));
            
        }
        
        return "";
    }
    
    public String twenties(int price)
    {
        int x = (price/20);
        
        for (int i = 0; i<=x; i++)
        {
            System.out.println(i + " twenties" + tens(price - (20*i)));
            
        }
        
        return "";
    }
    
    public String tens(int price)
    {
        int x = (price/10);
        
        for (int i = 0; i<=x; i++)
        {
            System.out.println(i + " tens" + fives(price - (10*i)));
            
        }
        
        return "";
    }
    
    public String fives(int price)
    {
        int x = (price/5);
        
        for (int i = 0; i<=x; i++)
        {
            System.out.println(i + " fives" + ones(price - (5*i)));
            
        }
        
        return "";
    }
    
    public String ones(int price)
    {
        System.out.println (price + " ones");
        
        return "";
    }
}
    /*
    public String billChoice(int price)
    {
        return hundreds(price);
    }
    
    public String hundreds(int price)
    {
        int x = (price / 100);
        
        for (int i = 0; i<=x; i++)
        {
            return (i + " hundreds" + twenties(price - (100*i)));
        }
        
        return "";
    }
    
    public String twenties(int price)
    {
        int x = (price / 20);
        
        for (int i = 0; i<=x;i++)
        {
            return (i + " twenties" + tens(price - (20*i)));
        }
        
        return "";
    }
    
    public String tens(int price)
    {
        int x = (price / 10);
        
        for (int i = 0; i<=x;i++)
        {
            return (i + " tens" + fives(price - (10*i)));
        }
        
        return "";
    }
    
    public String fives(int price)
    {
        int x = (price / 5);
        
        for (int i = 0; i<=x;i++)
        {
            return (i + " fives" + ones(price - (5*i)));
        }
        
        return "";
    }
    
    public String ones(int price)
    {
        return (price + " ones");
    }
    
}

/*
if (price > 100)
            return ("100 Dollar Bill + " + billChoice(price - 100));
        else if (price > 20)
            return ("20 Dollar Bill + " + billChoice(price - 20));
        else if (price > 10)
            return ("10 Dollar Bill + " + billChoice(price - 10));
        else if (price > 5)
            return ("5 Dollar Bill + " + billChoice(price - 5));
        else if (price > 1)
            return ("1 Dollar Bill + " + billChoice(price - 1));
        else
            return ("1 Dollar Bill");
            */