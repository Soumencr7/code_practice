package Abstraction_practie;

abstract class Vehicle
    {
        abstract void start();
    }
        class car extends Vehicle
        {
            @Override
            void start()
            {
                System.out.println("car start with key");
            }
        }
            class scooter extends Vehicle
            {
                @Override
                void start()
                {
                    System.out.println("scooter start with kick");
                }

                public static void main(String[] args) {
                    car c=new car();
                    c.start();
                    scooter s=new scooter();
                    s.start();
                }
            }
