import java.util.*;
public class Main {
    private static List<User> setToList(Set<User> Users){
        return new ArrayList<>(Users);
    }
    private static void removeUserById(Set<User> Users,int removeId){
        Iterator<User>iterator=Users.iterator();
        while(iterator.hasNext()){
            User user=iterator.next();
            if(user.getId()==removeId) {
                iterator.remove();
            }
        }
    }
    private static Map<String,Set<User>> setToMap(Set<User> userSet){
        Map<String,Set<User>>cityMap=new HashMap<>();
        for (User user:userSet) {
            String city=user.getCity();
            cityMap.computeIfAbsent(city,k->new HashSet<>()).add(user);
        }
        return cityMap;
    }
    public static void main(String[] args) {
        User u1=new User(001,"吴可凡","江西");
        User u2=new User(002,"庞宇豪","河南");
        User u3=new User(003,"刘嘉鑫","江西");
        User u4=new User(004,"大壮哥","黑龙江");
        User u5=new User(005,"小光","黑龙江");
        Set<User>Users=new HashSet<>();
        Users.add(u1);
        Users.add(u2);
        Users.add(u3);
        Users.add(u4);
        Users.add(u5);
    }
}