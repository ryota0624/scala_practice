import org.scalatest.FunSuite

/**
  * Created by ryota on 2016/11/08.
  */

class ContactSuite extends FunSuite {
  test("contact have only email") {
    val email = "hoge@gmail.com"
    val contact = Contact(email, None, None)
    assert(contact.toString() == f"Contact: email: ${email}")
  }

  test("contact hav fax") {
    val email = "hoge@gmail.com"
    val tel = "000999900"
    val contact = Contact(email, Some(tel), None)
    assert(contact.toString() == f"Contact: email: ${email} Tel: ${tel}")
  }

  test("contact hav tel") {
    val email = "hoge@gmail.com"
    val fax = "fax"
    val contact = Contact(email, None, Some(fax))
    assert(contact.toString() == f"Contact: email: ${email} Fax: ${fax}")
  }

  test("contact hav all") {
    val email = "hoge@gmail.com"
    val tel = "000999900"
    val fax = "fax"
    val contact = Contact(email, Some(tel), Some(fax))
    assert(contact.toString() == f"Contact: email: ${email} Tel: ${tel} Fax: ${fax}")
  }
}
