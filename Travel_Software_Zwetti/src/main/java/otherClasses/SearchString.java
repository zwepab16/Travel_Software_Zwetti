package GUIs;

import TableKlassen.SEARCHTYP;



public class SearchString {

    private String plz;
    private String countryCode;
    private String countryName;
    private SEARCHTYP searchType;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public SEARCHTYP getSearchType() {
        return searchType;
    }

    public void setSearchType(SEARCHTYP searchType) {
        this.searchType = searchType;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public SearchString(String plz, String countryCode, String countryName, SEARCHTYP searchType) {
        this.plz = plz;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.searchType = searchType;
    }
    public static void main(String[] args) {
        SearchString s=new SearchString("", "", "", SEARCHTYP.NAME);
        System.out.println(s.getSearchType().getAction());
    }

}
