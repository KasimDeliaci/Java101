package Java101;
import java.util.Scanner;

public class Kullanici {
    public static void main(String[] args){
        String userName, password, answer, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Lütfen şifreyi giriniz ");
        password = input.nextLine();

        if(userName.equals("patika")){
            if(password.equals("java123")){
                System.out.println("Giriş Başarılı");
            }
            else{
                System.out.println("Hatalı Şİfre! Şİfrenizi sıfırlamak ister misiniz? evet/hayır ");
                answer = input.nextLine();
                if(answer.equals("evet")){
                    System.out.print("Yeni şifrenini giriniz: ");
                    newPassword = input.nextLine();
                    if(!newPassword.equals("java123")){
                        password = newPassword;
                        System.out.print("Şifre başarıyla değiştirildi: ");
                    }
                    else{
                        System.out.print("Aynı şifre! Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                }
                else{
                    System.out.print("Lütfen geçerli işlem yapın ");
                }

            }
        }
        else
            System.out.print("Hatalı kullanıcı adı!");
    }

}

