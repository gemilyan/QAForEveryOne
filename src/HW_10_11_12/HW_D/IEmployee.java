package HW_10_11_12.HW_D;

    /* Задача №1 D
    Необходимо создать класс Employee со следующими методами:
    getBaseSalary - получить базовую ставку
    setBaseSalary
    getName - получить имя
    setName
    getSalary - получить зарплату

    Задача №2 HW_12
    Необходимо реализовать задание из Tasks#D, но класс Employee
    заменить на интерфейс IEmployee и добавить IManager, все параметры
    утилитарных методов сделать типа IEmployee и IManager соответственно. */

public interface IEmployee {
    String getName();
    int getBaseSalary();
    int getSalary();
}
