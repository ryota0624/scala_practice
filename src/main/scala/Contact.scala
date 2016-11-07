/**
  * Created by ryota on 2016/11/08.
  */
case class Contact(email: String, tel: Option[String], fax: Option[String]) {
  override def toString() :String = {
    f"Contact: email: ${email} ${tel.map(str =>  "Tel: "+str).getOrElse("")} ${fax.map(str => "Fax: "+str).getOrElse("")}"
  }
}

