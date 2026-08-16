package org.prog.session6;

public class HW5 {
    public static void main(String[] args) {
        String[] emails = new String[]{
                "test@test.com",
                "ab@bcde.com",
                "fgh@.bheg",
                "kkl@@malinator.com",
                "kool.mail.com",
                "some@email.com"
        };
        for (int i = 0; i < emails.length; i++) {
            int at = emails[i].indexOf("@");
            String afterAt = emails[i].substring( at +1);

            if (at == emails[i].lastIndexOf("@") && at >= 3 && afterAt.indexOf(".") == afterAt.lastIndexOf(".") &&
                    afterAt.contains(".") && !emails[i].contains("@.") && !emails[i].contains(".@") && afterAt.length() >=5) {
                System.out.println(emails[i]);
            }
        }
    }
}




