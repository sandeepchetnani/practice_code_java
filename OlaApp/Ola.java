package OlaApp;

class Ola {
    private Cab cab;
    Cab getdetails(){
        return cab;

    }
    void bookCab(Cab cab){
        this.cab=cab;
        cab.thanks();
    }


    
}
