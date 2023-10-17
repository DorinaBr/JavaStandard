package session13_recap.challenges.oop.library_management_sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

  public String addNewMember(String firstName, String lastName, Address address, ContactDetails contactDetails){
      return MemberManager.addNewMember(firstName,lastName,address,contactDetails).getId();
  }
}
