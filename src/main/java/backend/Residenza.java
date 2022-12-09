package backend;

public class Residenza {

    private String via, città, provincia;





    public Residenza(String via, String città, String provincia){
            this.via = via;
            this.città = città;
            this.provincia = provincia;

    }

    private boolean isFieldNull(String stringa) {
        if(stringa.equals(""))
            return false;
        else return true;
    }

    public Residenza(){}

    public boolean isCittàCheck(String città) {
        boolean cittàCheck=false;
        if(numberChecker(città) || !isFieldNull(città))
            cittàCheck=true;
        return cittàCheck;
    }

    public boolean isViaCheck(String via) {
        boolean viaCheck=false;
        if(!isFieldNull(via))
            viaCheck=true;
        return viaCheck;
    }

    @Override
    public String toString() {
        return via + ", " + città + ", " + provincia;
    }

    private boolean numberChecker(String string){
        return string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3") || string.contains("4") || string.contains("5") ||
                string.contains("6") || string.contains("7") || string.contains("8") || string.contains("9");
    }

    public String getVia() {
        return via;
    }

    public String getCittà() {
        return città;
    }

    public String getProvincia() {
        return provincia;
    }

}
