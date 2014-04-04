import java.util.Date
import javax.mail.internet.InternetAddress

case class MailMeta(val subject: String, val date: Date, val sender: InternetAddress)
