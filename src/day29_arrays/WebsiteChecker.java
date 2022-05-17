package day29_arrays;

public class WebsiteChecker {
    public static void main(String[] args) {
        String [] url ={"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};

        int com = 0 ;
        int org = 0 ;
        int edu = 0 ;
        int other = 0;

        for (int i = 0; i < url.length ; i++) {
            if(url[i].contains(".com")){
                com++;
            }else if(url[i].contains(".org")){
                org++;
            }else if (url[i].contains(".edu")) {
                edu++;
            } else { other++;
        }
    }
        System.out.println("url ending with .com "+ com);
        System.out.println("url ending with .org "+ org);
        System.out.println("url ending with .edu "+ edu);
        System.out.println("url ending with other than above "+ other);
}}
