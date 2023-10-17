package session13_recap.challenges.oop.library_management_sys;

import java.util.HashMap;
import java.util.Map;

public class MemberManager {
    private static final Map<String, Member> members = new HashMap<>();

    public MemberManager() {
    }

    public static Map<String, Member> getMembers() {
        return members;
    }

    public static Member addNewMember(String firstName, String lastName, Address address, ContactDetails contactDetails) {
        Member member = new Member();
        member.setFirstName(firstName);
        member.setLastName(lastName);
        member.setAddress(address);
        member.setContactDetails(contactDetails);
        members.put(member.getId(), member);
        return member;
    }

    public static Member getMember(String memberId) {
        return members.get(memberId);
    }
}
