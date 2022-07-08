package edu.calpoly.csc305.lab1a;

class Driver {
  public static void main(String [] args)
  {
    Example ex = new Example();
    int total = 0;

    while (total < 10)
    {
      int num = ex.getNums()[0];
      total += num;
    }

    System.out.println(total);
    System.out.println(ex.sameName("Eric"));
  }
}

