import scala.swing._
import java.util.Date
import scala.collection.mutable.ListBuffer
import javax.mail.internet.InternetAddress

object LittleMailer extends SimpleSwingApplication {
  
  def top = new MainFrame {
    title = "Simple mail client"
    contents = mailList
    menuBar = new MenuBar {
      contents += new Menu("File") {
        contents += new MenuItem("Settings")
        contents += new Separator
        contents += new MenuItem(Action("Quit") { quit })
      }
      contents += new Menu("Help") {
        contents += new MenuItem(Action("About") {
          Dialog.showMessage(this, "Little Mailer\nMike Limanskiy, 2014", "About...")
        })
      }
    }
  }

  val mailList = new ListView[MailMeta]() {
    listData = ListBuffer(MailMeta("test", new Date(), new InternetAddress("vasia@mail.ru", "Vasiliy")))
  }
}
