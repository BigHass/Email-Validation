import java.util.Scanner;

public class Solution {
    public static void checkEmail(String[] emails){

        String domain_name = "@asu.edu.jo";
        int count_invalid = 0;
        int count_valid = 0;

        for(String email : emails){
            String email_domain_name="";
            int indexOfAt=email.indexOf('@');
            if(email.indexOf('@')!=-1){
                email_domain_name=email.substring(indexOfAt,email.length());
                if(email_domain_name.equals(domain_name)){

                    System.out.println(email+ " is valid and its domain name is "+email_domain_name);
                    count_valid++;

                }
                else{
                    count_invalid++;
                }

            }
            else {
                count_invalid++;
            }
        }

        System.out.println("number of invalid emails is "+count_invalid);
        System.out.println("number of valid emails is "+ count_valid);

    }
    public static void main(String[] args) {

        /*
        input from user:

        Scanner s = new Scanner(System.in);
        String[] emails = new String[5];

        System.out.println("Please enter 5 emails: ");
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < 0;){

            emails[i] = s1.nextLine();


        }
        */

        //for testing
        String [] emails = {"021335@asu.edu.jo","2021568@asu.edu.jo","2021457@asu.edujo", "2021698@asuedujo","2022299asu.edu.jo" };
        checkEmail(emails);
    }
}
