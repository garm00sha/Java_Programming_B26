package day31_arrays;

public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";
        String[] arr = zones.split(",");

        for (int i = 0; i < arr.length; i++) {

            String res = "Deploying " + app + " to " + arr[i] + "...\nDeployment completed for" + arr[i] + "\n";

            for(int j = 1; j < 4; j++) {
                if (arr[i].endsWith(j + "")) {
                    if (arr[i].contains("east") || arr[i].contains("west")) {
                        System.out.println(res);

                    }
                }
            }
        }
    }
}
