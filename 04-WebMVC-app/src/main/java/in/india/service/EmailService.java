package in.india.service;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendSimpleMail(String to, String subject, String content) {
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(content);
            javaMailSender.send(message);
            System.out.println("Email sent successfully");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMimeMail(String to, String subject, String content)  {
        try{
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            javaMailSender.send(mimeMessage);
            System.out.println("Email sent successfully");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}





/*
@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendSimpleEmail(String to, String subject, String text) {
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);
            javaMailSender.send(message);
            System.out.println("Email sent");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void sendMimeEmail(String to, String subject, String text) {
        try{
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(text, true);
            helper.addAttachment("Notes",new File("/Users/virk/Desktop/Person.cpp"));
            javaMailSender.send(mimeMessage);
            System.out.println("Email sent");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
*/
