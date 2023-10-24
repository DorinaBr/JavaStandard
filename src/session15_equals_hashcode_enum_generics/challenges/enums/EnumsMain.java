package session15_equals_hashcode_enum_generics.challenges.enums;

public class EnumsMain {

    public static void main(String[] args) {
        printEnumValues();
    }

    public static void printEnumValues(){
        for(LightColor color : LightColor.values()){
            System.out.println(color + " " + color.informations());
        }
    }
}
