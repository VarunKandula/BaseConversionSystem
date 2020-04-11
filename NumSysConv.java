class NumSysConv
{
    private String usrNum;
    private int usrBase;
    private int newBase;
    String newNum = "";
    String ans = "";
    ArrayList<Integer> numElem = new ArrayList<>();
    int TenNum = 0;
    
    public String ConverToRadix(ArrayList<String> w)
    {
        newNum = "";
        usrNum = w.get(0);
        usrBase = Integer.parseInt(w.get(1));
        newBase = Integer.parseInt(w.get(2));
        
        if(usrBase == 10)
        {
            convFromTen(Integer.parseInt(usrNum));
        }
        else
        {
            if(newBase == 10)
            {
                convToTen();
                newNum = "";
                newNum = newNum + TenNum;
            }
            else
            {
            convToTen();
            convFromTen(TenNum);
            }
        }
        return newNum;
    }
    
    public int convToTen()
    {
        for(int x = 0; x < usrNum.length(); x++)
        {
            if('A' <= usrNum.charAt(x) && usrNum.charAt(x) <= 'Z')
            {
                numElem.add((usrNum.charAt(x)-55));
            }//ltr to int
            else if('a' <= usrNum.charAt(x) && usrNum.charAt(x) <= 'z')
            {
                numElem.add((usrNum.charAt(x)-87));
            }//ltr to int
            else if('0' <= usrNum.charAt(x) && usrNum.charAt(x) <= '9')
            {
                numElem.add(usrNum.charAt(x) - 48);
            }//character to Integer
        }//end conversion of char to Integer
        for(int i = 0; i < numElem.size(); i++)
        {
            TenNum = TenNum + (int)(Math.pow(usrBase,numElem.size()- 1 - i) * numElem.get(i));
        }//end conversion to base Ten
        return TenNum;
    }//end convToTwo
    
    public void convFromTen(int x)
    {
        int number = x;
        int remainder = 0;
        while(number != 0)
        {
            remainder = number % newBase;
            if(remainder > 9)
            {
                ans = ans + (char)(remainder + 55);
            }
            else
            {
                ans = ans + remainder;
            }
            number = number/newBase;
            
        }//End Conversion
        
        for(int z = ans.length() - 1; z >= 0; z--)
          {
          newNum = newNum + ans.charAt(z);
          }//end reversal of Number
       
    }//end convFromTen
}//endNumSysConv
