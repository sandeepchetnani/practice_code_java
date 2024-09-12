                                    class A{
                                        void add()
                                        {

                                            System.out.println("adding two nos");
                                        }

                                    }
                                    class B extends A{
                                        void add()
                                        {
                                            System.out.println("adding three nos");
                                        }

                                    }



                                    public class runtimep
                                    {
                                        public static void main(String[] args) {
                                        //B b=new B();
                                            A a=new B();
                                            a.add();

                                        }
                                    }