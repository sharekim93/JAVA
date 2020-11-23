package mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//1. Maven repository에서 다운로드
// https://mvnrepository.com/artifact/javax.mail/mail/1.4.7
//2. jar파일을 src 폴더에 넣고 BuildPath에 add함
//3. naver에 가서 SMTP를 설정해야함
/* POP 서버명 : pop.naver.comSMTP
	서버명 : smtp.naver.com
	POP 포트 : 995, 보안연결(SSL) 
	필요SMTP 포트 : 465, 보안 연결(SSL) 
	필요아이디 : sharekim93
	비밀번호 : 네이버 로그인 비밀번호
*/


public class MailNaver {
	public static void main(String[] args) {
		String subject = "메일제목";
		String content = "메일내용";
		String host = "smtp.naver.com";
		String user = "";//@naver.com까지 적기
		String password 	= "";

		String to ="cozizii-_-@naver.com";
		
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.trust", "smtp.naver.com");
		
		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user,password);
			}
		});
		System.out.println("1");
		try {
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(user));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		
		message.setSubject(subject);
		message.setText(content);
		System.out.println("2");
		Transport.send(message);
		System.out.println("3 Successfully!");
		}
		catch(AddressException e) {
			e.printStackTrace();
		}
		catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
