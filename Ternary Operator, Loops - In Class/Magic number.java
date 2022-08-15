static int MagicNumber(int N){
   if (N>=79)
   {
      int a=0;
      while(true)
      {
        int firstnumber = N-a;
        int Secondnumber = N+a;
        if(abhi(firstnumber))
        return firstnumber;
        if(abhi(Secondnumber))
        return Secondnumber;
        a++;
      }
    }
     else
     {
    return 79;
     }
}

static boolean abhi(int b)
{
    while(b>0)
    {
       if(b% 10==7)
       {
           while(b>0)
           {
               if(b%10==9)
               {
                   break;
               }
               b=b/10;
           }
           break;
       }
        else if(b%10 ==9)
        {
       while(b>0)
        {
        if(b%10==7)
        {
            break;
        }
        b=b/10;
        }
       break;
       }
     b=b/10;
    }
    return (b>0);
}
