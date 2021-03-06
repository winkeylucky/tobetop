package arraylist;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author xuxin
 * @version v1.0
 * @project study
 * @package PACKAGE_NAME
 * @date 28 17:${MIMUTE}
 * @modified
 */
public class Test {
    public static void main(String[] args) {
        test();
        ArrayList<Person> list = new ArrayList<Person>(2);
        System.out.println("--------" + getArrayListCapacity(list));
        Person p1 = new Person("张三");
        Person p2 = new Person("李四");
        Person p3 = new Person("王五");
        LocalDate localDate = LocalDate.of(2019,1,1);
        System.out.println(localDate);

        System.out.println(list.size());
        list.add(p1);
        list.add(p2);
        System.out.println("--------" + getArrayListCapacity(list));
        list.add(p3);
        System.out.println("--------" + getArrayListCapacity(list));
        list.add(p1);
        System.out.println(list);
        System.out.println("--------" + getArrayListCapacity(list));
        list.remove(p1);
        System.out.println("--------" + getArrayListCapacity(list));
        System.out.println(list);
        list.trimToSize();
        System.out.println("--------" + getArrayListCapacity(list));
        list.clear();
        System.out.println("--------" + getArrayListCapacity(list));

    }

    public static int getArrayListCapacity(ArrayList list){
        Class clazz = list.getClass();
        try {
            Field f = clazz.getDeclaredField("elementData");

            f.setAccessible(true);
            Object[] o = (Object[]) f.get(list);
            return o.length;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return -1;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void test(){
        ArrayList a = new ArrayList();
        a.add("新");
        a.add("中");
        a.add("国");

        ArrayList b = new ArrayList(a);
    }



}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }
}