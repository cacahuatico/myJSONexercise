

public class MyJSON {


    private String ip;
    private String hostname;
    private String city;
    private String region;
    private String country;
    private String loc;
    private String org;
    private String postal;
    private String timezone;
    private String readme;


    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getHostname() {
        return hostname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getLoc() {
        return loc;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getOrg() {
        return org;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getPostal() {
        return postal;
    }

    public void setReadme(String readme) {
        this.readme = readme;
    }

    public String getReadme() {
        return readme;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "MyJSON { \n" +
                "'ip':" + "'" +  ip + "',\n" +
                "'hostname':" +  "'" + hostname +  "',\n"  +
                "'city':" + "'" + city + "',\n" +
                "'region':" + "'" + region + "', \n" +
                "'country':" + "'" + country + "',\n" +
                "'loc':" + "'" + loc + "',\n" +
                "'org':" + "'" + org + "',\n" +
                "'postal': " + "'" + postal + "',\n" +
                "'timezone': " + "'" + timezone + "',\n" +
                "'readme':" + "'" + readme + "',\n" +
                '}';
    }
}
