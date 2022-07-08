package edu.calpoly.csc305.lab1a;

class Example
{
  private static final String NAME = "Eric";
  private int[] nums = {1,2,3};

  boolean sameName(String other)
  {
    return other.equals(NAME);
  }

  public int[] getNums()
  {
    return nums;
  }
}  
