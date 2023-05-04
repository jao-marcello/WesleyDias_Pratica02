public class Dados {
    private String sap;
    private String bol;
    private String cam;
    private String cal;
    private String blus;
    
    public Dados(String sap, String bol, String cam, String cal, String blus) {
        this.sap = sap;
        this.bol = bol;
        this.cam = cam;
        this.cal = cal;
        this.blus = blus;
    }
    public String getSap() {
        return sap;
    }
    public void setSap(String sap) {
        this.sap = sap;
    }
    public String getBol() {
        return bol;
    }
    public void setBol(String bol) {
        this.bol = bol;
    }
    public String getCam() {
        return cam;
    }
    public void setCam(String cam) {
        this.cam = cam;
    }
    public String getCal() {
        return cal;
    }
    public void setCal(String cal) {
        this.cal = cal;
    }
    public String getBlus() {
        return blus;
    }
    public void setBlus(String blus) {
        this.blus = blus;
    }

    
}
