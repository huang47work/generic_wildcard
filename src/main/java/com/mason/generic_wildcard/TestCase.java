package com.mason.generic_wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang_sq on 2017/8/10.
 * 关键的是生产者--只提供出来 那么就用用? extends XXX 能保证出来的一定是xxx的子类 不能添加进去
 *        消费者--只保证能添加，读取出来是什么类型不保证， ？ super AAA 只要是AAA的超类就能添加进去
 *
 *
 */
public class TestCase {

    public static void main(String[] args) {
        Manager mgr1 = new Manager("Jack", 10000.99);
        Manager mgr2 = new Manager("Tom", 10001.01);
        Pair<Manager> managerPair = new Pair<Manager>(mgr1, mgr2);
        Pair.printEmployeeBoddies(managerPair);

        System.out.println("============================");

        Employee demoEmployee = new Employee("huangsiqian", 188888);
        Manager manager = new Manager("lala", 789);
        President president2 = new President("lululu", 456);
        Pair<Employee> pair1 = new Pair<>(demoEmployee, president2);
        System.out.println(Pair.mergeDepartmentMember(pair1));
    }


}
