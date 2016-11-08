/**
  * Created by ryota on 2016/11/08.
  */

case class Contact(email: String, tel: Option[String], fax: Option[String]) {
  override def toString() :String = {
    val telStr = tel.map(str =>  " Tel: "+str).getOrElse("")
    val faxStr = fax.map(str => " Fax: "+str).getOrElse("")
    f"Contact: email: ${email}${telStr}${faxStr}"
  }
}

class ContactSpec  {

}