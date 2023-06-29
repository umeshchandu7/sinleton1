public class singleton  {
    private static singleton instance;
    private int counter;
    private singleton()
    {
      counter = 0;
    }
    public static singleton getInstance()
        {
            if(instance==null)
            {
                instance = new singleton();
                return instance;
            }
            else
            {
                return instance;
            }
        }
        public void getConnect()
        {
            if(counter<3)
            {
                counter++;
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }

        }
}
