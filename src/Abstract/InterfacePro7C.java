package Abstract;

import Interface.InterfacePro7;

public class InterfacePro7C {
    protected class InerClass implements InterfacePro7 {

        @Override
        public void mesg()
        {
            System.out.println(" This is interface from other package"); 
        }
        public InerClass(){}
    }
    
}
