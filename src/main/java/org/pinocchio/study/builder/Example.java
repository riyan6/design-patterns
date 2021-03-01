package org.pinocchio.study.builder;

import org.pinocchio.study.builder.lombok_example.Person;
import org.pinocchio.study.builder.lombok_example.User;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: lombok example
 */
public class Example {

    public static void main(String[] args) {
        // 普通链式调用
        Person person = new Person()
                .setAddress("fulan")
                .setAge(20)
                .setName("米狗子");
        System.out.println(person + "\n");
        // lombok 方式
        User user = User.builder().userName("u123").passWord("p666").build();
        System.out.println(user.toString() + "\n");

        System.out.println(User.builder().userName("u321").passWord("p999").toString());
    }



}
