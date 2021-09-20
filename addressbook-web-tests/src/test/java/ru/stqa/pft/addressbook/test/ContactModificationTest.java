package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().modifyContact();
    app.getContactHelper().fillContact(new ContactData("Contact", null, "Modified",
            null, null, null, null, null, null));
    app.getContactHelper().updateContactEdit();
    app.getNavigationHelper().gotoHomePage();
  }
}
