class TestPlant
{
   public static void main(String []args)
   
   {
      Plant mp=new Plant();
      String plantname=mp.name;
      mp.grow();
      String res=mp.absorbco2();
      System.out.println(plantname);
      System.out.println(res);
   }
   
}