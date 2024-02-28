package Abstraction_practie;

abstract class suzuki
    {
        abstract void start();
    }
        class audi extends suzuki
        {
            @Override
            void start()
            {
                System.out.println("audi start with key");
            }
        }
            class BMW extends suzuki
            {
                @Override
                void start()
                {
                    System.out.println("BMW start with remote");
                }

                public static void main(String[] args)
                {
                    audi A=new audi();
                    A.start();
                    BMW B=new BMW();
                    B.start();
                }
            }
